package OopsConcept;

public class WrapperClassConcept {

	public static void main(String args[])
	{
		
		
		String a = "100";
		 System.out.println(a+20);
		 
         // conversion of String to integer
		int i = Integer.parseInt(a);
		System.out.println(i+20);
		
		 // conversion of String to double
		
		String k = "10.33";
		
		double j = Double.parseDouble(k);
		System.out.println(j+2.00);

		// conversion of String to boolean
		 String l = "true";
		 System.out.println(l);
		 boolean b = Boolean.parseBoolean(l);
		 System.out.println(b);
		 
		 // we cannot convert String into char because parse int is not available
		 
		 // converting integer into string
		 
		 int s = 4;
		 String ss = String.valueOf(s);
		 System.out.println(ss);
		 
		 // converting double into String
		 
		 double d = 24.33;
		 String str = String.valueOf(d);
		 System.out.println(str);
		 
		 // Imp - Can we convert string with improper Integer to integer - NO
		 
		 String st = "100A" ;   // ---- not an proper integer because of A
		 int inter = Integer.parseInt(st);   // It will throw error NumberFormatException
		                                     //as 100A is not an integer
				 
				 
	}
}
