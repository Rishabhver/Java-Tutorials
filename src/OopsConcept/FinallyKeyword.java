package OopsConcept;

public class FinallyKeyword {
	
	
	public static void main(String[] args) {
		test1();
		division();
		// finally key word is associated with try catch and it will always be executed 
		// finally will always execute whether there is exception in try catch or not

	}
	
	// Example 1
	public static void test1()
	{
		try {
			System.out.println("Inside try block");
			throw new RuntimeException("Test");     // It will thriw exception and takes control to catch block
		}
		catch(Exception e){
			System.out.println("Inside catch block");
			
		}
		
		finally {
			System.out.println("Inside finally");
		}
	}
	
	// Example 2
	
	public static void division() {
		int i = 10;
		
		try {
			System.out.println("Inside try block");
			int j = i/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Inside catch block");
			System.out.println("Divide by zero error");
		}
		
		finally{
			System.out.println("It will always work");
		}
	}

}
