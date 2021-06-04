package StringConcepts;

public class stringPractice {

	private static final String StringBuffer = null;
	private static final String StringBuilder = null;

	public static void main(String[] args) {
		
		// Wbhat is String: It is the sequence of characters
		
		// Concept -> 1
		
		// String Concept -> String - is immutable -> which means if we create the object then we cannot make any changes to the object
		// Example of Immutability
		String s = new String("Rishabh"); 
		s.concat("Verma");
		System.out.println(s);
		
		// What will be the output as string is immutable
		// Output will be Rishabh as String is immutable but a new string object will be created "RishabhVerma" but due to no refrence it will
		// send to garbage collection
		// Immutability: The unchangable behaviour of an object is called immutability
		
		// StringBuffer Concept-> is mutable -> which means if we create object then can makes changes to the object
		// Mutability: The changing behaviour of an object is called mutability. Ex of mutability
		StringBuffer sb = new StringBuffer("rishabh");
		sb.append("verma");
		System.out.println(sb);
		
		//Difference between String and StringBuffer
		// String -> 1. they are Immutable , 2. once object is created cannot change the value , 3. if we concat new object is created but the value
		// of String object remains the same, 4. In string equals() method is for content comparison 
		// String Buffer -> They are mutable , 2. We can change the value of Object , 3. if we append the existing object gets changed,
		// .equals() is used to compare the is reference variable pointing to same object
		
		
		// Concept-> 2: Difference between "==" and ".equals()"
		
		String s1 = new String("Rishabh");  // false
		String s2 = new String("Rishabh");  //true
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		// What is the difference between above two for String
		// For s1==s2 : The output will be false because it will compare the reference , if the reference is pointing to same object it will
		// be true else it will be false. here 2 new objects are formed, hence both the variable will be pointing to different object so
		// answer is false.
		// For s1.equals(s2): equals() is the method of object class. It is used to compare the reference of 2 comparing objects. 
		// hence both the object is reference to different object the answer should be false, but string and StringBuffer 
		// are the child class of Object class and String class overriden the equals() therefore in string class it is used to compare the
		// the content of the class. so answer would be true
		
		// Only for String equals() is used to compare content else for String buffer it is used to compare the pointing of ref variable
		
		StringBuffer sb1 = new StringBuffer("rishabh"); // false
		StringBuffer sb2= new StringBuffer("rishabh");  // flaase
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		// What is the difference between above two for StringBuffer
		//For sb1==sb2 : The output will be false because it will compare the reference , if the reference is pointing to same object it will
		// be true else it will be false. here 2 new objects are formed, hence both the variable will be pointing to different object so
		// answer is false.
		// For sb1.equals(sb2): equals() is the method of object class. It is used to compare the reference of 2 comparing objects. 
		// Because both the object is referencing to different objects the answer should be false.
		
		
		
		// concept-> 3: Difference between "String s3 = new String("rishabh")" and String s4 = "rishabh";
		
		String s3 = new String("rishabh");
		// It will create 2 objects. One in Heap memory where reference s3 will poit towards object and second object will be made
		// in SCP (String constant pool) where implicit reference variable maintained by JVM will refer to the object
		
		String s4 = "rishabh";
		// it will create only 1 object in SCP(String constant pool), where s4 will refer to the project
		// Before creating object it will check if any object contains literal "rishabh". If yes, it will not create new object and s4 will refer
		// to the object which already cotains "rishabh" else new object will be created
		
		// Exercise question: how many object will be created in the memory
		String s5 = new String("rishabh");
		String s6 = new String("rishabh");
		String s7 = "rishabh";
		String s8 = "rishabh";
		
		// Answer: 3 Objects will formed. 2 objects in heap memory for s5 and s6 and 1 object in SCP because SCP has the propery that
		// if one object contains same literal then new reference variable will refer to already created object and will not create there own 
		// object like s5 create object in SCP then s6,s7,s6 reference variable will refer to object created by s5.
		
		
		// Exercise Question 2 , How many objects will be created
		String s9 = new String("rishabh");
		s5.concat("kumar");                // for every runtime operation like method calling object is created only in Heap so RishabhKumar 
		s5 = s5.concat("verma");           // object is created and for every literal object is created in SCP for kumar obj is created in SCP
		
		// Answer :  Total 6: 3 for SCP and 3 for heap (Out of 3, 2 are eligible for GC (garbage collection)
		//           For S9 -> one object in Heap and one in SCP
		//           for s5.concat("kumar") -> 1 in heap because String is immutable and with no reference it is eligible for GC(Garbage collection) and 1 in SCP. In SCP object is formed because  
		//  "Kumar" is string constant/literal and for ebery string literal objet is formed
		//           for s5 = s5.concat("verma") -> 1 in SCP because "verma" is string constant/literal and 1 in Heap because 
		//  string is immutable. Now the reference s5 is referring to "rishabhVerma" then object of s9 will be eligible for GC
		
		// Exercise question3
		
		String s10 = new String("you cannot change me"); // 1 object in heap (UCCMe) & 1 in SCP
		String s11 = new String("you cannot change me"); // 1 object in heap (UCCMe) & no object in SCP as already created
		System.out.print(s10==s11);   // false -> both object refer to different object
		
		String s12 = "you cannot change me";  // s12 -> no object in Heap and 0 in SCP as already created but r12 will refer to object of s10
		System.out.println(s10==s12); // false -> s10 refer to object in heap and s12 refer to object in SCP
		
		String s13 = "you cannot change me";  // no object created , s13 refer to object in SCP
		System.out.println(s12==s13);  // True -> both refer to object in SCP
		
		String s14 = "you cannot" + "change me"; //  2 constant string constant + at compile time so no seprate "you cannot" & "change me" object
		                                        // will beformed instead "you cannot change me" will be treated as literal and s14 will refer
		                                       // to already created object in SCP
		System.out.println("****" + s13==s14);  // True -> both refer to same object in SCP
		
		String s15 = "you cannot";    // 1 object in SCP will be created
		String s16 = s15 + "change me"; // One is variable hence operation is performed at run time so 1 object is created in heap
		System.out.println(s13==s16); // False s13-> refer to SCP and S16 refer to object in heap
		
		final String s17 = "you cannot";  // refer to object in SCP
		String s18 = s17 +	"change me";  // now s17 is final hence considered as constant and s18 will refer to SCP
		System.out.println(s14==s18);   // True
		
		
		
		
		
		// concept-> 4:  Importance of String constant pool (SCP)
		// 1. Memory Utilization: Single object can be referenced by multiple reference variables or single object can be used multiple time
		// 2. performance will be improved
		// Disadvantage:
		// If 100 variable use single object then if 1 reference want to change value then the value of all 100 reference variable will be changed
		// in order to solve this, if any object wants to change content, a new object is created and reference is refered to new object
		// This concept is called Immutability
		
		// Important question 
		// 1. why SCP is only available for string and not for string buffer
		// Answer: Because Strings are commonly used hence developer provide scp to string
		// 2. Why string object are immutable while string buffer objects are mutable?
		// Anser: In String SCP concept is there in which same object can be used multiple objects, if any object wants to change value then 
		// all the object value will be changed therefore string objects are immutable so value of string object cannot be changed
		// but in string buffer every string object has its own memory and can be changed
		// 3. in Addition to string object any other objects are immutable in java/
		// Answer: yes, Wrapper class objects are immutable like Integer, Float, Character
		
		// Concept-> 5 : important Constructor of string
		
		// 1. Empty string object
		String s19 = new String(); 
		
		// 2. For given String literal how to create string object 
		
		String s20 = new String("rishabh"); 
		
		//3.For given String literal how to create string buffer
		
		String s21 = new String(StringBuffer); 
		
		// 4. Create String object equivalent to string builder
		
		String s22 = new String(StringBuilder); 
		
		// 5. Create String object equivalent to charater array
		
		// String s22 = new String(char[] ch); 
		char[] ch = {'j','a','v','a'};
		String s23 = new String(ch); 
		System.out.println(s23);
		
		// 6 Create String object equivalent to byte[] b
		
		byte[] b = {97,98,99,100};
		String s24 = new String(b); 
		System.out.println(s24);
		
		
		
		
	}

}
