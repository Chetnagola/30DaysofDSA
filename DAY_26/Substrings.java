package helloworld;

public class appl{
	public static void substr(String str)
	{
		for(int i=0;i<=str.length();i++)
		{
			for(int j=i;j<=str.length();j++)
			{
				System.out.print(str.substring(i, j)+" ");
			}
		}
	}
	public static void main(String args[])
	{
		String str="abcd";
		substr(str);
	}
}