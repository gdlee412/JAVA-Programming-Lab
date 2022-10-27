// something.something : using . creates more subfolders in the src file
package com.example.lecture4;

public class Engine {
	//easy format of code ctrl + shift + F
	private int engineCapacity;
	private int engineSerialNumber;
	
	public Engine(int engineCapacity, int engineSerialNumber)
	{
		this.engineCapacity = engineCapacity;
		this.engineSerialNumber = engineSerialNumber;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public int getEngineSerialNumber() {
		return engineSerialNumber;
	}

	public void setEngineSerialNumber(int engineSerialNumber) {
		this.engineSerialNumber = engineSerialNumber;
	}
	
	public String toString()
	{
		String info = "";
		
		info = "Capacity = " + this.engineCapacity + "\n"
				+ "Serial Number = " + this.engineSerialNumber + "\n"; 
		
		return info;
	}
}
