package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

//breath first traversal

public class Solution {
    static  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws NumberFormatException, IOException  {
       String[] strNums;
       strNums = br.readLine().split("\\s");
       int n= Integer.parseInt(strNums[0]);
       int e = Integer.parseInt(strNums[1]);

       if (n==0){
           return;
       }
       int edge[][] = new int[n][n];

        for (int i = 0; i < e; i++) {
            String[] strNums1;
            strNums1 = br.readLine().split("\\s");
            int v1 = Integer.parseInt(strNums1[0]);
            int v2 = Integer.parseInt(strNums1[1]);
            edge[v1][v2] = 1;
            edge[v2][v1] = 1;

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(edge[i][j]+" ");
            }
            System.out.println();
        }
       printbfs(edge);
    }

    private static void printbfs(int[][] edge) {
        boolean visited[] = new boolean[edge.length];
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]){
                printBFSHelper(edge,i,visited);
            }
        }
    }

    private static void printBFSHelper(int[][] edge, int i, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        visited[i] = true;
        queue.add(i);

        while (!queue.isEmpty()){
            int front = queue.remove();
            System.out.print(front+" ");
            for (int j = 0; j < edge.length; j++) {
                if (edge[front][j] == 1 && !visited[j]){
                    visited[j] = true;
                    queue.add(j);
                }
            }
        }

    }
}
