package Backtracking;

public class ratInMaze {
    public static void main(String[] args) {
        int maze[][] = {{1, 1, 0}, {1, 1, 0}, {1, 1, 1}};
        boolean PathPossible = RatInMaze(maze);
        System.out.println(PathPossible);
    }


    private static boolean RatInMaze(int[][] maze) {
        int n = maze.length;
        int path[][] = new int [n][n];

       return solveMaze(maze, 0, 0, path);
    }

    private static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {
        // Check if
        int n = maze.length;
        if (i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }

        path[i][j] = 1;

        if (i == n - 1 && j == n - 1) {
            for (int k = 0; k < n; k++) {
                for (int l = 0; l < n; l++) {
                    System.out.print(path[k][l]+" ");
                }
                System.out.println();
            }
            return true;
        }

        if (solveMaze(maze, i - 1, j, path)) {
            return true;
        }
        if (solveMaze(maze, i, j + 1, path)) {
            return true;
        }
        if (solveMaze(maze, i + 1, j, path)) {
            return true;
        }
        if (solveMaze(maze, i, j - 1, path)) {
            return true;
        }

        return false;
    }


}
