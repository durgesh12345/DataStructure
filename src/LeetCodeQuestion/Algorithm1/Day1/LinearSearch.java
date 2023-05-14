package LeetCodeQuestion.Algorithm1.Day1;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int target = 5;
      int gettarget =  findTarget(arr,target);
        System.out.println(gettarget);
    }

    private static int findTarget(int[] arr, int target) {
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
