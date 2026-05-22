package JavaChallenges;

public class ArrayMaxMin {

    public static void main(String[] args) {

        int[] numbers = {45, 22, 89, 16, 90, 33};

        // Initialize smallest and largest
        int smallest = numbers[0];
        int largest = numbers[0];

        // Enhanced for loop
        for (int num : numbers) {

            // Check smallest
            if (num < smallest) {
                smallest = num;
            }

            // Check largest
            if (num > largest) {
                largest = num;
            }
        }

        // Print results
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
    

