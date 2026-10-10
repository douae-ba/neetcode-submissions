class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            Set<Character> ligne = new HashSet<>();
            Set<Character> colonne = new HashSet<>();
            for(int j=0;j< board[i].length; j++){
                if(board[i][j]!='.' ){
                    if(ligne.contains(board[i][j]))
                    return false;
                }
                ligne.add(board[i][j]);
                if(board[j][i]!='.' ){
                    if(colonne.contains(board[j][i]))
                    return false;
                }
                colonne.add(board[j][i]);
            }            
        }
        for (int i = 0; i <board.length ; i += 3) {
            for (int j = 0; j < board[i].length; j += 3) {
                Set<Character> set = new HashSet<>();
                for (int x = i; x < i + 3; x++) {
                    for (int y = j; y < j + 3; y++) {
                        char value = board[x][y];
                        if (value != '.') {
                            if (set.contains(value)) {
                                return false;
                            }
                            set.add(value);
                        }
                    }
                }
            }
        }
        return true;
    }
}
