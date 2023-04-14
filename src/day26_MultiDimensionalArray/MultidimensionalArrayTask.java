package day26_MultiDimensionalArray;

public class MultidimensionalArrayTask {
    /*
    Given:
		int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3

            task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9

            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1

     */
    public static void main(String[] args) {
        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
        //Task 1
        for (int i = arr2D.length-1; i>=0; i--){//i: index number of each single dimensional array
            int[] arr1D = arr2D[i];
            for (int j = 0; j < arr1D.length ; j++) {//j: index number of each element of the single dimensional array
                System.out.print(arr1D[j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");
        //Task 2

        for (int[] arr1D : arr2D){
            for (int i = arr1D.length-1; i >= 0 ; i--) {
                System.out.print(arr1D[i] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        //Task 3

        for (int i = arr2D.length-1; i >=0; i--){
            int[] arr1D = arr2D[i];
            for (int j = arr1D.length-1; j >= 0 ; j--) {
                System.out.print(arr1D[j]+" ");
            }
            System.out.println();
        }


    }
}
