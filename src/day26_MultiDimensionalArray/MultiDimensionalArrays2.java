package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {
        //int[] arr1D = {1,2,3};//single dimensional
        //int[][] arr2D = { {1,2,3},{4,5,6} };//2 dimensional array
        int[][][] arr3D = {{{1,2,3},{4,5,6}}, {{6,7,8},{9,10}}};//3 dimensional array: MUST contain 2 dimensional arrays n-1
        // index:                 0                  1
        //[index numbers of 2D arrays][index numbers of 1D arrays][index numbers of elements]

        System.out.println(Arrays.deepToString(arr3D[1]));//[[6, 7, 8], [9, 10]]
        System.out.println(Arrays.toString(arr3D[0][1]));//[4, 5, 6]
        System.out.println(arr3D[0][0][1]);

        System.out.println("----------------------------------------");
        for (int[][] each2D : arr3D){//for getting each 2 dimensional arrays from the arr3D
            for ( int[] each1D : each2D ){// for getting 1 dimensional arrays from each 2 dimensional array
                for (int element : each1D){// for getting each element from each single dimensional array
                    System.out.print(element + " ");
                }
                System.out.println();//to append new line
            }
        }
        System.out.println("---------------------------------------");
        int[][][][] arr4D ={{{{1,2,3},{4,5,100,6}}, {{6,7,45,8},{9,10}}},  {{{11,12,65,13},{14,15,16,50}}, {{16,212,17,18},{19,20}}}};
        int max = Integer.MIN_VALUE;

        for(int[][][] arr3d : arr4D){
            for (int[][] arr2d : arr3d){
                for (int[] arr1d : arr2d){
                    for (int element : arr1d){
                        if (element > max){
                            max = element;
                        }
                    }
                }
            }
        }

        System.out.println("max = " + max);


    }
}
