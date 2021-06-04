package InterfaceConcept;

public interface USBank {
	
	int min_bal = 100;   // // cannot change the value of min_bal because it is final by default
	
	public void credit();
	
	public void debit();
	
	
	
	public void transferMoney();

	// only method declaration - no method body
		// Variables can be declared but should be  automatic final and static
		// methods are non static and abstract 
		// abstract means they will not get instantiated or they will not have object
		// no static methods in interface
	    // We cannot create object of interface
	    // Interface is abstract in nature  - will not get instantiated or they will not have object
}
