package PriorityQueue.MinPriorityQueue;

import java.util.PriorityQueue;

public class InbuildPQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int [] arr = {2,4,6,7,8,1,3,5,9};
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
