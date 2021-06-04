package AbstractConcept;

public abstract class Bank {
	
	// abstract method class should also be abstract
	// we cannot define body of abstract method
	// A class which is abstract must contain atleast one abstract method
	// Abstraction means hiding the implementation logic
	// In this class we are achieving partial abstraction because we have define abstratct and non abstract methods
	// abstract class can have abstract and non anstract methods
	// We cannot create object of abstract class and interface
	// In abstract class we can define final, static and nn static variable whereas in interface we can define only final and static variable
	// when to use abstract class and when to use interface - If u need 100% abstraction then interface else abstraction.
	
	public abstract void loan();
	
	final int i = 2;      // we can define final, static and non static variable in abstract class
	static int j = 2;
	int k = 4;
	
	public void credit()
	{
		System.out.println("Bank-----> credit");
	}
	
	public void debit()
	{
		System.out.println("Bank-----> debit");
	}
	
	

}
