package com.cdac.acts.MobilePhoneTester;

import java.util.List;
import java.util.Scanner;


import com.cdac.acts.PhoneOs;
import com.cdac.acts.FileIOUtil.FileIOUtils;
import com.cdac.acts.FilterUtil.FilterUtil;
import com.cdac.acts.MobilePhone.MobilePhone;

public class MobilePhoneTester {

	public static void main(String[] args) throws ClassNotFoundException {
		
//		1) Create MobilePhone  class with serialNo, brand, os, color, price, ram etc. Store in list and use partitionedBy method to separate Android  and IOS phones.
//		2) Use comparing and thenComparing methods to sort MobilePhones by color and weight
//		3)	Convert the list of MobilePhones in set using Collect method.
//		4)	Filter by every field
		
		Scanner sc = new Scanner(System.in);
		
		List<MobilePhone> mobileList = FileIOUtils.readMobilePhoneList(FileIOUtils.MOBILE_DATA_PATH);
		
		
		String menu = "************MobilePhone List********************"
						+"\n 1. Add MobilePhone"
						+"\n 2. Display All Phones"
						+"\n 3. Partition By Android and IOS"
						+"\n 4. Sort Color and OS by Comparator of Lambda"
						+"\n 5. Convert List into Set Collection"
						+"\n 6. Filter Each Field by Stream API"
						+"\n 7. Exit from program"
						+"\n************************************************";
		
		while(true)
		{
			System.out.println("\n"+menu);
			System.out.println("\nEnter your Choice");
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1:
				
				System.out.println("Enter Mobile Phone Serial No: ");
				String serialno = sc.nextLine();
				
				System.out.println("Enter Mobile Phone Brand Name: ");
				String brand = sc.nextLine();
				
				PhoneOs phoneOs = null;
				while(phoneOs == null) {
					System.out.println("Enter Mobile Phone OS Type(ANDROID or IOS): ");
					String os = sc.nextLine().toUpperCase();
					try {
						phoneOs = PhoneOs.valueOf(os);
					}catch(IllegalArgumentException e) {
						e.printStackTrace();
					}
				}
					
				
				System.out.println("Enter Mobile Phone color: ");
				String color = sc.nextLine();
				 Double price = 0.0;
				while (price <= 0) {
                    System.out.println("Enter Mobile Phone Price (more than 100): ");
                    price = sc.nextDouble();
                    if (price <= 0) {
                        System.out.println("Invalid Price! Please enter a positive value.");
                    }
                }
				
				Integer ram = 0;
				while (ram <= 0) {
                    System.out.println("Enter Mobile Phone Ram (GB, at least 1GB): ");
                    ram = sc.nextInt();
                    if (ram <= 0) {
                        System.out.println("Invalid RAM! Please enter a positive value greater than 0.");
                    }
                }
				sc.nextLine();				
				
				// Adding product into List
				boolean exists = mobileList.stream().anyMatch(m -> m.getSerialNo().equals(serialno));
				if (exists) {
				    System.out.println("A MobilePhone with this Serial No already exists!");
				} else {
				    mobileList.add(new MobilePhone(serialno, brand, phoneOs, color, price, ram));
				    System.out.println("Mobile Phone Record Added Successfully.");
				}
				
				break;
				
			case 2:
				System.out.println("\n**********************************");
				System.out.println("MobilePhone List..................");
				System.out.println("\n**********************************");
				for(MobilePhone list: mobileList)
				{
					System.out.println(list);
				}
				break;
				
			case 3:
				
				FilterUtil.partitionByOS(mobileList, FileIOUtils.MOBILE_DATA_PATH);
				break;
			
			case 4:
				FilterUtil.sortByColorAndOs(mobileList);
				break;
				
			case 5:
				FilterUtil.convertListToSet(mobileList);
				break;
				
			case 6:
				FilterUtil.filterByEachField(mobileList);
				break;
				
			case 7:
				FileIOUtils.saveMobileList(mobileList);
				sc.close();
				System.out.println("Data Saved Successfully.Exiting program.................");
				System.exit(0);
				break;
				
			default:
				System.out.println("Enter Valid Input!!!!!!!!!");	
			}
		}
	}

}
