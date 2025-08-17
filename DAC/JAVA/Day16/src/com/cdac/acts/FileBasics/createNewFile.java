package com.cdac.acts.FileBasics;

import java.io.File;
import java.io.IOException;

public class createNewFile {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\Day16\\sample.txt");
		try{
			if(!file.exists()) {
				file.createNewFile();
				System.out.println("File Created Successfully!!!!");
			} 
			else {
				System.out.println("File already Exists!!!");
			}
		}catch (IOException e) {
			System.out.println("File can't be created!!"+e.getMessage());
		}

	}
}
