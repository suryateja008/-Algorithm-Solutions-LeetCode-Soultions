public class Solution {
   public boolean isValidSudoku(char[][] board){
           boolean row[][] = new boolean[9][9];
           boolean col[][] = new boolean[9][9];
           boolean block[][] = new boolean[9][9];
           int r;
           
           for(int i=0;i<9;i++)
           {
               for(int j=0;j<9;j++)
               {
                   
                  if(board[i][j]!='.')
                  {
                      r = board[i][j] - '1'; 
                      if(row[i][r] || col[j][r] || block[i-i%3+j/3][r])
                          return false;
                      row[i][r] = col[j][r] = block[i-i%3+j/3][r] = true;
                  }
               }
           }
           return true;
        }
}
