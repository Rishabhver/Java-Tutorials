package StringConcepts;

public class CountOccuranceOfCharacter {
	
	

	public static void main(String[] args) {
		
		int count =0;
		
		String str = "I was born in India "; 
		
		//1st way
		
		char[] character = str.toCharArray();
		for(Character ch : character )
		{
			if(ch=='a') {
				
				 count = count+1 ;
			}
		}
		
		System.out.println(count);
		
		// 2nd way
		
		for(int i=0; i<str.length(); i++)
		{
			int count1 =0;
			if(str.charAt(i)=='I')
			{
				count1 = count+1;
			}
		}
		
		System.out.println(count);
		
		// 3rd way 
		
		int len = str.length();
		String newString = str.replaceAll("a", "");
		int newlen = newString.length();
		
		int numberOfOccureance = len - newlen;
		
		System.out.println(numberOfOccureance);
		
		
		
		


	}

}
