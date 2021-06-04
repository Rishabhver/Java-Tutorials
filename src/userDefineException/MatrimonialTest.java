package userDefineException;

public class MatrimonialTest {
	
	int age = 50;
	
	

	public static void main(String[] args) {
		
		int age = 10;
		
		if (age>60)
		{
			throw new TooOldException("too old to register for account");
		}else if(age<18)
		{
			throw new TooYoungException("too young to register for account");
		}else
		{
			System.out.println("chance of registration");
		}
		
		
	}

}
