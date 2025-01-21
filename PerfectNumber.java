/* Write a java program to check given number is perfect number or not */

package full_stack_java;
import java.util.Scanner;
public class PerfectNumber
{ 
	public static boolean isPerfectNumber(int num)
	{
		if (num <= 1)
		{
			// Numbers less than or equal to 1 cannot be perfect
			return false; 
		}

		int sum = 0;

		// Find divisors and calculate their sum
		for (int i = 1; i <= num / 2; i++) 
		{
			if (num % i == 0)
			{
				sum += i;
			}
		}

		// Check if the sum of divisors equals the original number
		return sum == num;
	}

	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);

		// User through input
		System.out.print("Enter Any Number: ");
		int number = s.nextInt();

		// Call the function to check if the number is perfect
		if (isPerfectNumber(number)) 
		{
			System.out.println(number + " is a perfect number.");
		} 
		else 
		{
			System.out.println(number + " is not a perfect number.");
		}
		s.close();
	}	
}

/* Output
 Enter Any Number: 6
 6 is a perfect number. 

 Enter Any Number: 14
 14 is not a perfect number.
 */


