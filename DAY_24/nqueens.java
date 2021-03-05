public class NQueens {
    public static void placequeens(boolean board[][],int row,boolean cols[],boolean ndiag[],boolean rdiag[],String ans)
    {
    	if(row==board.length)
    	{
    		System.out.print(ans);
    		return;
    	}
    	for(int col=0;col<4;col++)
    	{
    		if(cols[col]==false && ndiag[row+col]==false && rdiag[row-col+board.length-1]==false)
    		{
    			board[row][col]=true;
    			cols[col]=true;
    			ndiag[row+col]=true;
    		    rdiag[row-col+board.length-1]=true;
    		    placequeens(board,row+1,cols,ndiag,rdiag,ans+row+"+"+col);
        		board[row][col]=false;
    			cols[col]=false;
    			ndiag[row+col]=false;
    		    rdiag[row-col+board.length-1]=false;
        		
    		}
    		
    	}
    	return;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[][]=new boolean[4][4];
		int n=4;
		boolean cols[]=new boolean[4];
		boolean ndiag[]=new boolean[2*n-1];
		boolean rdiag[]=new boolean[2*n-1];
		placequeens(board,0,cols,ndiag,rdiag,"");
		}

}
