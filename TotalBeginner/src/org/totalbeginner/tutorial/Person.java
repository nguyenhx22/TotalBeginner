package org.totalbeginner.tutorial;

public class Person {
	
	//Fields
	private String name;        //name of person
	private int maximumBooks;   //Max books person can check out
	
	// fake comment
	
	//Constructor
	public Person() {
		name = "unknown name";
		maximumBooks = 3;		
	}
	
	public String getName()	{
		return name;
	};
	
	public void setName(String anyName) {
		name = anyName;
	}
	
	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	public int getMaximumBooks() {
		return maximumBooks;
		}
	
	public String toString() {
		return this.getName() + " (" + this.getMaximumBooks() +
		" books)";
		}
}
