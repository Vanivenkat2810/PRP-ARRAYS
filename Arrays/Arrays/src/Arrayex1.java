import java.util.Scanner;

public class Arrayex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
       
        int a[] = new int[] {1,7,8,5};
        int sum=0;
        int n;
        n=a.length;
        
        for(int i = 0; i < n; i++)
        {
            
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        float Average=sum/n;
        System.out.println("Average:"+Average);
		
	}
}
