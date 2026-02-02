class Solution {
    public boolean isValidSudoku(char[][] board) {
        //there are three scenarios 
        // check each row 

        HashSet<Integer> rowSet = new HashSet<>();
        HashSet<Integer> colSet = new HashSet<>();
        HashSet<Integer> boxSet = new HashSet<>();

       for(int i=0;i<board.length;i++){
        for(int j=0;j<board[0].length;j++){
            if(colSet.contains(board[i][j]-'0')
                ||rowSet.contains(board[j][i]-'0')) return false;

            if(board[i][j]!='.') colSet.add(board[i][j]-'0');
            if(board[j][i]!='.') rowSet.add(board[j][i]-'0');

            int r =(i / 3)*3 + j/3;
            int c =(i % 3)*3 + j%3;

            if(boxSet.contains(board[r][c]-'0')) return false;
            if(board[r][c]!='.') boxSet.add(board[r][c]-'0');




        }
        colSet.clear();
        rowSet.clear();
        boxSet.clear();
       }



       return true;
    }
}