public class PrintSequence {
	public static void printinc(int n)
	{
		if(n==0)
			return;
		
		System.out.print(n+" ");
		printinc(n-1);
		System.out.print(n+" ");
	}
	public static void main(String args[])
	{
		printinc(7);
	}
}
