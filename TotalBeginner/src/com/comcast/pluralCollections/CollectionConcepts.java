package com.comcast.pluralCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionConcepts {

	public static void main(String[] args) {
		
		Product door = new Product("Door", 30);
		Product window = new Product("Window", 25);
		Product floor = new Product("Floor", 65);
		Product knob = new Product("Door Knob", 2);
		
		Collection <Product> products = new ArrayList<>();
		products.add(door);
		products.add(window);
		products.add(floor);
		products.add(knob);
		
		System.out.println(door);
		System.out.println("----------------");
		System.out.println(products);
		
		System.out.println("----- For Each -----------");
		for ( Product i : products ) {
			System.out.println(i.getName());
		}
		
		System.out.println("----- Iteraor-----------");
	    final Iterator<Product> productIterator = products.iterator();
	    while (productIterator.hasNext()) {
	    	Product product = productIterator.next();
	    	if (product.getWeight() > 25) {
				System.out.println(product);
			}
	    	else {
	    		productIterator.remove();
	    	}
	    }
	    System.out.println("----- What's left -----------");
	    System.out.println(products);
 
	}

}
