package OopsConcept;

public class FinalizeConcept {
	
	// automatically finalize will be called to clean the memory. It will remove the object who does not have reference variable 
	// It is called before garbage coolector to clean memory. LIke f1=null then F1 reference is deleted and now object does not have any ref variable
	// refereing to the object. Then finalize will remove that object from the memory. see example below
	
	public void finalize()
	{
		System.out.println("Finalize");  // finalize method will automatically run
	}

	public static void main(String[] args) {
		
		
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1=null; // it will remove the reference from the object
		f2=null; // it will remove reference pointing towards object
		
		System.gc();   // to call garbage collector

	}

}
