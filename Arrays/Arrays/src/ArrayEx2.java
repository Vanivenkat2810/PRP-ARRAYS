
import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		
		int a[]=new int[] {1,2,1110,6,89};
		int n=a.length;
		int max=a[0];
		int min=a[0];
		
	
		for(int i=1;i<n;i++)
		{
			
					
			if(a[i]>max)
			{
				max=a[i];
				
				
			}
			if(a[i]<min)
			{
				min=a[i];
				
			}
			
		}
	
	
		      System.out.println("Maximum:" +max);
		       System.out.println("Minimum:"+min);
		}	

}









