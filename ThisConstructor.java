package full_stack_java;

public class ThisConstructor
{
	    String name;
	    int age;

	    // Constructor with parameters
	    ThisConstructor(String name, int age) 
	    {
	        this.name = name;
	        this.age = age;
	    }

	    // Constructor that accepts another Person object as a parameter
	    ThisConstructor(ThisConstructor ThisConstructor)
	    {
	        this.name = ThisConstructor.name;
	        this.age = ThisConstructor.age;
	    }

	    void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }
	    public static void main(String[] args)
	    {
	        // Create a new Person object
	    	ThisConstructor ThisConstructor1 = new ThisConstructor("Usha", 23);

	        // Pass the current object (person1) to the constructor of person2
	    	ThisConstructor ThisConstructor = new ThisConstructor(ThisConstructor1);
	    	
	        // Display the details of both persons
	        System.out.println("1st person Details");
	        ThisConstructor.display();
	        System.out.println("same person details using this keyword ");
	        ThisConstructor1.display();
	    }
}
