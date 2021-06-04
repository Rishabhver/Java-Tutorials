package ExceptionHandlingLearn;

public class ExceptionHandling {
	
	public static void main(String args[])
	{
	
	// uncaught exception
	//int i = 9/0; // --- compiled won't able to detect this error until we run the program
	//System.out.println(i);
	
	// caught exception
	// Thread.sleep(2000);
		
	// 1. try-catch block  -- It will handle the exception and will not terminate the program
		
		try {
			int i = 9/0; // this code will throw exception and terminate program until put in try catch
		}
		catch(ArithmeticException e)    // or catch(Throwable t), because it is super class of exception and error and hence handle both.
		{
			e.printStackTrace();    // it will show the error after the program runs completely
			System.out.println(e.getMessage()); // it will give you the error message
		}
		
		System.out.println("ABC");
	
	

}
	
}
