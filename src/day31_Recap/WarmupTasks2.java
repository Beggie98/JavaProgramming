package day31_Recap;

import Utilities.StringUtility;

import java.util.Arrays;

public class WarmupTasks2 {
    public static void main(String[] args) {
        String sentence = "Cybertek CYbertek cyberTEK cybertek";

        System.out.println(StringUtility.frequencyOfWord(sentence,"cybertek"));

        System.out.println("---------------------------------------------");

        int[] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(addElement(arr,6)));

        System.out.println("-------------------------------------");

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6,7,8};

        System.out.println(Arrays.toString(mergeArrays(arr1,arr2)));
        System.out.println("------------------------------------");

        int[] array = {1,2,3,4,5};
        System.out.println("Contains: " + contains(array,5));
        System.out.println("------------------------------------------");

        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(reversedIntArray(nums)));

    }

    public static int[] addElement(int[] arr, int element){

        int[] arr1 = Arrays.copyOf(arr,arr.length+1);

        arr1[arr1.length-1] = element;

        return arr1;

    }

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length+arr2.length];

        int j=0;
        for (int each : arr1){
            arr3[j++] = each;
        }

        for (int each : arr2){
            arr3[j++] = each;
        }

        return arr3;
    }

    public static boolean contains(int[] arr, int num){
        int count = 0;
        for (int each : arr) {
            if (each == num){
                count++;
            }
        }

        return !(count==0);

    }

    public static int[] reversedIntArray(int[] nums){
        int[] nums1 = new int[nums.length];

        for (int i = 0, j=nums.length-1; i < nums1.length ; i++, j--) {
            nums1[i] = nums[j];
        }

        return nums1;
    }

}
