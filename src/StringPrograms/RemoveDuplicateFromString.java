package StringPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		String s = "abcaacd";
		//step 1 create set collection
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		//step 2 fetch charcter from string and store in set collection
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		// print string after remove duplicate
		for (Character ch : set)
		{
			System.out.print(ch);
		}

}
}