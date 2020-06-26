
public class Arrayex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=args.length;
		int a[][]=new int[2][2];
		if(n<4) {
			System.out.println("please enter  4 integer number");
		}
		int k=0;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				a[i][j]=Integer.parseInt(args[k]);
				k++;
			}
		}
		System.out.println("The given Array is");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		System.out.println("The Reverse of the array is");
		for(int i=1;i>=0;i--)
		{
			for(int j=1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
