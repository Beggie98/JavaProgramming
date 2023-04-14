package day33_Methods;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class WarmUpTask3 {
    public static void main(String[] args) {
        int[] array = {1,1,1,2,3,3,4,5,5,6};

        System.out.println(Arrays.toString(unique(array)));

        System.out.println("--------------------------------------");

        int[] array2 = {100, 200, 100, 200, 300, 400, 500, 600, 600};

        int[] r1 = unique(array2);

        System.out.println(Arrays.toString(r1));

        System.out.println("-------------------------------------------");
        double[] array3 = {2.5, 2.5, 3.5, 4.5, 5.5, 5.5, 6.5};

        double[] r2 = unique(array3);

        System.out.println(Arrays.toString(r2));

        System.out.println("----------------------------------");

        String[] items = {"Apple", "Apple", "Orange", "Eggs", "Eggs", "Cherry" };

        String[] r3 = unique(items);

        System.out.println(Arrays.toString(r3));


    }

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


}
