package day33_Methods;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class WarmUpTask4 {

    public static void main(String[] args) {
        int[] array = {1,1,1,2,2,2,3,3,3,3,3,4,4,4,4,5,5,5,5};//{1,2,3,4,5}
        int[] newArr = {};

        for (int each : array) {

            if (!ArraysUtility.contains(newArr,each)){
               newArr = ArraysUtility.addElement(newArr,each);
            }

        }

        System.out.println(Arrays.toString(newArr));


        System.out.println("----------------------------------------------");
        int[] numbers = {2,3,4,2,3,4,5,6,6,7,7,7,8,9,9,9};

        int[] r1 = removeDup(numbers);

        System.out.println(Arrays.toString(r1));

        System.out.println("----------------------------------------------");

        String[] names = {"Mohammed", "David", "John", "Ahmet", "Mohammed", "Ahmet"};

        names = removeDup(names);

        System.out.println(Arrays.toString(names));

        System.out.println("-----------------------------------------------");

        Math.max(10,20);//20
        Math.min(10,20);//10
        Math.abs(-100);//100
        Math.pow(10,2);//100
        Math.sqrt(100);//10

    }


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
/*
 create a method that can remove the duplicates from an array of integer
	        Ex:
	          int[] array = {1,1,1,2,2,2,3,4,5,5,5};
	          removeDup(array);  ===> {1,2,3,4,5}

	    2. create a method that can remove the duplicates from an array of double

	    3. create a method that can remove the duplicates from an array of String

	    4. create a method that can remove the duplicates from an array of char

	        HINT: how did you remove the duplicates from a string?
 */