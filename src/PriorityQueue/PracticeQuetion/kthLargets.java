package PriorityQueue.PracticeQuetion;

import java.util.PriorityQueue;

public class kthLargets {
    public static void main(String[] args) {
        int arr [] = {1,3,3,4,5,6,9};
        int k =4;
        int n = args.length;
        kth(arr,n,k);
    }

    private static void kth(int[] arr, int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
            pq1.add(arr[i]);
        }
        int count=0;
        while (count <= k-1){
            pq.remove();
        }

        int min = pq.peek();

    }
}
