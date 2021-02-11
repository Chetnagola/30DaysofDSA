import java.util.*;
public class SilverBar {
	public static int mincut(int n)
	{
		int a= (int)(Math.log(n)/Math.log(2));
		return a;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	    System.out.println(mincut(n));		

	}

}
