


public class JavaSee {
    // Iterative implementation of binary search
    public static int binarySearchIterative(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target is greater, ignore left half
            if (arr[mid] < target)
                left = mid + 1;

                // If target is smaller, ignore right half
            else
                right = mid - 1;
        }

        // If target is not present in array
        return -1;
    }

    // Recursive implementation of binary search
    public static int binarySearchRecursive(int[] arr, int target) {
        return binarySearchRecursive(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target)
                return mid;

            // If target is greater, search right half
            if (arr[mid] < target)
                return binarySearchRecursive(arr, target, mid + 1, right);

                // If target is smaller, search left half
            else
                return binarySearchRecursive(arr, target, left, mid - 1);
        }

        // If target is not present in array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int resultIterative = binarySearchIterative(arr, target);
        int resultRecursive = binarySearchRecursive(arr, target);

        if (resultIterative != -1)
            System.out.println("Element found at index (iterative): " + resultIterative);
        else
            System.out.println("Element not found (iterative)");

        if (resultRecursive != -1)
            System.out.println("Element found at index (recursive): " + resultRecursive);
        else
            System.out.println("Element not found (recursive)");
    }
}
