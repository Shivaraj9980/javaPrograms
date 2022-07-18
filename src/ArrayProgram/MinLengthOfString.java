package ArrayProgram;

public class MinLengthOfString {
	public static void main(String[] args) {
		String str[]={"Shivu","raj","is","a","good","boy"};
		String max = str[0];
		for(int i=1;i<str.length;i++)
		{
			if(max.length()>str[i].length())
			{
				max=str[i];
			}
			
		}
		System.out.println(max);
		
		
	}

}
