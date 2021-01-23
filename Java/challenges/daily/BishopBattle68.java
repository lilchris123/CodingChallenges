package challenges.daily;
/* Daily Coding Problem 68 (Medium)
This problem was asked by Google.
On our special chessboard, two bishops attack each other if they share the same diagonal. 
This includes bishops that have another bishop located between them, i.e. bishops can attack through pieces.
You are given N bishops, represented as (row, column) tuples on a M by M chessboard. 
Write a function to count the number of pairs of bishops that attack each other. 
The ordering of the pair doesn't matter: (1, 2) is considered the same as (2, 1).

For example, given M = 5 and the list of bishops:

(0, 0)
(1, 2)
(2, 2)
(4, 0)
The board would look like this:

[b 0 0 0 0]
[0 0 b 0 0]
[0 0 b 0 0]
[0 0 0 0 0]
[b 0 0 0 0]
You should return 2, since bishops 1 and 3 attack each other, as well as bishops 3 and 4.

algo
1) variable to store possible battles
2) create a 2d array to check if a cell has been visited
3) Iterate through each cell of the board
    if cell is a bishop and is not visited
        DFS- upper left diagnol 
        DFS- upper right diagnol
        DFS- lower left diagnol
        DFS- lower right diagnol
    if battled mark cell as visited
3) return numBattles

DFS()- simulates the bishop movements 
DFS(board, int[] position,int[] movement)
recrusively move the bishop to the next valid position
1) if current position is invalid or visited cell 
    return 0 // no bishop in its path
2) else if curr position is another bishop and unvisited
    return 1 // there is another bishop to battle

3) move bishop to next cell by recursively calling DFS
*/

public class BishopBattle68 {
    
    // track bishops that already initiated a battle
    static boolean[][] visited;

    static int DFS(char[][] board, int[] pos, int[] movement){
        //move bishop to next cell, with movement
        int[] mpos= new int[2];
        mpos[0]=pos[0]+movement[0];
        mpos[1]=pos[1]+movement[1];

        int len = board.length -1;
        
        // if position is out of bounce or its an invalid bishop return no battle
        if((mpos[0] > len || mpos[0] < 0 || mpos[1] > len || mpos[1] < 0) || visited[mpos[0]][mpos[1]] )
            return 0;
        // if position in board is a unvisited bishop return a battle
        if(board[mpos[0]][mpos[1]] == 'b' && !visited[mpos[0]][mpos[1]])
            return 1;

        //else move bishop with DFS
       return DFS(board, mpos, movement);
    }
    
    public static int bishopBattles(char[][] board){
        int numBattles=0;
        // track bishops that already initiated a battle
        int M= board.length;
        visited = new boolean[M][M];
        
        // Bishop movement patterns 
        int[] upperLeft={-1,-1};
        int[] upperRight={-1,1};
        int[] lowerLeft={1,-1};
        int[] lowerRight={1,1};

        // iterate through the chess board
        for(int row=0; row < M; row++){
            for(int col=0; col < M; col++){
                //current position
                int[] pos={row,col};
                int currBattles=0;

                //cell is a bishop
                if(board[pos[0]][pos[1]] == 'b'){
                    currBattles+= DFS(board, pos, upperLeft );
                    currBattles+= DFS(board, pos, upperRight );
                    currBattles+= DFS(board, pos, lowerLeft);
                    currBattles+= DFS(board, pos, lowerRight);
                }

                //if battles occurred visit bishop and add battles to total
                if(currBattles > 0){
                    visited[pos[0]][pos[1]]= true;
                    numBattles+=currBattles;
                }
            }
        }
        return numBattles;
    }
}
