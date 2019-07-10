public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,4,-4,6,-14,8,2};
        System.out.println("Max sub array sum :" + maxSubArraySum(arr, 9));
    }
    public static int maxSubArraySum(int[] a, int size) {
        int maxSoFar = 0, maxEndingHere = 0;
        for (int i = 0; i < size; i++) {
            maxEndingHere = maxEndingHere + a[i];
            if (maxEndingHere < 0)
                maxEndingHere = 0;
            if (maxSoFar < maxEndingHere)
                maxSoFar = maxEndingHere;
        }
        return maxSoFar;
    }
}
