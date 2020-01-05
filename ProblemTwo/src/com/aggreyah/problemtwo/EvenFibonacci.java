package com.aggreyah.problemtwo;

public class EvenFibonacci {
	public static int fibonacci (int value) {
		int firstFib = 1;
		int secondFib = 2;
		if (value == 1)
			return 1;
		else if (value == 2)
			return 2;
		else
			return fibonacci(value - 1) + fibonacci(value - 2) ;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxFibValue = 4000000;
		int currentFibValue = 0;
		int i = 1;
		int sum = 0;
		while (currentFibValue <= maxFibValue) {
			currentFibValue = fibonacci(i);
			if (currentFibValue % 2 == 0)
				sum += currentFibValue;
			i ++;
		}
		System.out.println("Current sum: " + sum);
	}
}
