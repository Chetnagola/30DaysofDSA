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
		int a[]=new int[3];
		int b[]=new int[3];
		int d1,d2,totd,tot,flag;
		while(t>0)
		{
		    int d=s.nextInt();
		    int c=s.nextInt();
		    d1=0;
		    d2=0;
		    totd=0;
		    flag=0;
		    for(int i=0;i<3;i++)
		    {a[i]=s.nextInt();
		     d1+=a[i];
		    }
		    for(int i=0;i<3;i++)
		    {b[i]=s.nextInt();
		     d2+=b[i];
		    }
		    tot=d1+d2+d+d;
		    if(d1>=150)
		    {
		        totd+=d1+c;
		        flag=1;
		    }
		    else
		    totd+=d1+d;
		    if(d2>=150)
		    {
		        if(flag==0)
		        totd+=d2+c;
		        else
		        totd+=d2;
		    }
		    else
		    totd+=d2+d;
		    if(totd<tot)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		    t--;
		      
		}
	}
}
