package StringPrograms;

import java.util.LinkedHashSet;

public class PrintUniqueCharacterInString {
	public static void main(String[] args) {
		String s="shivu";
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
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
			// print 
			if(count==1)
				System.out.print(ch);
		}
	}
}
