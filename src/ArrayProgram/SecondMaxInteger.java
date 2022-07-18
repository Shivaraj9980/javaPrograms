package ArrayProgram;

public class SecondMaxInteger {
	public static void main(String[] args) {
		
	
	int a[]= {90,60,80,70,100};
	for(int i =0; i<=a.length-1;i++)
	{
		for(int j=i+1;j<=a.length-1;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println(a[1]);
}
}
