package day33_Methods;

import java.util.Arrays;

public class WarmUpTask1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        array = reverseArray(array);
        System.out.println(Arrays.toString(array));
    }


    public static int[] reverseArray(int[] array){
        int[] result = new int[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }

    public static double[] reverseArray(double[] array){
        double[] result = new double[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }


    public static String[] reverseArray(String[] array){
        String[] result = new String[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }

    public static char[] reverseArray(char[] array){
        char[] result = new char[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            result[j] = array[i];
        }

        return result;
    }


}
/*
        1. create a method that can reverse an array of integer

		2. create a method that can reverse an array of double

		3. create a method that can reverse an array of String

		4. create a method that can reverse an array of char

 */