package StringPrograms;

import java.util.LinkedHashSet;

public class NoOfOccurenceInString {
	public static void main(String[] args) {
		String s = "abcaacd";
		//step 1 create set collection
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		//step 2 fetch charcter from string and store in set collection
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		// step 3
		for (Character ch : set) 
		{
			int count = 0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			// step 4
			System.out.println(ch+"="+count);
		}
	}

}
