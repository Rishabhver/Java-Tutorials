package StringConcepts;

public class ToremoveJunkSpecialCharacter {

	public static void main(String[] args) {
		
		// Using regular expression [^a-zA-Z0-9]
		
		String s = "@#$$$$$ hell@0o ";
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
