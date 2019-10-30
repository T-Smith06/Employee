/*Class:		CSE 1323L/W01
Date:			10/30/2019  
Name:			Terrence Smith
Assgnmt Name:	IntArray   
Assignment#:	Lab 5B 
Resources: 		Introduction to Java Programming and Data Structures: Comp Version 11th e, 
 				Ch. 13 and 18. Abstraction - https://www.tutorialspoint.com/java/java_abstraction.htm*/

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Employee {
	String fName = "";
	String lName = "";
	String empID = "";
	String empAddr = "";
	String empCity = "";
	String empState = "";

	Employee(String fName, String lName, String empID, String empAddr, String empCity, String empState) {
		this.fName = fName;
		this.lName = lName;
		this.empID = empID;
		this.empAddr = empAddr;
		this.empCity = empCity;
		this.empState = empState;
	}
	
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpState() {
		return empState;
	}

	public void setEmpState(String empState) {
		this.empState = empState;
	}
	
	public abstract double earnings();
	
	public String toString() {
		return "First name: "+fName+"\nLast name: "+lName+"\nEmployee ID: "+empID+"\nEmployee street address: "+empAddr+
				"\nEmployee city: "+empCity+"\nEmployee state: "+empState;
	}

}

class HourlyEmployee extends Employee {
	double hourlyRate;
	double hoursWork = 0;

	HourlyEmployee(String fName, String lName, String empID, String empAddr, String empCity, String empState, 
			double hourlyRate, double hoursWork) {
		super(fName, lName, empID, empAddr, empCity, empState);
		this.hourlyRate = hourlyRate;
		this.hoursWork = hoursWork;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getHoursWork() {
		return hoursWork;
	}

	public void setHoursWork(double hoursWork) {
		this.hoursWork = hoursWork;
	}

	public double earnings() {
		double total = hourlyRate * hoursWork;
		return total;
	}
	
	public String toString() {
		return super.toString()+"\nHourly rate: "+ hourlyRate + "\nHours worked: " + hoursWork+"\nTotal earnings: $"+earnings()+"\n";
		
	}
}

class TestEmployee {
	public static void main(String[] args) {
		String fName = "";
		String lName = "";
		String empID = "";
		String empAddr = "";
		String empCity = "";
		String empState = "";
		double hourlyRate;
		double hoursWork = 0;
		
		for(int i=1; i<3; i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("Employee "+i);
			System.out.println("Enter first name: ");
			fName = input.nextLine();
			System.out.println("Enter last name: ");
			lName = input.nextLine();
			System.out.println("Enter employee ID: ");
			empID = input.nextLine();
			System.out.println("Enter home street address: ");
			empAddr = input.nextLine();
			System.out.println("Enter home city: ");
			empCity = input.nextLine();
			System.out.println("Enter home state: ");
			empState = input.nextLine();
			System.out.println("Enter hours worked: ");
			hoursWork = input.nextDouble();
			System.out.println("Enter hourly rate: ");
			hourlyRate = input.nextDouble();
			System.out.println();
			
			ArrayList<HourlyEmployee> hourlyEmp = new ArrayList<>();
			hourlyEmp.add(new HourlyEmployee(fName,lName,empID,empAddr,empCity,empState,hourlyRate,hoursWork));

			System.out.print(hourlyEmp.toString().replace("[","").replace("]",""));
			System.out.println();
		}
		
	}
}
