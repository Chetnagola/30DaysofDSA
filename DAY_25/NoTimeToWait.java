/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int h=s.nextInt();
		int x=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int sum,flag=0;
		for(int i=0;i<n;i++)
		{
		    if(x+a[i]>=h)
		    {
		        flag=1;
		    }
		}
		if(flag==1)
		System.out.println("YES");
		else
		System.out.println("NO");
	}
}