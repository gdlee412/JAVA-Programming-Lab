//means that the class belongs to this package
//this package must be imported to be used in other classes
package com.example.lecture4;

public class Car {
	private String manufacturer;
	private int year;
	//composition: adding a new class inside one class
	//object carEngine came from the Engine class
	private Engine carEngine;
	
	public Car(String manufacturer, int year, int engineCapacity, int engineSerialNumber  ) {
		super();
		this.manufacturer = manufacturer;
		this.year = year;
		this.carEngine = new Engine(engineCapacity, engineSerialNumber);
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Engine getCarEngine() {
		return carEngine;
	}

	public void setCarEngine(Engine carEngine) {
		this.carEngine = carEngine;
	}
	
	
}
