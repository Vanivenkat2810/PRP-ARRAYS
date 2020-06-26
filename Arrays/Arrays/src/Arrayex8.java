
public class Arrayex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{10,3,6,1,2,7,9};
		int sum=0;
		int i=0;
		int n=a.length;
		b:
		for(i=0;i<n;i++)
		{
			if(a[i]==6)
			{
				for(int j=i+1;j<n;j++)
				{
					if(a[j]==7)
					{
						i=j;
						continue b;
					}
				}
			}
			sum=sum+a[i];
		  
		}
		
		
		System.out.println(sum);
		
		
		
		

	}

}
