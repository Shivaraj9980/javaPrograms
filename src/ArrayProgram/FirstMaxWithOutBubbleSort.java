package ArrayProgram;

public class FirstMaxWithOutBubbleSort {
	public static void main(String[] args) {
		int a[]= {1,5,7,9,8};
		 
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
