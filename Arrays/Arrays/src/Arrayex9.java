
public class Arrayex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{1,10,10,2};
		int n=a.length;
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=10)
			{
				temp[j++]=a[i];
					
				}
				
			}
			for(int k=0;k<n;k++)
			{
			System.out.println(temp[k]);
		}
		}

	}


