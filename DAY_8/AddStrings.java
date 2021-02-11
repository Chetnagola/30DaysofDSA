class Solution {
    public String revers(String a)
    {
        if(a.length() ==0 || a.length() ==1)
            return a;
        int i=0,n=a.length();
        StringBuilder b=new StringBuilder();
        b.append(a);
        b.reverse();
        String c=b.toString();
        return c;
    } 
    public String addStrings(String num1, String num2) {
        String sum=new String();
        int carry=0,n=num1.length(),m=num2.length(),i=0,j=0;
        char c;
        String num1r=revers(num1);
        String num2r=revers(num2);
        while(i<n && j<m)
        {
            int x=num1r.charAt(i)-'0';
            int y=num2r.charAt(j)-'0';
            int z=x+y+carry;
            c=(char)(z%10 +'0');
            carry=z/10;
            sum=sum+c;
            i++;
            j++;
        }
        while(i<n)
        {
            int x=num1r.charAt(i)-'0';
            int z=x+carry;
            c=(char)(z%10 +'0');
            carry=z/10;
            sum=sum+c;
            i++;
        }
        while(j<m)
        {
            int x=num2r.charAt(j)-'0';
            int z=x+carry;
            c=(char)(z%10 +'0');
            carry=z/10;
            sum=sum+c;
            j++;
        }
        if(carry==1)
        sum=sum+(char)(carry+'0');
        String sum2=revers(sum);
        return sum2;
        
    }
}