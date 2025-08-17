package com.cdac.acts.FileBasics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readingFile {

	public static void main(String[] args) {

		try {
			FileReader reader = new FileReader("C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\Day16\\sample.txt");
			BufferedReader br = new BufferedReader(reader);
			
			//BufferedReader br = new BufferedReader(new FilReader("C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\D/+ay16\\sample.txt");
			
			String text = "";
			while((text = br.readLine()) != null) {
				System.out.println(text);
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found "+e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
