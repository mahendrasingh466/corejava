package importantprograms;

public class LargestNumbeFindArray {
public static void main(String[] args) {
    int[] arr = {10, 25, 5, 40, 30};

    int largest = arr[0];

    for (int i = 1; i < arr.length; i++) {

        // arr[i] = 25
        // largest = 10
        // 25 > 10
        if (arr[i] > largest) {

            largest = arr[i];
        }
    }

    System.out.println("Largest number = " + largest);
}
}
