// Write a java program for  UnBoxing.(all types).
package full_stack_java;

public class UnBoxing 
{

	public static void main(String[] args) 
	{
		// Wrapper class objects
		Byte byteObj = new Byte((byte) 10);
		Short shortObj = new Short((short) 20);
		Integer intObj = new Integer(30);
		Long longObj = new Long(40L);
		Float floatObj = new Float(50.5f);
		Double doubleObj = new Double(60.6);
		Character charObj = new Character('A');
		Boolean boolObj = new Boolean(true);

		// Explicit Unboxing - Converting Wrapper objects to primitive types
		byte byteValue = byteObj.byteValue();
		short shortValue = shortObj.shortValue();
		int intValue = intObj.intValue();
		long longValue = longObj.longValue();
		float floatValue = floatObj.floatValue();
		double doubleValue = doubleObj.doubleValue();
		char charValue = charObj.charValue();
		boolean boolValue = boolObj.booleanValue();

		// Displaying the primitive values
		System.out.println("Byte value: " + byteValue);
		System.out.println("Short value: " + shortValue);
		System.out.println("Integer value: " + intValue);
		System.out.println("Long value: " + longValue);
		System.out.println("Float value: " + floatValue);
		System.out.println("Double value: " + doubleValue);
		System.out.println("Character value: " + charValue);
		System.out.println("Boolean value: " + boolValue);
	}
}

/*   OUTPUT
Byte value: 10
Short value: 20
Integer value: 30
Long value: 40
Float value: 50.5
Double value: 60.6
Character value: A
Boolean value: true
 */
