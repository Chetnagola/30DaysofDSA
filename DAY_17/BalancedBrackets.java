public class BalancedParenthesis {
    public static void balpar(String op, int open, int close)
    {
    	if(open==0&&close==0)
    	{
    		System.out.println(op);
    		return;
    	}
    	if(open!=0)
    		balpar(op+"(",open-1,close);
    	if(close>open)
    	balpar(op+")",open,close-1);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      balpar("",3,3);
	}

}
