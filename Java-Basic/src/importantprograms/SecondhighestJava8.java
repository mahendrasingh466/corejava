package importantprograms;

import java.util.Arrays;

public class SecondhighestJava8 {

    public static void main(String[] args) {

        int[] arr = {10, 25, 5, 40, 30, 32, 49, 70, 80};

        int secondLargest = Arrays.stream(arr)

                // Step 1:
                // Duplicate values remove karega
                .distinct()

                // Step 2:
                // int ko Integer mein convert karega
                // Comparator use karne ke liye
                .boxed()

                // Step 3:
                // b - a ka matlab descending order
                //
                // Example:
                // a = 10, b = 25
                // b - a = 25 - 10 = +15
                // => 25 ko 10 se pehle rakha jayega
                //
                // a = 40, b = 30
                // b - a = 30 - 40 = -10
                // => 40 ko 30 se pehle rakha jayega
                //
                // Final sorting:
                // 80, 70, 49, 40, 32, 30, 25, 10, 5
                .sorted((a, b) -> b - a)

                // Step 4:
                // Sabse bada number 80 skip karega
                .skip(1)

                // Step 5:
                // Ab first number = 70
                .findFirst()

                // Step 6:
                // Optional<Integer> se Integer value nikalega
                .get();

        // Step 7:
        // Result print karega
        System.out.println("Second Largest number = " + secondLargest);
    }
}