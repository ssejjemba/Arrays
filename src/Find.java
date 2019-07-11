//Find the largest element in the array.
public class Find {

    public static int FindLargest(int[] arr){
        int largest = Integer.MIN_VALUE;

        for (int i1 : arr) {
            if (i1 > largest)
                largest = i1;
        }

        return largest;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("the largest of all the values in array:" + FindLargest(arr));
    }

}
