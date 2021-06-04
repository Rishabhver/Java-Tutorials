package userDefineException;

public class TooYoungException extends RuntimeException{
	
	// User Define Exception -> Exceptions created by the user expicitly
			// Rules:
			// 1. All exceptions must be a child of Throwable.
	        // 2.  If you want to write a checked exception that is automatically enforced by the Handle or Declare Rule, you need to extend the Exception class.
	        //3. If you want to write a runtime exception, you need to extend the RuntimeException class.
			//  e.g:  class MyException extends Exception/runtimeException {
		    //               }
			
	
	// ***why it is recommended to extend RuntimeException instead of Throwable or Exception? 
	//    Because if we extend Throwable, it becomes checked exception and compiler will caught the exception and we need to define either 
	// try catch or use throws keyword in order to resolve compile time exception, but with RuntimeException it is unchecked exception and can
	// thrown at the run time
	
	
	// ***why we use super in the constructor?
	//  To make our description message available to throwable class and this throwable class will throw the message to the console using its internal 
	// method called printStackTrace(). So in short to display message in the console we need to pass error message from exception class to throwable.
	
	TooYoungException(String msg)
	{
		super(msg);
	}
	
	
	
	
}


