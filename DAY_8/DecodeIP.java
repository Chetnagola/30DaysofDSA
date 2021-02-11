class Solution {
    public String defangIPaddr(String address) {
        String newadd=new String();
        int i=0;
        while(i<address.length())
        {
            if(address.charAt(i)=='.')
            {
                newadd=newadd+"[.]";
            }    
            else
                newadd=newadd+address.charAt(i);
            i++;
        }
        return newadd;
        
    }
}