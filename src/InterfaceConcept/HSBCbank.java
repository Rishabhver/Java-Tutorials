package InterfaceConcept;

public class HSBCbank implements USBank , BrazilBank{      // Achieving multiple inheritance

	
	
	// If class implements interface then it is mandatory to define all the methods of interface

	@Override
	public void credit() {
		System.out.println("HSBC------ credit");
		
	}

	@Override
	public void debit() {
		System.out.println("HSBC------ debit");
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC------ transferMoney");
	}	
	public void educationLoan()
	{
		System.out.println("HSBC------ educationLoan");
	}
	
	public void CarLoan()
	{
		System.out.println("HSBC------ CarLoan");
	}

	@Override
	public void mutualFund() {
		System.out.println("BrazilBank-----> mutual fund");
		
	}
		
	}


