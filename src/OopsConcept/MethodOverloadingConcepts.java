package OopsConcept;

public class MethodOverloadingConcepts {
	
	

		public static void main(String[] args) {
			
			MethodOverloadingConcepts obj = new MethodOverloadingConcepts();
			obj.sum();
			obj.sum(20);
			obj.sum(12, 8);

		}
		
		// We cannot create a method inside another method in overloading
		// Duplicate method is not allowed i.e method with same name and parameter is not allowed.
		
		// Method Overlaoding: If class has a multiple methods having same method name but 
		// different parameters or arguments then it is know as method overloading
		
		// Ways to achieve : 1. By changing no. of argument
	    //                    2. By changing data type
		
		// can we overload main method - yes --- see below
		
		// why method overloading is not possible by changing return type?
		// Answer: Because it will cause ambiguity  -- see below  ----
		
		/*
		 * public int divide(int a, int b) 
		 * 
		 *{
		 * int z = a+b; 
		 * return z;
		 * 
		 * }
		 * 
		 * public double divide(int a, int b) 
		 * { int z = a+b; 
		 *   return z;
		 * 
		 * }
		 * 
		 * when we call : obj.divide(10,10) then which method is to call and cause ambiguity
		 */
		
		public void sum()
		{
			System.out.println("sum method--------> zero input ");
			
		}
		
		public void sum(int a)
		{
			System.out.println("sum method ---------> 1 input parameter");
		}
		
		public void sum(int a, int b)
		{
			System.out.println("sum method ---------> 2 input parameter");
			int y = a+b;
			System.out.println(y);
		}
		
		public static void main(int m) // main method overloading
		{
			
		}

		public static void main(String m) // main method overloading
		{
			
		}
		
	}


