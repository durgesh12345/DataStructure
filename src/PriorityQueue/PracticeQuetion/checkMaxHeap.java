package PriorityQueue.PracticeQuetion;

import java.util.PriorityQueue;

public class checkMaxHeap {
    public static void main(String[] args) {
        int [] arr = {2 ,20, 18, 6 ,14, 11, 9, 4};
        boolean ans = checkmax(arr);
        System.out.println(ans);
    }

    private static boolean checkmax(int[] arr) {

        int n = arr.length;
        for (int i = (n/2)-1; i >= 0; i--) {
            downHeapify(arr,i,n);
        }
        return true;
    }
    private static void downHeapify(int[] arr, int i, int n) {
        int parentIndex = i;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;

        while (leftChildIndex < n) {
            int minchildIndex = parentIndex;
            if (arr[leftChildIndex] < arr[minchildIndex]) {
                minchildIndex = leftChildIndex;
            }
            if (rightChildIndex < n && arr[rightChildIndex] < arr[minchildIndex]) {
                minchildIndex = rightChildIndex;
            }
            if (minchildIndex == parentIndex) {
                return;
            }
            int temp = arr[parentIndex];
            arr[parentIndex] = arr[minchildIndex];
            arr[minchildIndex] = temp;
            parentIndex = minchildIndex;
            leftChildIndex = 2 * parentIndex + 1;
            rightChildIndex = 2 * parentIndex + 2;
        }
    }
}
