package com.qa.main;

public class Runner {
	
	// percent rate taxed
	public static double percentTaxed(int cashMoney) {
		
		double percent = 0;
		
		if (cashMoney < 0) {
			System.out.println("Error cannot work with negative values.");
		} if (cashMoney < 14999) {
			percent = 0.0;
		} else if (cashMoney < 19999) {
			percent = 10.0;
		} else if (cashMoney < 29999) {
			percent = 15.0;
		} else if (cashMoney < 44999) {
			percent = 20.0;
		} else if (cashMoney >= 45000) {
			percent = 25.0;
		}
		
		return percent;
		
	}
	
	
	// total taxed
	public static double totalTaxed(int cashMoney) {

		double grubbyHands = percentTaxed(cashMoney);
		
		double totalTaxed = 0 ;
		
		if (grubbyHands == 0) {
			totalTaxed = 0;
		} else {
			totalTaxed = cashMoney*(grubbyHands/100);
		}
		System.out.println("From a total of " + cashMoney + " you will be taxed " + totalTaxed);
		return totalTaxed;
	}

	public static void main(String[] args) {
	
		totalTaxed(19000);

	}

}
