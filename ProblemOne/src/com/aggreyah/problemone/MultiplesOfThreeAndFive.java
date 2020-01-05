package com.aggreyah.problemone;

public class MultiplesOfThreeAndFive {
	//sum of multiples of three and five below this value
	int value;
	
	public MultiplesOfThreeAndFive() {
		this.value = 10;
	}
	
	public MultiplesOfThreeAndFive(int maxVal) {
		this.value = maxVal;
	}

	public static void main(String[] args) {
		MultiplesOfThreeAndFive myObject = new MultiplesOfThreeAndFive(1000);
		int sum = 0;
		for (int i = 1; i < myObject.value; i++) {
			if ((i % 3) == 0 || (i % 5) == 0 )
				sum += i;
		}
		System.out.println("Sum: " + sum);
	}

}
