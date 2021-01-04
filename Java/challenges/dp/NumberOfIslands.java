package challenges.dp;

import java.util.*;

public class NumberOfIslands {
    public static int ROW;
    public static int COL;

    static void DFS(int[][] board, int row, int col, boolean[][] visited) {
        // if out of bounds or water or visited return OUT OF BOUNDS CHECK
        if (row < 0 || col < 0 || row >= ROW || col >= COL || board[row][col] == 0 || visited[row][col])
            return;

        // mark cell as visited
        visited[row][col] = true;

        // visit all the cells part of the land (up,down,right,left)
        DFS(board, row + 1, col, visited);
        DFS(board, row - 1, col, visited);
        DFS(board, row, col + 1, visited);
        DFS(board, row, col - 1, visited);
    }

    static void BFS(int[][] board, int row, int col, boolean[][] visited) {
        //positions of neighbors up,down,left,right cells
        int neighborRow[] = { -1, 1, 0, 0 };
        int neighborCol[] = { 0, 0, -1, 1 };
        visited[row][col] = true;

        Queue<Integer[]> q = new LinkedList<>();
        Integer[] cell = new Integer[2];
        cell[0] = row;
        cell[1] = col;
        q.add(cell);

        while (!q.isEmpty()) {
            cell = q.peek();
            q.poll();

            for (int k = 0; k < 4; k++) {
                // point to the next neighbor
                int r = cell[0] + neighborRow[k];
                int c = cell[1] + neighborCol[k];

                // if out of bounds or water or visited skip cell
                if (r < 0 || c < 0 || r >= ROW || c >= COL || board[r][c] == 0 || visited[r][c]) continue;

                visited[r][c] = true;
                cell[0] = r;
                cell[1] = c;
                q.add(cell);
            }
        }
    }

    public static int numIslands(int[][] board, boolean[][] visited) {

        int islands = 0;
        for (int row = 0; row < ROW; row++) {
            for (int col = 0; col < COL; col++) {

                // if land and not visited, visit all its land and then increment count
                if (board[row][col] == 1 && !visited[row][col]) {
                    BFS(board, row, col, visited);
                    islands++;
                }

            }
        }

        return islands;
    }
}
