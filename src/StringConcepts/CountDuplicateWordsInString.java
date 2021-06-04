package StringConcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicateWordsInString {

	public static void main(String[] args) {
		
		duplicateWordCount("i have java and java is the best and java is nice");

	}
	
	
	public static void duplicateWordCount(String str)
	{
		
		String[] words = str.split(" ");
		Map<String, Integer> wordcount = new HashMap<String, Integer>();
		for(String word: words)
		{
			if(wordcount.containsKey(word))
			{
				wordcount.put(word, wordcount.get(word)+1);
			}else
			{
				wordcount.put(word, 1);
			}
		}
		
		
		// to retrieve value
		
		Set<String> wordinString = wordcount.keySet();
		for(String word : wordinString )
		{
			if(wordcount.get(word)>1)
			{
				System.out.println(word +":" + wordcount.get(word));
			}
		}
		
	}

}
