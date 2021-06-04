package StringConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfDuplicateCharacters {
	
	// how print duplicate characters from string
			// e.g String s = "java", then count should be a=2; also it is case sensitive
			
			// various cases to check 
			// 1. if s==null; return
			// 2. s.isEmpty(); return
			// 3. s.length() = 0;
	
	
	
	public static void PrintDuplicateCharacters(String str)
	{
		if(str==null)
		{
			System.out.println("null String");
			return;
		}
		if(str.isEmpty())
		{
			System.out.println("empty String");
			return;
		}
		
		if(str.length()==1)
		{
			System.out.println("only 1 character");
			return;
			
		}
		
		char[] words = str.toCharArray();
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		
		for(Character ch: words)
		{
			
			if(charmap.containsKey(ch))
			{
				charmap.put(ch, charmap.get(ch)+1);
				
				
			}
			else
			{
				charmap.put(ch, 1);
			}
		}
		
		// To print the map
		Set<Map.Entry<Character,Integer>> entryset = charmap.entrySet();
		for(Map.Entry<Character,Integer> entry : entryset )
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+ ":" + entry.getValue());
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		//PrintDuplicateCharacters("Selenium is java world");
		PrintDuplicateCharacters("java");
		PrintDuplicateCharacters("");
		
		
}

}
