//Write a Java program to sort in ascending order an array of given integers[45,35,56,67,78,89,78,12,20]

package full_stack_java;
import java.util.Arrays;
public class Array_Ascending_order 
{


	public static void main(String[] args) 
	{
		int[] numbers = {45, 35, 56, 67, 78, 89, 78, 12, 20};

		// Sorting the array in ascending order
		Arrays.sort(numbers);

		// Display the sorted array
		System.out.println("Sorted array in ascending order:");
		for (int num : numbers)
		{
			System.out.print(num + " ");
		}
	}
}

/* Output:

Sorted array in ascending order:
12 20 35 45 56 67 78 78 89 

 */