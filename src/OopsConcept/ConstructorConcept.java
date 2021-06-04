package OopsConcept;

public class ConstructorConcept {
	
	 public ConstructorConcept()
	 {
		 System.out.println("Default Constructor");
	 }
	 
	 public ConstructorConcept(int i)
	 {
		 System.out.println("Single parameterize contructor");
		 System.out.println("the value of i is --> " +i);
	 }
	 
	 public ConstructorConcept(int i, int j)
	 {
		 System.out.println("2 param constructor");
		 System.out.println("the value of i is --> " +i);
		 System.out.println("the value of j is --> " +j);
		 
	 }
	 
	 // Can we overload a constructor ? --- Yes, we can overload a constructor
	
	

	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);

	}

}
