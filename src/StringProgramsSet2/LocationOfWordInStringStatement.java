package StringProgramsSet2;

import java.util.LinkedHashSet;

public class LocationOfWordInStringStatement {
	public static void main(String[] args) {
		String s = "Welcome to India";
		String[] str = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		//System.out.println(set);
		for (String word : set) 
		{
			for(int i=0; i<str.length; i++)
			{
				if(word.equals(str[i]))
				{
					System.out.println(word+"="+(i+1));
					break;
				}

}
		}
	}
}
