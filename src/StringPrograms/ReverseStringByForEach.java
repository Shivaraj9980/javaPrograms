package StringPrograms;

public class ReverseStringByForEach {
	public static void main(String[] args) {
		String s="shivu";
		char[] ch = s.toCharArray();
		String rev="";
		for(char c:ch) {
			rev=c+rev;
		}
		System.out.println(rev);
		
		if(ch.equals(rev)) {
			System.out.println("It is a palindrome");
		}else
		{
			System.out.println("not a palindrpome");
		}
	}

}
