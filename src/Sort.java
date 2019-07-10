public class Sort {
    public static int SequentialSearch(int[] arr, int size, int value)
    {
        int i = 0;
        for(i = 0; i < size; i++) {
            if(value == arr[i] )
                return i;
        }
        return -1;
    }

    // Binary Search Algorithm – Iterative Way
    public static int BinarySearch (int[] arr, int size, int value)
    {
        int mid;
        int low = 0;
        int high = size-1;
        while (low <= high)
        {
            mid = low + (high-low)/2; // To avoid the overflow
            if (arr[mid] == value)
                return mid;
            else if (arr[mid] < value)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
