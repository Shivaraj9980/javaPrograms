package ArrayProgram;

public class FirstMinWithOutBubbleSort {
	public static void main(String[] args) {
		int a[]= {1,5,7,9,8};
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
