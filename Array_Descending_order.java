//Write a Java program to sort in descending order an array of given string[A,X,D,Z,Y,C,W,B]

package full_stack_java;
import java.util.Arrays;
import java.util.Collections;
public class Array_Descending_order 
{

	public static void main(String[] args)
	{
		String[] alphabet = {"A", "X", "D", "Z", "Y", "C", "W", "B"};

		// Sorting the array in descending order
		Arrays.sort(alphabet, Collections.reverseOrder());

		// Display the sorted array
		System.out.println("Sorted array in descending order:");
		for (String letter : alphabet) {
			System.out.print(letter + " ");
		}
	}
}

/* Output:

   Sorted array in descending order:
   Z Y X W D C B A 

 */