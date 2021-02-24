public class NBitBinaryNumber {
    public static void binarynum(String op,int n,int one,int zero)
    {
    	if(n==0)
    	{
    		System.out.println(op);
    		return;
    	}
    	binarynum(op+"1",n-1,one+1,zero);
    	if(one>zero)
    	binarynum(op+"0",n-1,one,zero+1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       binarynum("",3,0,0);
	}

}