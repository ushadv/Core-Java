/* Write a Java program to take Employee id, name, address & salary from user and display on to screen. */

package full_Stack_Java;
import java.util.Scanner;
public class ScannerExample
{
	public static void main(String args[])
	{
		//Variables 
		int Employee_Id;
		String Employee_Name;
		String Employee_Address;
		float Employee_Salary;

		//Scanner object for input
		Scanner s=new Scanner(System.in);
		System.out.println("*****Enter Employee Details*****\n");

		//user through inputs 
		System.out.println("Enter Employee id:");
		Employee_Id=s.nextInt();

		System.out.println("Enter Employee name: ");
		Employee_Name=s.next();

		System.out.println("Enter Employee address:");
		Employee_Address=s.next();

		System.out.println("Enter Employee salary:");
		Employee_Salary=s.nextFloat();

		//display employee details 
		System.out.println("...................\n");
		System.out.println("***Employee_ID***="+Employee_Id);
		System.out.println("***Employee_Name***="+Employee_Name);
		System.out.println("***Employee_Address***="+Employee_Address);
		System.out.println("***Employee_Salary***="+Employee_Salary);

	}
}

//Output

/* *****Enter Employee Details*****

Enter Employee id:
1
Enter Employee name: 
Usha
Enter Employee address:
Solapur
Enter Employee salary:
35000
...................

 ***Employee_ID***=1
 ***Employee_Name***=Usha
 ***Employee_Address***=Solapur
 ***Employee_Salary***=35000.0
 */