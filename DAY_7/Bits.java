class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        while(i<bits.length)
        {
            if(bits[i]==0)
            {  i+=1;
               if(i==bits.length)
                   return true;
            }
            else
                i+=2;
        }
         return false;        
    }
}