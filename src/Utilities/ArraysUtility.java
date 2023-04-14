package Utilities;

import java.util.Arrays;

public class ArraysUtility {
    //1. Create a function that can return the maximum number from an array of integer
            // max(new int[]{10,20,30}) ==> 30
    //
    // 1. Create a function that can return the minimum number from an array of integer
            // min(new int[]{10,20,30}) ==> 30

    public static int maxNumberFromArray(int[] nums){
        int max = nums[0];

        for (int num : nums){
            max = Math.max(num, max);
        }
        return max;
    }

    public static double maxNumberFromArray(double[] nums){
        double max = nums[0];

        for (double num : nums){
            max = Math.max(num, max);
        }
        return max;
    }

    public static int minNumberFromArray(int[] nums){
        int min = nums[0];

        for (int num : nums){
            min = Math.min(num, min);
        }
        return min;
    }

    public static double minNumberFromArray(double[] nums){
        double min = nums[0];

        for (double num : nums){
            min = Math.min(num, min);
        }
        return min;
    }


    //to add an element to an array
    public static int[] addElement(int[] arr, int element){

        int[] arr1 = Arrays.copyOf(arr,arr.length+1);

        arr1[arr1.length-1] = element;

        return arr1;

    }


    //to merge two int arrays
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


    //to merge two double arrays
    public static double[] mergeArrays(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length+arr2.length];

        int j=0;
        for (double each : arr1){
            arr3[j++] = each;
        }

        for (double each : arr2){
            arr3[j++] = each;
        }

        return arr3;
    }

    
    //to merge two String arrays
    public static String[] mergeArrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length+arr2.length];

        int j=0;
        for (String each : arr1){
            arr3[j++] = each;
        }

        for (String each : arr2){
            arr3[j++] = each;
        }

        return arr3;
    }

    
    //to merge two char arrays
    public static char[] mergeArrays(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length+arr2.length];

        int j=0;
        for (char each : arr1){
            arr3[j++] = each;
        }

        for (char each : arr2){
            arr3[j++] = each;
        }

        return arr3;
    }


    

    //to reverse an array
    public static int[] reversedIntArray(int[] nums){
        int[] nums1 = new int[nums.length];

        for (int i = 0, j=nums.length-1; i < nums1.length ; i++, j--) {
            nums1[i] = nums[j];
        }

        return nums1;
    }


    public static double[] addElement(double[] array, double number){
        double[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = number;
        return result;
    }

    public static String[] addElement(String[] array, String str){
        String[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = str;
        return result;
    }

    public static char[] addElement(char[] array, char ch){
        char[] result = Arrays.copyOf(array, array.length+1);
        result[result.length-1] = ch;
        return result;
    }


    public static int[] removeElement(int[] array, int index){

        if (index < 0 || index > array.length-1){
            System.out.println("Invalid Index");
            System.exit(0);
        }

        int[] arr = new int[array.length-1];

        for (int i = 0, j=0; i <array.length ; i++) {
            if (i == index){
                continue;
            }else {
                arr[j++] = array[i];
            }
        }

        return arr;

    }

    public static double[] removeElement(double[] array, double index){

        if (index < 0 || index > array.length-1){
            System.out.println("Invalid Index");
            System.exit(0);
        }

        double[] arr = new double[array.length-1];

        for (int i = 0, j=0; i <array.length ; i++) {
            if (i == index){
                continue;
            }else {
                arr[j++] = array[i];
            }
        }

        return arr;

    }

    public static String[] removeElement(String[] array, int index){

        if (index < 0 || index > array.length-1){
            System.out.println("Invalid Index");
            System.exit(0);
        }

        String[] arr = new String[array.length-1];

        for (int i = 0, j=0; i <array.length ; i++) {
            if (i == index){
                continue;
            }else {
                arr[j++] = array[i];
            }
        }

        return arr;

    }

    public static char[] removeElement(char[] array, int index){

        if (index < 0 || index > array.length-1){
            System.out.println("Invalid Index");
            System.exit(0);
        }

        char[] arr = new char[array.length-1];

        for (int i = 0, j=0; i <array.length ; i++) {
            if (i == index){
                continue;
            }else {
                arr[j++] = array[i];
            }
        }

        return arr;

    }

    //reverses a given int array
    public static int[] reverseArray(int[] array){
        int[] result = new int[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }

    //reverses a given double array
    public static double[] reverseArray(double[] array){
        double[] result = new double[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }

    //reverses a given String array
    public static String[] reverseArray(String[] array){
        String[] result = new String[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }


    //reverses a given char array
    public static char[] reverseArray(char[] array){
        char[] result = new char[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }



    //to check if a num is contained in an array
    public static boolean contains(int[] array, int element){
        boolean result = false;

        for (int each : array){
            if (each == element){
                return true;
            }
        }


        return false;
    }

    ////to check if a double is contained in an array
    public static boolean contains(double[] array, double element){
        boolean result = false;

        for (double each : array){
            if (each == element){
                return true;
            }
        }


        return false;
    }


    //to check if a string is contained in an array
    public static boolean contains(String[] array, String element){
        boolean result = false;

        for (String each : array){
            if (each.equals(element)){
                return true;
            }
        }


        return false;
    }


    //to check if a char is contained in an array
    public static boolean contains(char[] array, char element){
        boolean result = false;

        for (char each : array){
            if (each == element){
                return true;
            }
        }


        return false;
    }



    //returns frequency of a given element in a given array
    public static int frequency(int[] array, int element){
        int count = 0;

        for (int each : array) {
            if (each == element){
                count++;
            }
        }

        return count;

    }

    public static int frequency(double[] array, double element){
        int count = 0;

        for (double each : array) {
            if (each == element){
                count++;
            }
        }

        return count;

    }

    public static int frequency(String[] array, String element){
        int count = 0;

        for (String each : array) {
            if (each.equals(element)){
                count++;
            }
        }

        return count;

    }

    public static int frequency(char[] array, char element){
        int count = 0;

        for (char each : array) {
            if (each == element){
                count++;
            }
        }

        return count;

    }


    //returns unique elements in a given array
    public static int[] unique(int[] array){
        int[] result = {};

        for (int each : array) {//getting each element
            if (frequency(array,each) == 1){//checking the unique element in the array
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static double[] unique(double[] array){
        double[] result = {};

        for (double each : array) {//getting each element
            if (frequency(array,each) == 1){//checking the unique element in the array
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static String[] unique(String[] array){
        String[] result = {};

        for (String each : array) {//getting each element
            if (frequency(array,each) == 1){//checking the unique element in the array
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

    public static char[] unique(char[] array){
        char[] result = {};

        for (char each : array) {//getting each element
            if (frequency(array,each) == 1){//checking the unique element in the array
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //removes duplicates in a given array
    public static int[] removeDup(int[] array){
        int[] newArr = {};

        for (int each : array) {

            if (!ArraysUtility.contains(newArr,each)){
                newArr = ArraysUtility.addElement(newArr,each);
            }

        }

        return newArr;
    }


    public static double[] removeDup(double[] array){
        double[] newArr = {};

        for (double each : array) {

            if (!ArraysUtility.contains(newArr,each)){
                newArr = ArraysUtility.addElement(newArr,each);
            }

        }

        return newArr;
    }


    public static String[] removeDup(String[] array){
        String[] newArr = {};

        for (String each : array) {

            if (!ArraysUtility.contains(newArr,each)){
                newArr = ArraysUtility.addElement(newArr,each);
            }

        }

        return newArr;
    }


    public static char[] removeDup(char[] array){
        char[] newArr = {};

        for (char each : array) {

            if (!ArraysUtility.contains(newArr,each)){
                newArr = ArraysUtility.addElement(newArr,each);
            }

        }

        return newArr;
    }



}