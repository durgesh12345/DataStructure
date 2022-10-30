package PriorityQueue.PracticeQuetion;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class kthLargestElement {
    public static void main(String[] args) {
        int [] arr = {2,3,4,1,5,8,6,7,9};
        int k =4;
      ArrayList<Integer> list =  klargetst(arr,k);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static ArrayList<Integer> klargetst(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length ; i++) {
            int temp = pq.peek();
            if(temp < arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        while (!pq.isEmpty()){
            list.add(pq.peek());
            pq.remove();
        }

        return list;
    }


}
