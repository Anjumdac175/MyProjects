package com.cdac.acts.Printer.PrinterTester;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import com.cdac.acts.Printer.PrinterType;
import com.cdac.acts.Printer.Printer.Printer;
import com.cdac.acts.Printer.PrinterListSaver.PrinterListSaveFile;

public class PrinterTester {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String fileName = "C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\Day16\\Printers.dat";
		
		Map<String, Printer> printers = PrinterListSaveFile.loadPrinterFromFile(fileName);
		System.out.println("Printers Loaded Successfully..........");
		
		String menu = "***********PRINTERLIST**********************"+
				"\n 1. Add Printers"+
				"\n 2. Print All Printers"+
				"\n 3. Update Printer Price"+
				"\n 4. Exit from Program"+
				"************************";
		
		while(true) {
			
			System.out.println(menu);
			System.out.println("\nEnter Your Choice");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case 1:
				System.out.println("Enter Printer Serial NO: ");
				String serialno = sc.nextLine();
				
				System.out.println("Enter Printer Model NO: ");
				String model = sc.nextLine();
				
				System.out.println("Enter Printer Price: ");
				Double price = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Enter Type of the Printer: ");
				String type = sc.nextLine();
				PrinterType printertype = PrinterType.valueOf(type);
				
				System.out.println("Enter Printer Manufactured Year: ");
				String manyear = sc.nextLine();
				LocalDate yearofManufacture = LocalDate.parse(manyear, format);
			
				printers.put(serialno, new Printer(serialno,model,price,printertype,yearofManufacture));
				System.out.println("Printer Record Saved Successfully");
				break;
			
			case 2:
				System.out.println("Loaded Printers are: ");
				printers.values().forEach(System.out::println);
				break;
			
			case 3:	
				System.out.println("Enter Serial No to Update Price: ");
				String newserial = sc.nextLine();
				if (printers.containsKey(newserial)) {
					System.out.print("Enter New Price: ");
					double newPrice = sc.nextDouble();
					printers.get(newserial).setPrice(newPrice);
					System.out.println("Price Updated....");
				} else {
					System.out.println("Printer not found.....");
				}
				break;
			
			case 4:
				sc.close();
				System.out.println("Exit Successfully");
				System.exit(0);
			default:
				System.out.println("Enter valid Input........");
			}
		}		
	}

}
