package OopsConcept;

public class FinalKeyword {
	// To prevent Inheritance
	// zto prevent Overriding
	
public static void main(String[] args) {
		
		final int i = 20; // ******* 1.- use to define constant value whose value cannot be changed
		
		//********2. - If a Parent class is marked as final then a child class cannot inherit parent class
	
		/*
		 * Eg : public final class Parent { 
		 * Void start() 
		 * {
		 * System.out.println("Started");
		 *  } }
		 *  
		 *  public class child extends Parent -- not allowed as Parent class is final
		 */
		
		//******** 3:- if method is final we cannot overide the method
		
		/*
		 * Eg : public class Parent { 
		 * public final Void start() 
		 * {
		 * System.out.println("Started");
		 *  } }
		 *  
		 *  public class child extends Parent
		 *  {
		 *  public void start()   ------  Not allowed as parent class mathod is final
		 *  {
		 *      System.out.println("Started");
		 *  }
		 */
		
		
		
	}

}
