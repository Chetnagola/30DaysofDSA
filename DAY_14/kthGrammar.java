class Solution {
    public int kthGrammar(int N, int K) {
    if(N==1||K==1)
        return 0;
    int len=(int)Math.pow(2,N-1);
    if(K<=len/2)
    {
       return kthGrammar(N-1,K);
    }
   
      int ans=kthGrammar(N-1,K-(len/2));  
      if(ans==0)
          return 1;
        return 0;
    }
}