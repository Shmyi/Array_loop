public class PracticeExampleOne {
	public static void main(String[] args) {
		
		int index = 0;
		double number[] = {3.3, 5.5, 10.5, 8.8, 9.5, 10.1, 0.10, 8.0};
		double sum = 0.0;
		double avg = 0.0;
		
		for(index = 0; index < number.length; index++ ) {
			if (index == number.length - 1) {
			System.out.printf("%.2f\n",number[index]);
			}
			else {
			System.out.printf("%.2f, ",number[index]);
			}
			sum +=number[index];
		}
		avg = sum/number.length;
		System.out.println("Array Size:"+ number.length);
		System.out.printf("Sum is: %.2f\n", sum);
		System.out.printf("Avg is: %.2f\n", avg);
		System.out.println("Program by Yi Chen");
	}
}
