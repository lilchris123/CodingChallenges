package challenges.strings;
  
public class Crossword { 
    // Rows and columns in the given board 
    private int ROW, COL; 
    private String[][] board;
  
    // For searching in all 8 direction 
    int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 }; 
    int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 }; 
    int[] lastPos = new int[2];
  
    public Crossword(String[][] board,int row, int col){
        this.ROW= row;
        this.COL= col;
        this.board= board;
    }

    // This function searches in all 
    // 8-direction from point 
    // (row, col) in board[][] 
    boolean searchOmniDir(int row, int col, String word) 
    { 
        // If first character of word 
        // doesn't match with 
        // given starting point in grid. 
        if (!board[row][col].equals(String.valueOf(word.charAt(0))))
            return false; 
  
        int wordLen = word.length(); 
  
        // Search word in all 8 directions 
        // starting from (row, col) 
        for (int dir = 0; dir < 8; dir++) { 
            // Initialize starting point 
            // for current direction 
            int k, rd = row + x[dir], cd = col + y[dir]; 
  
            // First character is already checked, 
            // match remaining characters 
            for (k = 1; k < wordLen; k++) { 
                // If out of bound break 
                if (rd >= ROW || rd < 0 || cd >= COL || cd < 0) 
                    break; 
  
                // If not matched, break 
                if (!board[rd][cd].equals(String.valueOf(word.charAt(k)))) 
                    break; 
  
                // Moving in particular direction 
                rd += x[dir]; 
                cd += y[dir]; 
            } 
  
            // If all character matched, 
            // then value of must 
            // be equal to length of word 
            if (k == wordLen) {
                lastPos[0]=rd-x[dir];
                lastPos[1]=cd-y[dir];
                return true;
            }
        } 
        return false; 
    } 
  
    // Searches given word in a given 
    // matrix in all 8 directions 
    public void wordSearch(String word) 
    { 
        // Consider every point as starting 
        // point and search given word 
        for (int row = 0; row < ROW; row++) { 
            for (int col = 0; col < COL; col++) { 
                if (searchOmniDir(row, col, word)) 
                    System.out.println( 
                        word+" "+ row + ":" + col+ " " +lastPos[0]+":"+ lastPos[1]); 
            } 
        } 
    } 
} 


