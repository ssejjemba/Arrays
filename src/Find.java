
public class Find {

    //Find the largest element in the array.
    public static int FindLargest(int[] arr){
        int largest = Integer.MIN_VALUE;

        for (int i1 : arr) {
            if (i1 > largest)
                largest = i1;
        }

        return largest;
    }

    //Find the smallest element in the array.
    public static int FindSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;

        for (int i1 : arr) {
            if (i1 < smallest)
                smallest = i1;
        }

        return smallest;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("the largest of all the values in array:" + FindLargest(arr));
        System.out.println("the smalles of all the values in array:" + FindSmallest(arr));
    }

}
