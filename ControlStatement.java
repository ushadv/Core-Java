/* Write java program to check  candidate eligible for voting or not */

package full_stack_java;
import java.util.Scanner;
public class ControlStatement {
	public static void main(String args[])
	{

		Scanner sc= new Scanner(System.in);
		//user through input 
		System.out.println("---Enter your age---");
		int age=sc.nextInt();

		//Checking the eligibility condition
		if(age>=18)
		{
			//if condition becomes true then it will execute this statement
			System.out.println("***You are eligible for Voting***");
		}
		else
		{
			//if condition is false then it will execute this statement
			System.out.println("***You are not eligible for Voting***");
		}
	}
}

// Output

/* ---Enter your age---
18
 ***You are eligible for Voting*** */