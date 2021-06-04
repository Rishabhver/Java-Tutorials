package OopsConcept;

public class classAndObject {
	
	// global variables
	int mod;
	int wheel;
	
	
	
	public static void main(String args[])
	{
		classAndObject a = new classAndObject();
		classAndObject b = new classAndObject();
		classAndObject c = new classAndObject();
		
		a.mod = 10;
		a.wheel = 20;
		
		b.mod = 12;
		b.wheel = 13;
		
		c.mod = 20;
		c.wheel=22;
		
		System.out.println("before shifting the references");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println("After shifting the references");
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod); //  
		c.mod = 20;
		System.out.println(c.mod); // 20
		System.out.println(a.mod);  // 20 because both are regerencing to same object and now value of mod has been changed to 20
	}

}
