package SuperKeywordConcept;

public class B extends A {
	
	public B()
	{
		//super(10);                                       // super keyword is used to call parent class constructor
		super(10,20);
		System.out.println("Calling child constructor");
	}

	public static void main(String[] args) {
		B b = new B();

	}

}
