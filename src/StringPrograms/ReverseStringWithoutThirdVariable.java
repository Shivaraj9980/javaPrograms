package StringPrograms;

public class ReverseStringWithoutThirdVariable {
	public static void main(String[] args) {
		String s ="INDIA";
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
