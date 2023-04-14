package Methods;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9,10};

        System.out.println(Arrays.toString(mergeR(arr1,arr2)));
    }


    public static int[] mergeR(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[j++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr3[j++] = arr2[i];
        }

        return arr3;

    }

}
