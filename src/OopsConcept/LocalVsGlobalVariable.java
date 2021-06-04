package OopsConcept;

public class LocalVsGlobalVariable {
	
	// global or class non-static variable
	String name = "tom";
	int age = 4;

	public static void main(String[] args) {
		int i = 10; // local variable of main class
		System.out.println(i);
		
		// to access non static global variable we will use class's object reference variable
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		

	}
	
	public void sum()
	{
		int i=15;  // local variable of sum class
		int j= 20;
	}

}
