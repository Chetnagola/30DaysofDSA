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
		int t=s.nextInt();
		while(t>0)
		{
		    String input=s.next();
		    char prev='0';
		    int groups=0;
		    for(int i=0;i<input.length();i++)
		    {
		        if(input.charAt(i)=='1')
		        {
		            if(prev!='1')
		            {groups++;
		             prev='1';
		            }
		        }
		        else
		        prev='0';
		    }
		    System.out.println(groups);
		    t--;
		}
	}
}
