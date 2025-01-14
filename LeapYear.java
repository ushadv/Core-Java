/* Write a program to check leap year using if else. How to check whether a given year is a leap year or not */

package full_stack_java;
import java.util.Scanner;
public class LeapYear {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		//user through input
		System.out.println("***Enter Any Number***");
		int i=s.nextInt();
		
		//checking the condition 
		if(i%2==0)
		{
			//if condition becomes true then it will execute this statement
			System.out.println("--Entered Number is a Leap year--");
		}
		else
		{
			////if condition is false then it will execute this statement
			System.out.println("--Entered number is not leap year--");
		}

	}
}

//Output
/* ***Enter Any Number***
2024
--Entered Number is a Leap year-- */