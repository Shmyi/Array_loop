/*  Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.
	Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
	The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5
*/
import java.util.Arrays;
import java.util.HashSet;
public class ConsecutiveElement {

	public static void main(String[] args) {
		
		int[] myArray = {49, 1, 3, 200, 2, 4, 70, 5};
		int[] consecutiveArray = new int[myArray.length];
		
		int i,j,k = 0;
		
		for (i = 0; i < myArray.length; i++) {
			for (j = 0; j< myArray.length; j++) {
				if ( myArray[j]-myArray[i] == 1) {
					consecutiveArray[k] = myArray[i] ;
							k++;
					}
				}
		}

		Arrays.sort(consecutiveArray);
		System.out.println("The consecutive Array is :");
		for (i = 0; i < k+1; i++) {
			if (i == k) {
			System.out.print(consecutiveArray[i]);
			}
			else
			System.out.print(consecutiveArray[i]+",");	
		}
		
		System.out.println("\nlength: " + (k+1));
	}

}
