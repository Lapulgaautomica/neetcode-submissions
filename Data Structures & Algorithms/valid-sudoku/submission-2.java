class Solution {
    public boolean isValidSudoku(char[][] board) {    
    HashSet<Character>[] rowSet=new HashSet[9];
    HashSet<Character>[] colSet=new HashSet[9];
    HashSet<Character>[] boxSet=new HashSet[9];       
   for(int i=0;i<9;i++){
    rowSet[i]=new HashSet();
    colSet[i]=new HashSet();
    boxSet[i]=new HashSet();
   }
   for(int r=0;r<9;r++){
        for(int c=0;c<9;c++){
            char val=board[r][c];
            if(val=='.') continue;
            int boxIndex= (r/3)*3+(c/3);
                if(rowSet[r].contains(val)||
                    colSet[c].contains(val)||
                    boxSet[boxIndex].contains(val)){
                    return false;
                }
            rowSet[r].add(val);
            colSet[c].add(val);
            boxSet[boxIndex].add(val);
         }
   }
        return true;
    }
}
