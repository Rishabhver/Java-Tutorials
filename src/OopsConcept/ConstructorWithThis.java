package OopsConcept;

public class ConstructorWithThis {
	
	// this keyword s used to intialize global/class variable
	
	String name;
	int age;
	
	public ConstructorWithThis(String name, int age)
	{
		this.name=name;
		this.age=age;
	}

	public static void main(String[] args) {
		
		ConstructorWithThis con = new ConstructorWithThis("tom", 24);

	}

}
