package day29_ReturnMethods;

import java.util.Arrays;
import java.util.Scanner;

public class WarmUpTasks {
    /*
    1. create a function that can check if the given integer is positive, negative or zero

	2. create a function that can print out the combination of two integer arrays

	3. create a function that can print out the full name of a person in regular format
	            ex:
	               fullName("cYbErTeK", "SCHOOL");

	                output:
	                    "Cybertek School"

	4. create a function that can print out the maximum number between two numbers

	5. create a function that can print out the array of integers in descending order
     */


    public static void posNegZero(int number){
        if (number>0){
            System.out.println("Positive");
        }else if (number<0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
    }

    public static void combineTwoArrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int j = 0;
        for (int each : arr1) {
            arr3[j++] = each;
        }

        for (int each : arr2) {
            arr3[j++] = each;
        }

        System.out.println(Arrays.toString(arr3));

    }

    public static void fullName(String firstName, String lastName){
        String fullName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase() + " "
               + lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(fullName);
    }

    public static void maxNumberBetweenTwo(int num1, int num2){
        if (num1 > num2){
            System.out.println("Max number is " + num1);

        } else if (num2 > num1) {
            System.out.println("Max number is " + num2);
        }else {
            System.out.println("Numbers are equal");
        }
    }

    public static void integersInDescendingOrder(int[] arr){

        int[] arr1 = new int[arr.length];
        Arrays.sort(arr);
        for (int i = arr1.length-1, j=0; i >= 0 ; i--,j++) {
            arr1[i] = arr[j];
        }

        System.out.println(Arrays.toString(arr1));

    }


    public static void main(String[] args) {
        posNegZero(-5);

        int[] numbers = {10,20,0,-30,-5};

        for (int number : numbers) {
            posNegZero(number);
        }

        System.out.println("----------------------------------------");

        int[] array1 = {1,2,3,4},
                array2 = {5,6,7,8,9,10};


        combineTwoArrays(array1,array2);

        System.out.println("----------------------------------------");
        fullName("beKZoD","jurAEV");
        System.out.println("-----------------------------------------");
        maxNumberBetweenTwo(20,20);
        System.out.println("-----------------------------------------");

        int[] array = {2,6,1,3,5};

        integersInDescendingOrder(array);
    }
}
