 package ArrayProgram;

public class SwapFirstIntToLast {
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		for(int i=0; i<2;i++)
		{
			int temp = a[0];
			for(int j=1; j<a.length;j++) 
			{
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+"");
		}

	}
}
