   /*  write a program to find the perimeter of the square */

package full_Stack_Java;
import java.util.Scanner;
public class PerimeterofSquare
{
	public static void main(String args[]) 
	{
		//Scanner object for input
		Scanner sc=new Scanner(System.in);
		
		//user through input 
		System.out.println("***Enter length of a square***");
		double side=sc.nextDouble();
		
		//perimeter of square formula
		double perimeter=4*side;

		//display perimeter of square 
		System.out.println("\n --Perimeter of Square is-- \n "+perimeter);
	}

}

   //Output
/* ***Enter length of a square***
2

 --Perimeter of square is-- 
 8.0
 */