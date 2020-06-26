
public class Arraysex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{1,4,1,4};
		int n=a.length;
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==1 || a[i]==4)
			{
				
				c++;
			}
		}
		if(c==n)
		{
				System.out.println("true");
		}
			else
			{
			System.out.println("false");
		}

	}
	}

