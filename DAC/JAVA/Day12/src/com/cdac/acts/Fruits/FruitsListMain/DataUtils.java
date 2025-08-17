package com.cdac.acts.Fruits.FruitsListMain;

import java.util.LinkedList;
import java.util.List;

import com.cdac.acts.Fruits.Fruits;

public class DataUtils {

	public static List<Fruits> getFruitsList(){
		List<Fruits> fruitList = new LinkedList<>();
		fruitList.add(new Fruits("Mango","Yellow",350,2));
		fruitList.add(new Fruits("Orange","Orange",250,4));
		fruitList.add(new Fruits("Avacado","Green",350,1));
		fruitList.add(new Fruits("Banana","White",120,12));
		fruitList.add(new Fruits("Apple","Red",350,1));
		fruitList.add(new Fruits("Guvava","LemonYellow",150,12));
		
		return fruitList;
	}
	
	
}
