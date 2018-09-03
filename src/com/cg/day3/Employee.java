package com.cg.day3;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double employeeHRA;
	private double employeePF;
	private static double PT = 200;
	private double basicSalary;
	private double grossSalary;
	private double medical;
	private double netSalary;

	public Employee() {

	}

	public Employee(int employeeID, String employeeName, double basicSalary, double medical) {
		this.employeeId = employeeID;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public double calculateNetSalary() {
		employeeHRA = (0.50 * basicSalary);
		employeePF = (0.12 * basicSalary);
		grossSalary = employeeHRA + basicSalary + medical;
		netSalary = grossSalary - (employeePF + PT);
		return netSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeHRA() {
		return employeeHRA;
	}

	public void setEmployeeHRA(double employeeHRA) {
		this.employeeHRA = employeeHRA;
	}

	public double getEmployeePF() {
		return employeePF;
	}

	public void setEmployeePF(double employeePF) {
		this.employeePF = employeePF;
	}

	public static double getPT() {
		return PT;
	}

	public static void setPT(double pT) {
		PT = pT;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public void displayEmployeeInformation() {
		System.out.println(
				"Employee Id : " + employeeId + "\nEmployee name: " + employeeName + "\nNet Salary: " + netSalary);
	}

}