import java.util.Arrays; 

// Define a class named Exercise10.
public class Maxmin {
    
    // Declare static variables to store the maximum and minimum values.
    static int max;
    static int min;

    // Define a method to calculate the maximum and minimum values in the array.
    public static void max_min(int my_array[]) {
        // Initialize max and min with the first element of the array.
        max = my_array[0];
        min = my_array[0];
        int len = my_array.length;

        // Iterate through the array in pairs.
        for (int i = 0; i < len; i = i + 1) {
      
          if (my_array[i]< min){
            min = my_array[i];
          	}
          if (my_array[i] > max){
            max = my_array[i];
          	}
          }
        
    }
    // The main method where the program execution starts.
    public static void main(String[] args) {
        // Declare and initialize an integer array 'my_array'.
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        
        // Call the max_min method to calculate the maximum and minimum values.
        max_min(my_array);
        
        // Print the original array using Arrays.toString() method.
        System.out.println("Original Array: " + Arrays.toString(my_array));
        
        // Print the maximum and minimum values.
        System.out.println("Maximum value for the above array = " + max);
        System.out.println("Minimum value for the above array = " + min);
    }
}