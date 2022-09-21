package com.example.lecture4;

public class TestCar {

	public static void main(String[] args) {
		Car KiaCar = new Car("Kia", 2020, 2000, 123456789);
		
		System.out.println(KiaCar.getManufacturer());
		System.out.println(KiaCar.getYear());
		System.out.println(KiaCar.getCarEngine());
	}

}
