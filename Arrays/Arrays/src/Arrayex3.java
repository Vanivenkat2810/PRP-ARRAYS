import java.util.Scanner;

public class Arrayex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]=new int[] {1,4,34,56,7};
		int n=a.length;
		int e=sc.nextInt();
		int c=0;
		int index=0;
		for(int i=0;i<n;i++)
		{
		
		if(e==a[i])
			{
			  c++;
			     index=i;
				break;
			}
	
			else {
			      c=0;
		
			}
	
		}
		
		
		
		if(c==0)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(index);
		}
	
	}
}
