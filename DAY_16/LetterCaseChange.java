public class LetterCaseChange {
    public static void subseq(String ip, String op)
    {
    	if(ip.isEmpty())
    	{
    		System.out.println(op);
    		return;
    	}
    	if(Character.isUpperCase(ip.charAt(0)))
        {subseq(ip.substring(1),op+Character.toLowerCase(ip.charAt(0)));
        subseq(ip.substring(1),op+ip.charAt(0));
        }
    	if(Character.isLowerCase(ip.charAt(0)))
    	{subseq(ip.substring(1),op+Character.toUpperCase(ip.charAt(0)));
    	 subseq(ip.substring(1),op+ip.charAt(0));
    	}
    	if(Character.isDigit(ip.charAt(0)))
    		subseq(ip.substring(1),op+ip.charAt(0));
    		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       subseq("a1b1","");
	}

}
