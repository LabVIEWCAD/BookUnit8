package cn.itcast.domain;

import java.time.LocalDate;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireday;
	
	public Employee(String n,double s,int year,int month,int day) {
		name=n;
		salary = s;
		hireday = LocalDate.of(year, month, day);
	}
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Employee(String name, double salary, LocalDate hireday) {
		super();
		this.name = name;
		this.salary = salary;
		this.hireday = hireday;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getHireday() {
		return hireday;
	}
	public void setHireday(LocalDate hireday) {
		this.hireday = hireday;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary*byPercent/100;
		salary+=raise;
	}
}
