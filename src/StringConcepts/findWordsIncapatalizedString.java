package StringConcepts;

public class findWordsIncapatalizedString {
	
	// In this we have to find the words starting with capital letters

	public static void main(String[] args) {
		
		String str = "ThisIsRishabhVerma";   // here there are 4 words based on capital letters starting with T,I,R,V
		int count =0;
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)>='A' && str.charAt(i)<='Z')    // here we identify word with capital letters (Capatalized String)
			{
				count++;
			}
		}
		
		System.out.println(count); // O/P = 4
	
	// way 2
	
	int count1=0;
	
	for(int i=0; i<str.length(); i++)
	{
		
		if(Character.isUpperCase(str.charAt(i)))
				{
			
				count1++;
			
	             }


	
}
}
}

