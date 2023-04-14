package day30_Recap;

import Utilities.ArraysUtility;
import Utilities.StringUtility;

import java.util.Arrays;

public class ArraysReview {
    public static void main(String[] args) {
        /*
        String item1 = "Eggs",
                item2 = "Milk",
                item3 = "Apple",
                item4 = "Chicken",
                item5 = "Paper";

         */

        String[] items = new String[10];
        items[2] = "Milk";
        items[3] = "Paper Towels";

        System.out.println(Arrays.toString(items));


        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] nums = {10,20,30,40,50};

        int[] result = new int[nums.length];

        for (int i = 0, j = nums.length-1; i < result.length; i++,j--) {
            result[i] = nums[j];
        }
        System.out.println(Arrays.toString(result));
        System.out.println("-------------------------------");

        String[] group1 = {"Sophie", "Feruza", "Ekaterina"};
        String[] group2 = {"Shazia", "Bilguun", "Danka", "Mucahit"};

        String[] group3 = new String[group1.length + group2.length];

        int i = 0;
        for (int j = 0; j < group1.length; j++) {
            group3[i++] = group1[j];
        }
        for (int j = 0; j < group2.length; j++) {
            group3[i++] = group2[j];
        }

        System.out.println(Arrays.toString(group3));
        System.out.println("-----------------------------");

        int[] arr = {10,20,30,50,40,90,70,80};

        System.out.println("Max number: " + ArraysUtility.maxNumberFromArray(arr));
        System.out.println("Min number: " + ArraysUtility.minNumberFromArray(arr));


    }
}
