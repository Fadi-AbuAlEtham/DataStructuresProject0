package com.datastructuresproject0;

public class Martyr {
	// Attributes of Martyr
	private String name;
	private int age;
	private String eventLocation;
	private String dateOfDeath;
	private char gender;

	// Default constructor
	public Martyr() {
	}

	// Constructor with parameters
	public Martyr(String name, int age, String eventLocation, String dateOfDeath, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.eventLocation = eventLocation;
		this.dateOfDeath = dateOfDeath;
		this.gender = gender;
	}

	// Getter method for retrieving the name
	public String getName() {
		return name;
	}

	// Setter method for setting the name
	public void setName(String name) {
		this.name = name;
	}

	// Getter method for retrieving the age
	public int getAge() {
		return age;
	}

	// Setter method for setting the age
	public void setAge(int age) {
		this.age = age;
	}

	// Getter method for retrieving the eventLocation
	public String getEventLocation() {
		return eventLocation;
	}

	// Setter method for setting the eventLocation
	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	// Getter method for retrieving the dateOfDeath
	public String getDateOfDeath() {
		return dateOfDeath;
	}

	// Setter method for setting the dateOfDeath
	public void setDateOfDeath(String dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	// Getter method for retrieving the gender
	public char getGender() {
		return gender;
	}

	// Setter method for setting the gender
	public void setGender(char gender) {
		this.gender = gender;
	}

	// Override toString method to provide a meaningful string representation of the
	// Martyr object
	@Override
	public String toString() {
		return "Martyr [name=" + name + ", age=" + age + ", eventLocation=" + eventLocation + ", dateOfDeath="
				+ dateOfDeath + ", gender=" + gender + "]";
	}

}
