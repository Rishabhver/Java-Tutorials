package StringConcepts;

public class StringPractice2 {

	public static void main(String[] args) {
		
		// ******* IMP**    "==" it compares whether reference variable is pointing to same object. eg r1 and r2 should refer to same object ******
		// **** IMP***  ".equals" compares value in string e.g String r1 == "rishabh"  re.equals(""rishabh")
	
		// Concept 6-> Important methods of String
		
		//1. charAt(int index)
		String s1 = "Rishabh";
		char ch= s1.charAt(0);
		//char ch1= s1.charAt(30);   // String Index out of bond exception
		System.out.println(ch);
		//System.out.println(ch1);
		
		// 2. concat(String s): 
		String s2 = "Rishabh";
		s2 = s2.concat("verma");
		System.out.println(s2);
		
		// OR we can use "+"
		
		String s3 = "Rishabh";
		s3 = s3 + "verma";
		System.out.println(s3);
		
		// 3. public boolean equals(Object 0) -> used for content comparision
		String s4 = "RISHABH";
		boolean B = s4.equals("Rishabh"); 
		System.out.println(B);   // False because equals is case-sensitive
		
		// 4. boolean equalsIgnoreCase()
		String s5 = "RISHABH";
		boolean B1 = s5.equalsIgnoreCase("rishabh") ;
		System.out.println(B1);  // True -> Because it will ignore Case as it ni not case sensitive
		
		// 5.boolean isEmpty()
		String s6 = "";
		System.out.println(s6.isEmpty()); // true
		
		// 6. int length()
		String s7 = "RISHABH";
		System.out.println(s7.length());
		// Note String use length() and array use length variable to display length eg.
		int[] i = {1,2,4};
		System.out.println(i.length);  // length variable is used to display array length
		
		// 7. string replace(char old, char new)
		String s8 = "abababab";
		System.out.println(s8.replace('a', 'b'));
		
		// 8. public String substring(int begin)  // note "s" is small
        // public String substring(int begin, int end)  
		String s9 = "RISHABH";
		System.out.println(s9.substring(3));
		System.out.println(s9.substring(3, 5));    // substring -> starts with zero and ends with "end-1" so it will start from 0 and end-1
		
		// 9. public int indexOf(char c)
		String s10 = "RISHABH";
		System.out.println(s10.indexOf('H')); // if multiple character is available then it will returen index of 1st character O/P -> 3
		// If we want last index of repeted character
		System.out.println(s10.lastIndexOf('H'));  // O/p -> 6
		// If we put character which is not available then O/p would be -1
		 System.out.println(s10.indexOf('Z'));
		 
		 // 10. public String  toLowerCase() - to convert to lowercase
		 // 11  public String toUpperCase() - To convert uppercase
		 
		 // 12. *****   public String trim() -> It will remove all the spaces before and after of the string
		 String s11 = "         RISHABH is a good boy   ";
		 System.out.println(s11.trim());                       // O/P RISHABH is a good boy
		  // trim() -> only remove spaces begin of the string and ater end of the string so O/P is RISHABH is a good boy
		 
		 
		 // Important concept
		 
		 String s12 = "rishabh";    // Create 2 object one in Heap and 1 in SCP
		 String s13 = s12.toUpperCase();  // will create new object in Heap memory
		 String s14 = s12.toLowerCase();   // Since there is no new content will make, so s14 will refer to object of s12
		 // For both SCP and Heap , if content is already present in previous object, no new object will form
		 System.out.println(s12==s13);  // false
		 System.out.println(s14==s12); // True because both are pointing towards the same object in heap because value is same 
		 
		 
		 // Concept->  final Vs immutable
		 // final means -> you can't the the reference variable to other object. It will always refer to the same object
		 
		 final StringBuffer sb = new StringBuffer("rishabh");
		 sb.append("verma");
		 System.out.println(sb);   // we can change the value of abject so final is different from immutable
		 
		//  sb = new StringBuffer("verma");  we will get error as sb reference variable is final
		 
		 
		 // Concept -> use of trim()
		 String str = " ";
		 str.trim();
		 System.out.println(str.equals(""));  // false because trim method will remove the space and will create new object as string is immutable and  
		 // for new value new object is formed , since str is is pointing to old object so it is false
		 System.out.println(str.isEmpty());
		 
		 String str1 = "Rishabh Verma";
		 int len = str1.trim().length();
		 System.out.println(len); //  O/P -> 13 because trim() only remove spaces from front and back not between the words or charaters
		 
		 
		
		
		
		
		
		
		

	}

}
