package com.cdac.acts.Printer.PrinterListSaver;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.cdac.acts.Printer.Printer.Printer;

public class PrinterListSaveFile {

	public static void savePrinter(Map<String, Printer> printers, String fileName) throws FileNotFoundException, IOException {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){			
			oos.writeObject(printers);
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public static Map<String, Printer> loadPrinterFromFile(String fileName) throws FileNotFoundException, IOException{
		
		File file = new File(fileName);
		if(!file.exists()) {
			return new HashMap<>();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
		
			return (Map<String, Printer>) ois.readObject();	
		} catch (ClassNotFoundException e) {
			throw new IOException("Failed to read printers from file",e);
		}
		
	}

}
