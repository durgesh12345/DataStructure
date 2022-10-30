package Backtracking;

public class RatInMazePrintAllPath {

    public static void main(String[] args) {
        int maze[][] = {{1, 1, 0}, {1, 1, 0}, {1, 1, 1}};
      RatInMaze(maze);

    }

    private static void RatInMaze(int[][] maze) {
        int n = maze.length;
        int path[][] = new int [n][n];

         solveMaze(maze, 0, 0, path);
    }

    private static void solveMaze(int[][] maze, int i, int j, int[][] path) {
        // Check if
        int n = maze.length;
        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return;
        }

        path[i][j] = 1;

        if (i == n - 1 && j == n - 1) {
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < n; l++) {
                    System.out.print(path[k][l]+" ");
                }
                System.out.println();
            }
            System.out.println();

        }

        solveMaze(maze, i -1, j, path);
        solveMaze(maze, i, j + 1, path);
        solveMaze(maze, i + 1, j, path);
        solveMaze(maze, i, j - 1, path);
        path[i][j] = 0;



    }


}
