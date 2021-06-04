package StringConcepts;

public class CheckSubStringIsPresent {
	
	public static boolean findSubString(String main, String sub)
	{
		return main.matches("(.*)" + sub + "(.*)");
	}

	public static boolean findSubString1(String main, String sub)
	{
		return main.contains(sub);
	}
	
	public static boolean findSubString2(String main, String sub)
	{
		return main.indexOf(sub) !=-1;
	}
	public static void main(String[] args) {
		
		System.out.println(findSubString("automation testing is the main testing" ,"main"));
		System.out.println(findSubString("automation testing is the main testing" ,"TestinG"));
		System.out.println(findSubString1("automation testing is the main testing" ,""));
		System.out.println(findSubString2("automation testing is the main testing" ," merg"));

	}

}
