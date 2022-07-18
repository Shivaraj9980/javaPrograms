package StringProgramsSet2;

public class SegregateNumberAndAdd {

	public static void main(String[] args) {
		String s = "1dh@%14sGSHhgdfuy";
		int number = 0;
		for(int i=0;i<s.length();i++)
		{				 
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				int n = s.charAt(i)-48;
				System.out.println(n);
				number=number+n;
			}				
		}		
		System.out.println("Sum of above Numbers is "+number);			
	}
}
