package ExceptionHandlingLearn;

public class ThrowKeyword {
	
	public static void main(String[] args) 
	{
		// Throw keyword is used when we delibrately want to throw exception whereas Throws sends the exception to calling method until handled by try and catch.
		
		System.out.println("ABC");
		
		try {
		throw new Exception("Rishabh Exception");  // this exception will be thrown which we handled through try catch block
		}
		catch(Exception e)
		{
			
		}
		
		System.out.println("EFG");
		
		String Exe_Flag = "N";
		if(Exe_Flag.equals("N"))
		{
			try {
			throw new RuntimeException("Exec flag is no Exception");
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}
	}
	
	

}
