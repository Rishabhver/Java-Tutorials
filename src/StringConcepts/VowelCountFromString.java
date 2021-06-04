package StringConcepts;

import java.util.function.IntPredicate;

public class VowelCountFromString {
	
	public static boolean isVowelPresent(Character ch)
	{
		return ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U' ;
		
	}

	public static void main(String[] args) {
		
		// 1st way : using Java
		String str = "i love doing selenium";
		int count=0;
		
		for(int i=0; i<str.length();i++)
		{
			if(isVowelPresent(str.charAt(i))) {
				count++;
			};
			
		}
		
		System.out.println(count);
		
		// using java8 streams
		
		IntPredicate vowel = new IntPredicate()
				{

					@Override
					public boolean test(int ch) {
						return ch =='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U' ;
						
					}
				};
			
			String test = "rishabhvermaisautomation";
			
			long count1 = test.chars().filter(vowel).count();
			System.out.println(count1);

	}

}
