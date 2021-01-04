/*
This problem was asked by Google.
You are given an M by N matrix consisting of booleans that represents a board. 
Each True boolean represents a wall. Each False boolean represents a tile you can walk on.

Given this matrix, a start coordinate, and an end coordinate, 
return the minimum number of steps required to reach the end coordinate from the start. 
If there is no possible path, then return null. You can move up, left, down, and right. 
You cannot move through walls. You cannot wrap around the edges of the board.

For example, given the following board:

[[f, f, f, f],
[t, t, f, t],
[f, f, f, f],
[f, f, f, f]]
and start = (3, 0) (bottom left) and end = (0, 0) (top left), 
the minimum number of steps required to reach the end is 7, 
since we would need to go through (1, 2) because there is a wall everywhere else on the second row.

algos
recursively try every path
storing the visited points and its result
*/
package challenges.daily;

public class Problem23 {
    static int n=4;
    static boolean v[][]= new boolean[n][n];
    static int dp[][]= new int[n][n];
    
    static boolean invalidPoint(boolean board[][], int point[]){
        int rowLen = n;
        int colLen = n;

        if((point[0] >= 0 && point[0] < rowLen) 
            && (point[1] >= 0 && point[1] < colLen)
            && (board[point[0]][point[1]] == false))
        return false;

        return true;
    }

    static int[] movePoint(int[] point, boolean left, boolean up, boolean right, boolean down){
        int moved[]= { point[0], point[1] };
        if(left)
            moved[1] -= 1;
        if(up)
            moved[0] += 1;
        if(right)
            moved[1] += 1;
        if(down)
            moved[0] -= 1;
        return moved;
    }
    public static int minSteps(boolean board[][], int point[], int end[]){
        //if at end point return 0;
        if(point[0] == end[0] && point[1] == end[1]) return 0;

        // check if point is invalid
        if(invalidPoint(board, point))
            return 99999;

        // if point was already visited return its calculated value;
        if(v[point[0]][point[1]])
            return dp[point[0]][point[1]];

        v[point[0]][point[1]]= true;
        dp[point[0]][point[1]]= 99999;

        //set visited to true 
        //initial value

        dp[point[0]][point[1]]=
        Math.min(
            Math.min(
                minSteps(board, movePoint(point,true,false,false,false), end)+1,
                minSteps(board, movePoint(point,false,true,false,false), end)+1),
            Math.min(
                minSteps(board, movePoint(point,false,false,true,false), end)+1,
                minSteps(board, movePoint(point,false,false,false,true), end)+1)
        );

        return dp[point[0]][point[1]];
    }
}