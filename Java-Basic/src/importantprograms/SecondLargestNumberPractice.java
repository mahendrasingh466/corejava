package importantprograms;

public class SecondLargestNumberPractice {
public static void main(String[] args) {
	int arr[]= {35,25,30,50,80,70,60};
	
	int largest= arr[0];
	int secondHighest= arr[0];
// i= 1 means 25
	for (int i = 1; i < arr.length; i++) {
    	if (arr[i] > largest) {
    		secondHighest=largest;
    		largest=arr[i];
           
    		  // If current element is NOT greater than largest,
            // then check whether it is greater than secondHighest
            // Example:
            // largest = 80
            // secondHighest = 50
            // current = 70
            // 70 > 50  -> true
            // So 70 becomes secondHighest
    		} else if (arr[i] > secondHighest && arr[i] != largest) {
    		secondHighest = arr[i];
    	}
		
	}
	System.out.println(secondHighest);

}
}
