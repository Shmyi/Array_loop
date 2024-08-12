
public class PracticeExampleTwo {
	public static void main(String[] args) {
		
		int index = 0;
		int numbers[]= {3, 2, 3, 4, 1, 5, 4, 3, 2, 3};
		int max = numbers[0];
		int min = numbers[0];
		
		for (index = 0; index< numbers.length; index++) {
			if (numbers[index] > max) {
				max = numbers[index];
			}
			else if (numbers[index] < min) {
				min = numbers[index];
			}
			System.out.printf("number = %d%n", numbers[index]);
		}
		
		System.out.printf("\nMax= %s\nMin= %s\n",max,min);
		System.out.println("Program by Yi Chen");
	}
	
}