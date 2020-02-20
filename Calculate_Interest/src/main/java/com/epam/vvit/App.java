package com.epam.vvit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App  {	
	static Scanner scan = new Scanner(System.in);
	static int choice;
	public static double principalAmount=0;
	public static double rateOfInterest;
	public static double timePeriod;
	public App() {
		System.out.println("----Interest Calculation----");
		try {
			System.out.println("Enter principle amount:");
		 	principalAmount=scan.nextDouble();
		 
			System.out.println("Enter Interest rate(%):");
		 	rateOfInterest=scan.nextDouble();
		 
			System.out.println("Enter period of time(in years):");
		 	timePeriod=scan.nextDouble();
		 	
		 	System.out.println("\nChoose the type of interest\n1.SimpleInterest\n2.CompoundInterest");
		 	choice = scan.nextInt();
		
		}
		catch(InputMismatchException e) {
			System.out.println("Error!! Try again with numeric..");
		}
		
	}
	
	public static void calculateInterest(int choice) {
		InterestCalculation int_cal = new InterestCalculation();
		if(choice==1) {
			System.out.println("Simple Interest:"+int_cal.simpleInterest(principalAmount, timePeriod, rateOfInterest));
		}
		else if(choice==2) {
			System.out.println("Compound Interest:"+int_cal.compoundInterest(principalAmount, timePeriod, rateOfInterest));
		}
		
	}
	
    public static void main( String[] args )
    {
    	new App();
    	calculateInterest(choice);
       
    }
}
