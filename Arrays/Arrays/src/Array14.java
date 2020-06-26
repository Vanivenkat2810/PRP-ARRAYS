

public class Array14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length;
		int a[][]=new int[3][3];
		int max=a[0][0];
		if(n<9) {
			System.out.println("please enter  9 integer number");
		}
		int k=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=Integer.parseInt(args[k]);
				k++;
			}
		}
		System.out.println("The given Array is");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{ 
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		 
		System.out.println("The biggest number in the array is");
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(max<a[i][j])
				{
					max=a[i][j];
				}
				else
				{
					max=max;
				}
			}
		}
		System.out.println(max);
	}
}
				

	