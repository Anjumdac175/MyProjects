package com.cdac.Pojo;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<CartItems> cartItems =  new ArrayList<CartItems>();
	
	public void addItems(Product product, int quantity) {
		for(CartItems items : cartItems) {
			if(items.getProduct().getProductId() == product.getProductId()) {
				items.setQuantity(items.getQuantity() + quantity);
				return;
			}
		}
		
	cartItems.add(new CartItems(product,quantity));
	
	}

	public double getTotalCartAmount() {
		
		double total = 0.0;
		for(CartItems items : cartItems) {
			total += items.getProduct().getPrice() * items.getQuantity();
		}
		
		return total;
	}
	
	public List<CartItems> allItems(){
		return cartItems;
	}
	
}
