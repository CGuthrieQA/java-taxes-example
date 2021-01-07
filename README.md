# Taxes

1. Create the tax class, it contains 2 methods.

	* Method 1 - which takes a salary and works out the percentage by which the salary will be taxed.

	* Method 2 - which works out the exact amount that the user will be taxed using a similar process to that in the first method. That amount should be returned and output to the console.

	* These 2 methods should be able to work independently, so it is fine in this case if some of the code is repeated.*

2. The salaries are taxed as below:

	* 0 - 14,999 : 0% tax
	* 15,000 - 19,999 : 10% tax
	* 20,000 - 29,999 : 15% tax
	* 30,000 - 44,999 : 20% tax
	* 45,000+ : 25% tax

3. Finally combine the 2 methods so that the second method utilizes the first method to return the correct result.

```java
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

``` 
