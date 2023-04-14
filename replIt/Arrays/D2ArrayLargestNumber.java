package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class D2ArrayLargestNumber {
    /*
    Given a 2d array of ints, find the biggest number(int) in the array and print it.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size for 2D Array");
        int size2D = input.nextInt();

        System.out.println("Enter size for 1D Array");
        int size1D = input.nextInt();


        int[][] nums2DArray = new int[size2D][size1D];

        for (int i = 0; i < size2D; i++) {
            for (int j = 0; j < size1D; j++) {
                nums2DArray[i][j] = input.nextInt();
            }
        }

        int max = nums2DArray[0][0];

        System.out.println(Arrays.deepToString(nums2DArray));

        for (int[] each1D : nums2DArray){
            for (int element : each1D){
                if (element > max){
                    max = element;
                }
            }
        }

        System.out.println("max = " + max);
        input.close();
    }
}
