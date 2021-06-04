package ExceptionHandlingLearn;

public class ThrowsKeyword {
	
	// checked exception in program must be caught or thrown in order to compile code successfully
	// So throw keyword is used to throw the exception to the caller
	// compile time error can be handled in 2 ways
	// 1. We use try and catch block
	// 2. we throw the exception to calling method till jvm handles the exception
	// Which one is recommended ?  -- Thy catch approach because in throws there migh me chance that jvm abnormally stops the code

	public static void main(String[] args) throws InterruptedException 
	{
		// we will take example of // Thread.sleep(1000) this will throw interreupted exception which comes in checked exception or compile time exception
		//  we can handle with 2 approaches
		// 1st approach : Use of try catch
		/*
		 * 
		 * try { 
		 * Thread.sleep(1000); 
		 *  } catch(InterruptedExceptione) 
		 *  { 
		 *  e.printStackTrace(); 
		 *  }
		 * 
		 */
		
		
		// 2nd approach: use of throws
		// it will throw the exception to the caller (main method) and from there JVM will handle
		
		Thread.sleep(1000);   // it will throw the exception to calling method
		
	}
}
