package com.cdac.acts.FileIOUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.cdac.acts.MobilePhone.MobilePhone;

public interface FileIOUtils {

	String fileName = "C:\\Users\\Shaik Mohd Suhail\\Desktop\\DAC COURSES\\Day18";
	String MOBILE_DATA_PATH = fileName + File.separator + "MobilePhone.dat";
	String ANDROID_PATH = fileName + File.separator + "Android.dat";
	String IOS_PATH = fileName + File.separator + "IOS.dat";
	
public static void saveMobileList(List<MobilePhone> mobileList) {
		
	File directory  = new File(fileName);
	if(!directory.exists()) {
		directory.mkdir(); // create a directory if doesn't exists
	}
	
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(MOBILE_DATA_PATH,true))){
			
			oos.writeObject(mobileList);
			
		} catch (FileNotFoundException e) {
			System.out.println("File not Found: "+e.getMessage());
		} catch (IOException e) {
			System.out.println("Error while writing into file: "+e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<MobilePhone> readMobilePhoneList(String fileName){
		
		List<MobilePhone> mobileList = new ArrayList<>();
		File file = new File(fileName);
		if(file.exists()) {
			try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(MOBILE_DATA_PATH))){

				mobileList = (List<MobilePhone>) ois.readObject();

			} catch (IOException | ClassNotFoundException e) {
				System.out.println("Error While Read from File"+e.getMessage());
			}
		}
		return mobileList;
	}
}