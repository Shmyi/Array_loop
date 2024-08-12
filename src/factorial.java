import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0;
		int factorial = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input number: ");
		number = scanner.nextInt();
		scanner.nextLine();
		factorial = number;
		while (number > 1) {
			factorial = factorial*(number-1);
			number--;
		}
		System.out.println("number! = :"+ factorial);
		
		double[] values = {1,2,3,4,5,6,7};
		double total = 0;
		for (double element : values)
		{
		 total = total + element;
		}
		double average = 0;
		if (values.length > 0) { average = total / values.length; }
		System.out.println("average = "+ average+"\ntotal = "+total);
	}

//		public static void main2(String[] args) {
//
//			Scanner scanner = new Scanner(System.in);
//	
//			int num ;
//			int i;  
//			double factorial;
//			String option = "yes";
//				
//			do {
//				System.out.println("Please input num:");
//				if (scanner.hasNextInt()) {
//					factorial = 1;
//					num = scanner.nextInt();
//					scanner.nextLine();
//					for (i = num; i >= 1 ; i--) {
//						factorial = factorial *(i);
//					}
//					System.out.println(factorial);
//					System.out.println("Do you want to exit? enter 'yes' to exit, anything to keep input");
//					option = scanner.nextLine();
//		
//				}
//				else {
//					System.out.println("invalid input, re-enter:");					
//				}
//			}
//			while(option.equals("yes"));
//		}			
}
