public class Palindrome {
	static String c=new String();
    public static void rev(String a, int i)
    {
    	if(i==a.length())
    		return  ;
    	rev(a,i+1);
    	c+=a.charAt(i);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="chetna";
		rev(a,0);
		if(a.equals(c))
		System.out.print("yes it's a palindrome");
		else
		System.out.println("No, not a plaindrome");

	}

}
