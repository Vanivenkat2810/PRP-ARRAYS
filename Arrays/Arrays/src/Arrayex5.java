import java.util.Arrays;

public class Arrayex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {83,97,65,99,66};
		Arrays.sort(a);
		System.out.println("Small1:"+a[0]);
		System.out.println("Small2:"+a[1]);
		System.out.println("Large1:"+a[a.length-1]);
		System.out.println("Large2:"+a[a.length-2]);
	}

}
