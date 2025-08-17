package com.cdac.acts.Printer.PrinterTester;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cdac.acts.Printer.PrinterType;
import com.cdac.acts.Printer.Printer.Printer;
import com.cdac.acts.Printer.PrinterListSaver.PrinterListSaveFile;

public class PrintersSavingTester {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String fileName = "C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\Day16\\Printers.dat";
		
		Map<String, Printer> printers = new HashMap<>();
		
		printers.put("SN100", new Printer("SN100","HP-M200",5500.00,PrinterType.LASER,LocalDate.parse("12-08-1990", format)));
		printers.put("SN200", new Printer("SN200","CANON-PIXMA",6500.00,PrinterType.INKJET,LocalDate.parse("22-10-1980", format)));
		printers.put("SN300", new Printer("SN300","EPSON-DOT",4100.00,PrinterType.DOTMATRIX,LocalDate.parse("18-09-2000", format)));
		printers.put("SN400", new Printer("SN400","HP-LaserJet-1020",8000.00,PrinterType.LASER,LocalDate.parse("20-02-2008", format)));
		
		PrinterListSaveFile.savePrinter(printers,fileName);
		System.out.println("Printer Record Saved Successfully");
		
		Map<String, Printer> loadFromFile = PrinterListSaveFile.loadPrinterFromFile(fileName);
		System.out.println("Loaded Printers are: ");
		loadFromFile.values().forEach(System.out::println);
		
		sc.close();
	}

}
