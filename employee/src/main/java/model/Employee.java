package model;

public class Employee {
	
	private String Name;

	private double monthlySalary;
	
	private int age;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String name) {
		this.Name = name;
	}
	public Employee(){
	
	}
	
	
	
}
