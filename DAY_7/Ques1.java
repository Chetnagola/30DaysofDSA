public class JeeSeatAllotment {
	public static void allotment(int a[][], int choice[],int cat[],int allot[]) throws Exception 
	{
		int n=choice.length;
		int ch,cate;
		for(int i=0;i<n;i++)
		{
			ch=choice[i];
			cate=cat[i];
			if(ch==0 || cate==0)
			{
				throw new Exception ("Invalid Input");
			}
			if(a[ch-1][cate-1]>0)
			{
				a[ch-1][cate-1]-=1;
				allot[i]=ch;
			}
			else
			{
				allot[i]=0;
			}
				
			}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       int a[][]= { {5,3,2,1},{4,2,1,0},{6,4,3,2},{8,7,5,2}};
       int choice[]= {2,1,3,4,2};
       int cat[]= {4,2,4,1,1};
       int allot[]=new int[5];
       allotment(a,choice,cat,allot);
       for(int i=0;i<5;i++)
       {
    	   System.out.println("Department Alloted to rank "+(i+1)+"= "+allot[i]);
       }
       System.out.println("Seat Status Department wise and Category wise");
       for(int i=0;i<4;i++)
       {
    	   for(int j=0;j<4;j++)
    	   System.out.print(a[i][j]+" ");
    	   System.out.println();
       }
    	   
	}

}
