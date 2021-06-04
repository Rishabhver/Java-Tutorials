package ExceptionHandlingLearn;

public class Throwablee {
	
	// Throwable is the super class of error class and exception class so we use throwable because we don't know whether error is coming or exception.
	
	public static void main(String args[])
	{
		try {
			int i = 9/0; // this code will throw exception and terminate program until put in try catch
		}
		catch(Throwable t)
		{
			t.printStackTrace();    // it will show the error after the program runs completely
			System.out.println(t.getMessage()); // it will give you the error message
		}
		
		System.out.println("ABC");
	}

}
