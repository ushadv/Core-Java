/* Write a program to check given number is prime number or not */


package full_stack_java;
import java.util.Scanner;
public class PrimeNumber {



	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// Prompt the user to enter a number
		System.out.print("Enter Any Number:");
		int number = s.nextInt();

		// Call the function to check if the number is prime
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}

	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false; // Numbers less than or equal to 1 are not prime
		}

		// Check divisors from 2 to the square root of the number
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false; // Found a divisor, so it's not prime
			}
		}

		return true; // No divisors found, it's a prime number
	}
}

/* Output
Enter Any Number:10
10 is not a prime number.

Enter Any Number:7
7 is a prime number.
 */