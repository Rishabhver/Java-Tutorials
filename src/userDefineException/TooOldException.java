package userDefineException;

public class TooOldException extends RuntimeException {
	
	TooOldException e;
	
	TooOldException(String msg)
	{
		super(msg);
		System.out.println(e.getMessage());
		
	}

}
