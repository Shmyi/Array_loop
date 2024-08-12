public class ArrayInput {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = new int[10]; // Creating an array of size 10
        // Populate the array using a for loop
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2; // Assigning values (in this case, i * 2)
        }
        // Print out the array elements
        System.out.println("Array of integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);

        }
    }
}
