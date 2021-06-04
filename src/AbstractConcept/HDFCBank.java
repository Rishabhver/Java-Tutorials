package AbstractConcept;

public class HDFCBank extends Bank {
	
	// if we extends abstract class then we have to define body of abstract method

	@Override
	public void loan() {
		System.out.println("HDFC----- Loan");
	}
	
	public void funds()
	{
		System.out.println("HDFC------ funds");
	}

}
