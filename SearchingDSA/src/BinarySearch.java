public class BinarySearch {

    public static void main(String[] args) {
        // Test the binary search method
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 66;
        int res = binarySearch(arr, target);
        System.out.println(res);
    }

    /**
     * Performs a binary search on a sorted array to find the index of a target element.
     * @param arr The sorted array of integers.
     * @param target The target number to search for.
     * @return The index of the target element if found, otherwise -1.
     */
    static int binarySearch(int[] arr, int target) {
        int start = 0; // Start index of the array
        int end = arr.length - 1; // End index of the array
        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;

            // If target is less than the middle element, search in the left half
            if (target < arr[mid]) {
                end = mid - 1;
            }
            // If target is greater than the middle element, search in the right half
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            // If target is equal to the middle element, return its index
            else {
                return mid;
            }
        }
        // If target is not found, return -1
        return -1;
    }
}
