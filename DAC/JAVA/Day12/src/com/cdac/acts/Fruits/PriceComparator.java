package com.cdac.acts.Fruits;

import java.util.Comparator;

public class PriceComparator implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {
		return o1.getPrice().compareTo(o2.getPrice());
	}
	
}
