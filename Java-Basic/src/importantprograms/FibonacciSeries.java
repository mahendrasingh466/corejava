package importantprograms;

public class FibonacciSeries {

    public static void main(String[] args) {
//             	n = 151
//    			  ↓
//    			1st loop
//    			151 % 10 = 1
//    			sum = 1
//    			151 / 10 = 15
//    			  ↓
//    			2nd loop
//    			15 % 10 = 5
//    			sum = 15
//    			15 / 10 = 1
//    			  ↓
//    			3rd loop
//    			1 % 10 = 1
//    			sum = 151
//    			1 / 10 = 0
//    			  ↓
//    			4th check
//    			0 > 0 ❌
//    			  ↓
//    			STOP
//    			  ↓
//    			Output = 151
        int a = 0;
        // a = 0

        int b = 1;
        // b = 1

        System.out.println(a);
        // 0 print

        System.out.println(b);
        // 1 print


        for (int i = 0; i <= 5; i++) {

            int c = a + b;
            // Next number = a + b last two digit plus

            System.out.println(c);
            // c print

            a = b;
            // a ko b ki value de do

            b = c;
            // b ko c ki value de do
        }
    }
}