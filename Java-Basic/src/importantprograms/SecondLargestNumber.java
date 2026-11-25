package importantprograms;

public class SecondLargestNumber {

    public static void main(String[] args) {

        int[] arr = {10, 25, 5, 40, 30};

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // 25 > 10  → true
        	if (arr[i] > largest) {
                secondLargest = largest;  //10
                largest = arr[i];//25
            }     
            // Agar current number largest se bada nahi hai
            // lekin secondLargest se bada hai
            else if (arr[i] > secondLargest && arr[i] != largest) {

                secondLargest = arr[i];
            }
        }

        System.out.println("Second Largest number = " + secondLargest);
    }
}