package StringConcepts;

public class ReverseString {

	public static void main(String[] args) {
		String st4 = "selenium";
		int len = st4.length();
		String rev = "";
		
		 // Way 1: Using for loop
		  for(int i=len-1; i>=0; i--)
		  { 
			rev  = rev+ st4.charAt(i); 
		}
		  
		  System.out.println(rev);
		  
		  
		  // Way2: Using StringBuffer
		  
		  StringBuffer sb = new StringBuffer(st4);
		  System.out.println(sb.reverse());
	}

}
