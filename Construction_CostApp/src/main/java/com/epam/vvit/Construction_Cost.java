package com.epam.vvit;

public class Construction_Cost {
	
	public double cal_cost(int materialStandard, double areaofHouse, char automated) {
		// TODO Auto-generated method stub
		if(materialStandard==1) {
			return areaofHouse * 1200;
		}
		else if(materialStandard==2){
			return areaofHouse * 1500;
		}
		else if(materialStandard==3 && automated=='y'){
			return areaofHouse * 2500;
		}
		else
			return areaofHouse * 1800;
		
		
	}
}
