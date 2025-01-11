public class soduku {
    public static  boolean solvesoduku (char[][] board)
    {
        for(int row=0;row<9;row++)
        {
            for(int col=0;col<9;col++)
            {
             if (board[row][col]=='.')
            
             {
                for(char num='1'; num<='9';num++)
                {
                    if(isSafe(board,row,col,num))
                    {
                        board[row][col]=num;
                        if(solvesoduku(board))
                        {
                            return true;
                        }
                    
                    board[row][col]='.';
                }
             
             }
             return false;
            }
        }
    }
        return true;
    }
    public static void printboard(char[][] board)
    {
        for(char[] x:board)
        {
            for(char c:x){
            System.out.print(c+ " ");
        }
        System.out.println(" ");
    }
    }
    

    public static void main(String args[])
    {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println("the unsolved soduku is");
        printboard(board);
        System.out.println("");
        solvesoduku(board);
        printboard(board);
    }
    public static boolean isSafe(char[][]board,int row,int col, char num)
    {
 for(int i=0;i<9;i++)
 {
    if(board[row][i]==num||board[i][col]==num)
    {
        return false;
    }
 }
 int rowstart=(row/3)*3;
 int colstart=(col/3)*3;
 for(int i=rowstart;i<rowstart+3;i++)
 {
    for(int j=colstart;j<colstart+3;j++)
    {
        if(board[i][j]==num)
        {
            return false;
        }
    }
 }
return true;
    }
   
}
