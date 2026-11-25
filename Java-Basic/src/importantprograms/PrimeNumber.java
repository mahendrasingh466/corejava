package importantprograms;

public class PrimeNumber {
//	Prime number wo number hota hai jo sirf 1 aur khud se divide hota hai.

	public static void main(String[] args) {
		int number = 11;

		int count = 0;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count > 0) {
			System.out.println(" not prime " + number);
		} else {
			System.out.println("prime number" + number);

		}

	}
}
