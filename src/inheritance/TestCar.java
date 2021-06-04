package inheritance;

public class TestCar {

public static void main(String[] args) {
		// what is polymorphism ?
	// It means one to many. Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
	
		// static polymorphism or compile time polimorphism
		// because at compile time java will decide which method to call
		Bmw b = new Bmw();
		b.start();
		b.stop();
		b.theftSafety();
		
		System.out.println("********");
		
		//child class object can be reffered by  parent class reference variable, it is
		// call Run time polymorphysm
		
		
		// Top Cast
		car c = new Bmw(); 
		c.start();
		c.stop();
		
		// we cannot access theftSafety Method of child class because it is specifically for child
		// in run time polymorphism we can access all the parent class method and
		// common method or over-ridden methods of  but not that methods which are only in child
		
		// c.theftSafety();   ----- > not possible

		
		//Bmw b1 = new car(); // -   we cannot BMW b1 = new car(); becuase child can
		                    // never refer to parent class so we have to change car into BMW
		                    // known as Downcast 
		// Down Cast
		//Bmw b1 = (Bmw)new car();   //at run time it will still give ClassCastException:
	}
}
