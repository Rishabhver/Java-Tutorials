package StringConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringPractice3 {
	
	

	
	
	
	public void checkprecondition(String str)
	{
		if(str==null)
		{
			return;
		}
		if(str.isEmpty())
		{
			return;
		}
		if(str.length()==1)
		{
			return;
		}
		
		char[] words = str.toCharArray();
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		
		for(Character ch : words)
		{
			if(charmap.containsKey(ch))
			{
				charmap.put(ch, charmap.get(ch)+1);
			}else
			{
				charmap.put(ch, 1);
			}
			
			
			Set<Map.Entry<Character,Integer>> entryset = charmap.entrySet();
			for(Map.Entry<Character,Integer> entry : entryset )
			{
				if(entry.getValue()>1)
				{
					System.out.println(entry.getKey()+ ":" + entry.getValue());
				}
			}
			
		}
	}
	

	
	
	

	public static void main(String[] args) {
		
		
		
				
		

	}
	
	
	
}
