package StringConcepts;

public class StrinfManupilation {

	public static void main(String[] args) {
		
		String str = "Rishabh Ravi and Ram are running very fast Ram";
		String str1 = "Ram";
		String str3 = "rishabh ravi and ram are running very fast ram";
		
		
		// to find length
		System.out.println(str.length());
		
		// to find character at location 5
		System.out.println(str.charAt(5));
		
		// to find the first occurrence of character R
		// we will use method:  str.indexOf(ch, fromIndex)
		System.out.println(str.indexOf('R'));
		
		// to find the 2nd occurrence of R
		System.out.println(str.indexOf('R', str.indexOf('R')+1)); 
		
		// to find the 3rd occurrence of R
		System.out.println(str.indexOf('R', str.indexOf('R', str.indexOf('R')+1)+1));
		
		// to find the 4th occurrence of R
		
		System.out.println(str.indexOf('R', str.indexOf('R', str.indexOf('R', str.indexOf('R')+1)+1)+1));
		
		// to find index of String
		System.out.println(str.indexOf("RA"));
		
		// To find string which does not exist
		System.out.println(str.indexOf("Maharaj"));   // for string which does not exist it will throw -1
		
		// to compare String
		System.out.println(str.equals(str1));  // false -> it is Case sensitive
		
		// to ignore case sensitive
		System.out.println(str.equalsIgnoreCase(str3));  // true
		
		// to convert lowercase
		System.out.println(str1.toLowerCase());
		
		// to upparcase
		System.out.println(str.toUpperCase());
		
		// to find substring from beginning to end
		System.out.println(str.substring(0, 9));
		
		// to find substring from beginning
		System.out.println(str.substring(8));
		
		// trim() -> only remove before and after space
		String str4 = "      hello world  ";
		System.out.println(str4.trim());  
		// now to remove space between hello and world
		System.out.println(str4.replace(" ", ""));
		System.out.println(str4.replace("hello", "shallow"));
		
		// split
		
		String test = "Hello_World_Selenium_Test";
		String value[] = test.split("_");
		for(int i=0; i<value.length;i++)
		{
			System.out.println(value[i]);
		}
		
		// concat
		String m = "care";
		System.out.println(m.concat("s"));
		
		
		// important interview question
		
		String x = "hello";
		String y = "world";
		int a=100;
		int b =200;
		
		System.out.println(x+y); // helloworld
		System.out.println(a+b); // 300
		System.out.println(x+y+a+b); // helloworld100200   : compiler adds from left to right -> helloworld100200  
		// Don't say helloworld300
		System.out.println(a+b+x+y);  // 300helloworld
		
		// *** reverse a string******//
		
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
