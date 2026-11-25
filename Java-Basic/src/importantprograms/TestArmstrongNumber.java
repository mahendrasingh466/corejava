package importantprograms;

public class TestArmstrongNumber {

	public static void main(String[] args) {

		int number = 153;

		int rem = 0;

		int sum = 0;

		int n = number;

		while (n > 0) { // n = 0 (false)

			rem = n % 10; // rem = 1 

			sum = sum + (rem * rem * rem); // sum = 153

			n = n / 10; // n = 0

		}

		if (number == sum) {
			System.out.println("armstrong number");
		} else {
			System.out.println("not armstrong number");
		}

	}

}
