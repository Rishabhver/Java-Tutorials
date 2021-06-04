package OopsConcept;

public class Methods {

	public static void main(String[] args) {
		Methods obj = new Methods();
		obj.car();
		int l = obj.sum();
		System.out.println(l);
		int z = obj.divide(12, 3);
		System.out.println(z);
		

	}
	
	// non static methods 
	
	// There are 3 types of Mehods in java
			// 1. no input no output
			// 2. no input will get output
			// 3. input and output
			
			
			// 1 -  No input no output example - non static method
			
			public void car()
			{
				System.out.println("Type 1 method");
			}
			
			// 2- no input but output
			
			public int sum()
			{
				System.out.println("Type 2 method");
				int a = 1;
				int b = 2;
				int c = a+b;
				
				return c;
			}
			
			// 3 - input and output
			
			
			public int divide(int a,int b)
			{
				System.out.println("Type 3 method");
				
				int y = a/b;
				
				return y;
				
			}
			
		}


