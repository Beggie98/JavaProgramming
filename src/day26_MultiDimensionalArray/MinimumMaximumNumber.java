package day26_MultiDimensionalArray;

public class MinimumMaximumNumber {
    /*

 write a program that can find the maximum & minimum number from any two dimensional array
                {{10,20,30},{40,50,60,70,80}};
                max: 80
                min: 10
     */
    public static void main(String[] args) {
        int[][] arr2D =  {{10,20,30},{40,50,60,70,80}};
        int min = arr2D[0][0];
        int max = arr2D[0][0];
        double sum = 0;
        int count = 0;

        for (int[] arr1D : arr2D){
            for (int element : arr1D){
                count++;
                sum += element;
                if (element > max){
                    max = element;
                }
                if (element < min){
                    min = element;
                }
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("sum = " + sum);
        System.out.println("Average = " + sum/count);
    }
}
