package com.epam.vvit;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConstructionApp{	
	
	static Scanner scan;
	public static double areaofHouse;
	public static int materialStandard;
	public static char automated;
	
	public ConstructionApp(){
		scan = new Scanner(System.in);
		try {
			System.out.println("Enter the area of house(in square ft.):");
			areaofHouse = scan.nextDouble();
			
			System.out.println("\nChoose material type\n1.Standard material\n2.Above standard material\n3.High standard material");
			materialStandard = scan.nextInt();
			if(materialStandard==3) {
				System.out.println("Need fully automated home(y/n)");
				automated = scan.next().charAt(0);
			}
		}
		catch(InputMismatchException e) {
			System.out.println("Error!!");
		}
		
		
	}
	
	public static void Calculate_Cost() {
		Construction_Cost cost_obj = new Construction_Cost();
		System.out.println(materialStandard);
		System.out.println(cost_obj.cal_cost(materialStandard, areaofHouse, automated));
		
	}
	
    public static void main( String[] args )
    {
    	new ConstructionApp();
    	Calculate_Cost();
    }
}
