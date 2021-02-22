public class TowerofHanoi {
    public static void  move(int source,int dest,int help,int n)
    {
    	if(n==1)
    	{
    		System.out.println("Moving plate 1 from "+source+" to "+dest);
    		return;
    	}
    	move(source,help,dest,n-1);
    	System.out.println("Moving plate "+n+" from "+source+" to "+dest);
    	move(help,dest,source,n-1);
    	

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int source=1,dest=2,help=3;
        move(1,2,3,n);		

	}

}
