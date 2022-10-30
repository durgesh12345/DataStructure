package Graph;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BreathFirstTraversal {
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

        bfs(adjMatrix);
        System.out.println();
//        System.out.println("|  0  |_|  1  |_|  2  |_|  3  |_|  4  |_");
//        for (int i = 0; i < adjMatrix.length; i++) {
//            for (int j = 0; j < adjMatrix.length; j++) {
//                System.out.print("["+adjMatrix[i][j]+"]");
//            }
//            System.out.println();
//        }
    }

    private static void bfs(int[][] adjMatrix) {
        Queue<Integer> pendingvertices = new LinkedList<>();
        boolean visited[] = new boolean[adjMatrix.length];
        visited[0] = true;
        pendingvertices.add(0);
        while (!pendingvertices.isEmpty()){
            int currentvertex = pendingvertices.poll();
            System.out.print(currentvertex+" ");
            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[currentvertex][i] == 1 && !visited[i]){
//                    System.out.println(currentvertex+" "+i);
                    pendingvertices.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
