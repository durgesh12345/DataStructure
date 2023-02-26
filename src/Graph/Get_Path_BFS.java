package Graph;

import java.io.IOException;
import java.util.*;

public class Get_Path_BFS {
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
        int source = s.nextInt();
        int destination = s.nextInt();
      ArrayList<Integer> list =  bfsgetpath(adjMatrix,source,destination);

       for(Integer i :list){
           System.out.print(i+" ");
       }

    }

    private static ArrayList<Integer> bfsgetpath(int[][] adjMatrix, int s, int e) {
        Queue<Integer> pendingvertices = new LinkedList<>();
        boolean visited[] = new boolean[adjMatrix.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        visited[s] = true;
        pendingvertices.add(s);
        map.put(s,-1);
        boolean pathfound = false;

        while (!pendingvertices.isEmpty()){
            int currentvertex = pendingvertices.poll();
//            System.out.print(currentvertex+" ");
            for (int i = 0; i < adjMatrix.length; i++) {
                if (adjMatrix[currentvertex][i] == 1 && !visited[i]){
//                    System.out.println(currentvertex+" "+i);
                    pendingvertices.add(i);
                    visited[i] = true;
                    map.put(i,currentvertex);
                    if (i==e){
                        pathfound = true;
                        break;
                    }
                }
            }
        }
        if (pathfound){
            ArrayList<Integer> list = new ArrayList<>();
            int currentVertex = e;
            while (currentVertex != -1){
                list.add(currentVertex);
                int parent = map.get(currentVertex);
                currentVertex = parent;

            }
            return list;
        }else{
            return null;
        }
    }
}
