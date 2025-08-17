package com.cdac.acts.FilterUtil;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.cdac.acts.PhoneOs;
import com.cdac.acts.FileIOUtil.FileIOUtils;
import com.cdac.acts.MobilePhone.MobilePhone;

public class FilterUtil {
	
	public static void partitionByOS(List<MobilePhone> mobileList, String fileName) {
		
		Map<Boolean, List<MobilePhone>> partitionOs = mobileList.stream()
				.collect(Collectors.partitioningBy(os -> os.getOs() == PhoneOs.ANDROID));
		List<MobilePhone> androidos = partitionOs.get(true);
		List<MobilePhone> iosOs = partitionOs.get(false);
		System.out.println("\n**********************************");
		System.out.println("Partitioned Data by OS...............");
		System.out.println("\n**********************************");
		
		writeToFile(androidos,FileIOUtils.ANDROID_PATH);
		System.out.println("\nAndroid Phones are:  ");
		androidos.forEach(System.out::println);
		
		
		
		writeToFile(iosOs,FileIOUtils.IOS_PATH);
		System.out.println("\nIOS Phones are:  ");
		iosOs.forEach(System.out::println);
		
	}

	private static void writeToFile(List<MobilePhone> mobileList, String fileName) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
			oos.writeObject(mobileList);
		} catch (FileNotFoundException e) {
			System.out.println("File not Found: "+e.getMessage());
		} catch (IOException e) {
			System.out.println("Error while writing into file: "+e.getMessage());
		}
		
	}

	public static void sortByColorAndOs(List<MobilePhone> mobileList) throws ClassNotFoundException {
		
			List<MobilePhone> sortedList = mobileList.stream()
										.sorted(Comparator.comparing(MobilePhone::getColor).thenComparing(MobilePhone::getOs))
										.collect(Collectors.toList());
					
					System.out.println("MobilePhones Sorted By Color and then By OS: ..............");
					sortedList.forEach(System.out::println);
	}

	public static void convertListToSet(List<MobilePhone> mobileList) throws ClassNotFoundException {
			
			Set<MobilePhone> set =  mobileList.stream()
					.collect(Collectors.toSet());
			
			System.out.println("Converted List into Set:............ ");
			set.forEach(System.out::println);
	
		
		
	}

	public static void filterByEachField(List<MobilePhone> mobileList) throws ClassNotFoundException {
			System.out.println("\n**********************************");
			System.out.println("\nMobilePhone Filetered By SerialNo:...........");
			System.out.println("\n**********************************");

			mobileList.stream()
			.filter(sno -> sno.getSerialNo().equals("SN101"))
			.forEach(System.out::println);
			
			System.out.println("\n**********************************");
			System.out.println("\nMobilePhone Filetered By Brand:...........");
			System.out.println("\n**********************************");

			mobileList.stream()
			.filter(brand -> brand.getBrand().equals("Iphone"))
			.forEach(System.out::println);
			
			System.out.println("\n**********************************");
			System.out.println("\nMobilePhone Filetered By OS:...........");
			System.out.println("\n**********************************");

			mobileList.stream()
			.filter(os -> os.getOs() == PhoneOs.IOS)
			.forEach(System.out::println);

			System.out.println("\n**********************************");
			System.out.println("\nMobilePhone Filetered By Color:...........");
			System.out.println("\n**********************************");

			mobileList.stream()
			.filter(color -> color.getColor().equalsIgnoreCase("black"))
			.forEach(System.out::println);

			System.out.println("\n**********************************");
			System.out.println("\nMobilePhone Filetered By Price:...........");
			System.out.println("\n**********************************");

			mobileList.stream()
			.filter(price -> price.getPrice()> 20000.00)
			.forEach(System.out::println);

			System.out.println("\n**********************************");
			System.out.println("\nMobilePhone Filetered By Ram:...........");
			System.out.println("\n**********************************");

			mobileList.stream()
			.filter(ram -> ram.getRam() > 4)
			.forEach(System.out::println);
	}
}
