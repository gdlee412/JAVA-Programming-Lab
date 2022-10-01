
public class Employee {
	// the required fields
	// employee's name
	public String employeeName;
	// employee's salary
	public double employeeSalary;
	// tax from salary
	public double salaryTax;
	// insurance
	public double insurance;

	// constructor initializing name and salary
	public Employee(String name, double salary) {
		this.employeeName = name;
		this.employeeSalary = salary;
		// set the tax and insurance values using salary
		setTax(salary);
		setInsurance(salary);
		// then use getter methods to initialize these values
		this.salaryTax = getTax();
		this.insurance = getInsurance();
	}

	// getter and setter methods for the fields
	public String getName() {
		return employeeName;
	}

	public void setName(String name) {
		this.employeeName = name;
	}

	public double getSalary() {
		return employeeSalary;
	}

	public void setSalary(double salary) {
		this.employeeSalary = salary;
	}

	// getter and setter for tax and insurance is calculated from salary
	// therefore input is salary
	public double getTax() {
		return salaryTax;
	}

	public void setTax(double salary) {
		// tax is 8.8% of salary
		this.salaryTax = salary * 0.088;
	}

	public double getInsurance() {
		return insurance;
	}

	public void setInsurance(double salary) {
		// insurance is 6.5% of salary
		this.insurance = salary * 0.065;
	}

	// method to increase salary given the salary increase percentage
	public void increaseSalary(double salaryIncreasePercentage) {
		this.employeeSalary += employeeSalary * salaryIncreasePercentage;
		// update tax and insurance values
		setTax(employeeSalary);
		setInsurance(employeeSalary);
	}

	// getInformation method to print out information
	public void getInformation() {
		// print information with given format
		System.out.println("=======================================\n" + "Employee Info\n" + "Name: "
				+ this.employeeName + "\nSalary: " + this.employeeSalary + "\nTax: " + this.salaryTax + "\nInsurance: "
				+ this.insurance);
	}

}
