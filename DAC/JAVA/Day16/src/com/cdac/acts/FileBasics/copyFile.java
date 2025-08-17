package com.cdac.acts.FileBasics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class copyFile {

	public static void main(String[] args) {

//Using try-catch with Resource = means writing file streams in a try block so that it will automatically closes file after read and write is done 
		
		try(FileReader reader = new FileReader("C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\Day16\\sample.txt");
				BufferedReader br = new BufferedReader(reader);

				FileWriter writer = new FileWriter("C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\Day16\\copySample.txt");
				BufferedWriter wr = new BufferedWriter(writer);
				PrintWriter pw = new PrintWriter(wr);
				){
			System.out.println("Copying File created Successfully!!!!");
			String text = "";
			while((text = br.readLine())!=null) {
				pw.println(text);
			}
			System.out.println("File Copied Successfully!!!");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!!!" +e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
