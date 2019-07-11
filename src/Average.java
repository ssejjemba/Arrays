//Find average of all the elements in an array.

public class Average {
    public static int AverageArray(int[] arr) {
        int size = arr.length;
        int total=0;
        int index=0;
        for(index=0;index<size;index++)
            total = total + arr[index];
        return total / size;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("average of all the values in array:" + AverageArray(arr));
    }
}
