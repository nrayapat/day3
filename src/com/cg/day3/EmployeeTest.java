package com.cg.day3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.day3.Employee;
import com.cg.day3.President;
import com.cg.day3.SalesManager;

class EmployeeTest {

	Employee employee;
	SalesManager salesmanager;
	President president;

	@BeforeEach
	void setUp() {
		employee = new Employee(1234, "Shubham Srivastava", 50000, 1000);
		salesmanager = new SalesManager(1234, "Shubham Srivastava", 50000, 1000);
		president = new President(1234, "Shubham Srivastava", 50000, 1000);
		president.setKilometresTravelled(2000);
	}

	@Test
	void testEmployee() {
		assertEquals(69800, employee.calculateNetSalary());
	}

	@Test
	void testSalesManagerAllowance() {
		assertEquals(4000,salesmanager.getCalculatePetrolAllowance(),1);
		assertEquals(6500,salesmanager.getCalculateFoodAllowance(),1);
		assertEquals(1500,salesmanager.getCalculateOtherAllowance(),1);		
	}
	
	@Test
	void testPresidentAllowance() {
		assertEquals(16000,president.getTourAllowance(),1);
		assertEquals(2000,president.getTelephoneAllowance(),1);	
	}
	@AfterEach
	void tearDown() {
		employee = null;
	}

}