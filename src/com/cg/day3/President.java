package com.cg.day3;

public class President extends Employee {

	private double kilometresTravelled;
	private double tourAllowance;
	private static double telephoneAllowance = 2000;

	public President() {
		super();
		// TODO Auto-generated constructor stub
	}

	public President(int employeeID, String employeeName, double basicSalary, double medical) {
		super(employeeID, employeeName, basicSalary, medical);
		// TODO Auto-generated constructor stub
	}

	public double getKilometresTravelled() {
		return kilometresTravelled;
	}

	public void setKilometresTravelled(double kilometresTravelled) {
		this.kilometresTravelled = kilometresTravelled;
	}

	public double getTourAllowance() {
		tourAllowance = 8 * kilometresTravelled;
		return tourAllowance;
	}

	public double getTelephoneAllowance() {
		return telephoneAllowance;
	}

}