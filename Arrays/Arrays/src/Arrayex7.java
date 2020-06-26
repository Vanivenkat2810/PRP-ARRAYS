import java.util.Arrays;

public class Arrayex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{12,34,12,45,67};
		Arrays.sort(a);
		int j=0;
		for(int i=0;i<a.length-1;i++)
		{
			
			if(a[i]!=a[i+1])
			{
				a[j++]=a[i];
				a[j++]=a[a.length-1];
				
			}
			
		}
		a[j++]=a[a.length-1];
		
		for(int i=0;i<j;i++)
		{
			System.out.println(a[j]);
		}

	}

}
