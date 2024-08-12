/*
 * CST8116 Array Practice Example Two Sample Solution
 * (c) Copyright 2021 Algonquin College, all rights reserved.
 */

/*
 * This class runs the program, demonstrating the assigned task.
 */
public class ArrayPracticeExampleTwo {
	/*
	 * Entry point for the application
	 * Uses a for loop to find min and max in array of int[] with values 
	 * 3, 2, 3, 4, 1, 5, 4, 3, 2, 3
	 * The min and max values are output after the loop.
	 */
	public static void main(String[] args) {

		// small array size, use initializer list
		int[] numbers = {3, 2, 3, 4, 1, 5, 4, 3, 2, 3};
		int min = numbers[0]; // set to first value in array
		int max = numbers[0]; // set to first value in array
		
//		for(int index = 0; index < numbers.length; index++) {
//			System.out.print(numbers[index] + " ");
//			if(numbers[index] < min) {
//				min = numbers[index];
//			}
//			else if(numbers[index] > max) {
//				max = numbers[index];
//			}
//			// else equals but no action needed
//		}
		for (int num : numbers) {
			System.out.print(num + " ");
			if(num < min) {
				min = num;
			}
			else if(num > max) {
				max = num;
			}
			// else equals but no action needed
		}
		System.out.println(); // whitespace after loop outputs
		System.out.println("min is: " + min);
		System.out.println("max is: " + max);
		System.out.println("Program by Professor Stanley Pieda");
	}
}
