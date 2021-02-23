public class PermutationSpaces {
    public static void perspace(String ip, String op, int i)
    {
    	if(i==ip.length())
    	{   System.out.println(op);
    		return;
    	}
    	if(i>0)
    		perspace(ip,op+" "+ip.charAt(i),i+1);
    	perspace(ip,op+ip.charAt(i),i+1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perspace("ABCD","",0);

	}

}
