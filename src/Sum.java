public class Sum {

    public static int SumArray(int arr[]) {
        int size = arr.length;
        int total=0;
        int index=0;
        for(index=0;index<size;index++)
            total = total + arr[index];
        return total;
    }

    //Find the sum of all the elements of a two dimensional array.
    public static int Sum2DArray(int[][] arr, int r, int c) {
        int total = 0;
        for(int i = 0; i<r; i++)
            for(int j = 0; j<c; j++)
                total = total + arr[i][j];

        return total;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[][] a = new int[2][4];
        //initialisation
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 4; j++)
                a[i][j] = j;

        System.out.println("sum of all the values in array:" + SumArray(arr));
        System.out.println("sum of all the values in 2D array:" + Sum2DArray(a, 2, 4));
    }
}
