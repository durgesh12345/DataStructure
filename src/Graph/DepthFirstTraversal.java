package Graph;

import java.util.Scanner;

public class DepthFirstTraversal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();

        int adjMatrix [][] = new int[n][n];
        for (int i = 0; i < e; i++) {
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
       dfsTraversal(adjMatrix);

        }

    private static void dfsTraversal(int[][] adjMatrix) {
    boolean [] visited = new boolean[adjMatrix.length];
    dfsTraversal2(adjMatrix,0,visited);
}

    private static void dfsTraversal2(int[][] adjMatrix, int currentvertex, boolean[] visited) {
        visited[currentvertex] = true;
        System.out.print(currentvertex+" ");
        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[currentvertex][i] == 1 && visited[i] == false){
                dfsTraversal2(adjMatrix,i,visited);
            }
        }
    }
    }
