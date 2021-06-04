package InterfaceConcept;

public class TestBank {

	public static void main(String[] args) {
		
		
		HSBCbank hs = new HSBCbank();   // HSBCbank class is public
		hs.CarLoan();
		hs.credit();
		hs.debit();
		hs.educationLoan();
		hs.transferMoney(); // compile time polimorphism because overridden methods are calling
		hs.mutualFund();
		
		// to access interface variable which is static and final
		
		System.out.println(USBank.min_bal);    // Min_bal is statc therefore should be called by interface name
		
		// dynamic polymorphism  - child class object can be refered by parent interface reference variable
		
		USBank us = new HSBCbank();
		us.credit();
		us.debit();
		us.transferMoney();    // we cannot use methods oc child class i.e HSBCbank --> educationLoan() and carLoan because they are not overridden methods.
		
		BrazilBank bb = new HSBCbank();
		bb.mutualFund();
		
		

	}

}
