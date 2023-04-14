package day24_Arrays;

import java.util.Arrays;

public class ReverseArray {
    /*Write a program that can reverse an array of integers
		ex:
			array = {1,2,3,4,5};

		output:
			reversedArray = {5,4,3,2,1};

     */
    public static void main(String[] args) {
        int[] array = {1,2,7,8,9,3,10,4,5};

        int[] reversedArray = new int[array.length];//to make sure it has enough to store elements of original array

        Arrays.sort(array);

        for (int i = array.length-1, j = 0; i >= 0 ; i--, j++) {//i is the index numbers of array starting from last index
                                                                //j is the index numbers of reversedArray from index 0
            reversedArray[j] = array[i];//we are getting elements of array from last index and store them to reversedArray from index 0
        }
        System.out.println(Arrays.toString(reversedArray));









        /*
        String[] reverseArray = new String[array.length];

        Arrays.sort(array);

        String str = "";
        for (int i = array.length-1; i >= 0; i--) {
            int each = array[i];
            str += each;
        }

        for (int i=0; i < str.length(); i++){
            String eachstr = str.substring(i,i+1);
            reverseArray[i] = eachstr;

        }

        System.out.println(Arrays.toString(reverseArray));

         */


    }
}
