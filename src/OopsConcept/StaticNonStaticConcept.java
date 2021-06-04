package OopsConcept;

public class StaticNonStaticConcept {
	
	int age = 12;  // global non-static  Variable
	static int size = 32; // global static Variable
	
	
	public void sum()     // non static method
	{
		System.out.println("non static method");
	}
	
	public static void divide()  // static method
	{
		System.out.println("Static method"); 
		//size = 12; // Static method can access global static variables and can change values
		           // they cannot access non static variables
		
	}

	//  Ways to call Static members
	// 1. directly
	// 2. Using class name
	// 3. Using object reference (But it is not a good practice)
	// 3. when variable or method is static separate memory is assigned which can be used by others
	//  ***** Interview question***** -------> Can I access static methods with object reference - Yes --->  obj.divide();
	
	
	
	// Way to call non static members
	// 1. Using object reference 
	
	public static void main(String[] args) {
		
		System.out.println(size);  // calling static by 1st way 32
		divide();
		System.out.println(StaticNonStaticConcept.size); // 32
		StaticNonStaticConcept.divide();
		
		StaticNonStaticConcept obj = new StaticNonStaticConcept();
	    System.out.println(obj.age); // 12
	    obj.sum(); // non static method
	    obj.divide();  // accessing static static method in non static way using reference
		

	}

}


