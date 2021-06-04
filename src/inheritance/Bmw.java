package inheritance;

public class Bmw extends car {
	
	// Concept of Overriding - when same method is present in parent class and in child class with same name and same number of arguments,
	 // then it is called over riding
		
		public void start() // overridden method
		{
			System.out.println("BMW------> start");
		}
		
		public void theftSafety()
		{
			System.out.println("BMW------> theft safety");
		}

}
