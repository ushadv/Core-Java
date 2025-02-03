//Write  a java program for AutoBoxing.(All Primitive Types)

package full_stack_java;
public class AutoBoxing 
{
	public static void main(String[] args) 
	{

		Byte byteObj = Byte.valueOf((byte) 10);
		Short shortObj = Short.valueOf((short) 20);
		Integer intObj = Integer.valueOf(30);
		Long longObj = Long.valueOf(40L);
		Float floatObj = Float.valueOf(50.5f);
		Double doubleObj = Double.valueOf(60.6);
		Character charObj = Character.valueOf('A');
		Boolean boolObj = Boolean.valueOf(true);

		// Displaying the values
		System.out.println(" Autoboxed Byte object: " + byteObj);
		System.out.println(" Autoboxed Short object: " + shortObj);
		System.out.println(" Autoboxed Integer object: " + intObj);
		System.out.println(" Autoboxed Long object: " + longObj);
		System.out.println(" Autoboxed Float object: " + floatObj);
		System.out.println(" Autoboxed Double object: " + doubleObj);
		System.out.println(" Autoboxed Character object: " + charObj);
		System.out.println(" Autoboxed Boolean object: " + boolObj);
	}
}


/*    OUTPUT
 Autoboxed Byte object: 10
 Autoboxed Short object: 20
 Autoboxed Integer object: 30
 Autoboxed Long object: 40
 Autoboxed Float object: 50.5
 Autoboxed Double object: 60.6
 Autoboxed Character object: A
 Autoboxed Boolean object: true

 */