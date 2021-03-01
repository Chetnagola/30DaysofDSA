import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		// your code goes here
      Scanner s=new Scanner(System.in);
      int t=s.nextInt();
      long left,right;
      while(t>0)
      {
          int n=s.nextInt();
          left=0;
          right=0;
          int a[]=new int[n];
          for(int i=0;i<n;i++)
          a[i]=s.nextInt();
          Arrays.sort(a);
          left=(a[0]-1)*(a[1]-1) +1;
          right=(a[n-1]-1)*(a[n-2]-1)+1;
          System.out.println(Math.max(left,right));
          t--;
      }
	}
}
