package StringProgramsSet2;

public class PrintCharInSeparateSet {
	public static void main(String[] args) {
		String s = "india";
		String add = "";
		for(int i=0;i<s.length();i++)
		{
			add=add+s.charAt(i);
			System.out.println(add);
		}
	}

}
