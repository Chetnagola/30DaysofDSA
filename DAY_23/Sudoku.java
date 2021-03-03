public class Sudoku {
	public static void display(int board[][])
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	public static boolean isval(int board[][],int x,int y,int val)
	{
		for(int i=0;i<9;i++)
		{
			if(board[x][i]==val)
				return false;
		}
		for(int i=0;i<9;i++)
		{
			if(board[i][y]==val)
				return false;
		}
		int ci=3*(x/3);
		int cj=3*(y/3);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(board[ci+i][cj+j]==val)
					return false;
			}
		}
		return true;
	}
	public static void solve(int board[][],int i,int j)
	{
		if(i==9)
		{
			display(board);
			return;
		}
		int ni,nj;
		if(j==board.length-1)
		{
			ni=i+1;
			nj=0;
		}
		else
		{
			ni=i;
			nj=j+1;
		}
		if(board[i][j]!=0)
		{
			solve(board,ni,nj);
		}
		else
		{
			for(int po=1;po<10;po++)
			{
				if(isval(board,i,j,po))
				{
					board[i][j]=po;
					solve(board,ni,nj);
					board[i][j]=0;
				}
			
			}
			return;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int board[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		solve(board,0,0);

	}

}
