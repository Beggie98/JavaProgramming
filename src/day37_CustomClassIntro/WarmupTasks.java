package day37_CustomClassIntro;

import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        System.out.println(nums);

        Collections.swap(nums,0,nums.size()-1);

        System.out.println(nums);

        System.out.println("--------------------------------------------");


        Integer[] numbers = {1,1,1,2,2,2,3,3,4,5,5,5,6,6,6,7,8,9,9};
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(numbers));
        /*
        for (int i = 0; i < nums1.size(); i++) {
            int each = nums1.get(i);
            if (Collections.frequency(nums1,each) == 1){
                System.out.println(each);
                break;
            }
        }

         */

        ArrayList<Integer> uniques = new ArrayList<>(nums1);
        uniques.removeIf(p -> Collections.frequency(uniques, p) != 1);

        int firstUnique = uniques.get(0);

        System.out.println("firstUnique = " + firstUnique);

        System.out.println(uniques);


        System.out.println("--------------------------------------------");

        String word = "AAAABBBCCD";
        String[] arr = word.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        String result = "";
        for (String each : StringUtility.removeDuplicates(word).split("")) {//A,B,C,D
            int frequency = Collections.frequency(list, each);//4,3,2,1
            result += each + frequency;
        }

        System.out.println(result);

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.addAll(Arrays.asList(12,51,65,21,23,24,84,84,17,20,60));
        int max = 0;
        Collections.sort(nums2);
        Collections.reverse(nums2);
        System.out.println(nums2);

        for (int i = 0; i < 3; i++) {
            max = nums2.get(0);
            nums2.removeAll(Arrays.asList(max));
        }

        /*
        for (int i = 0; i < 4; i++) {
            max = Collections.max(nums2);
            nums2.removeIf(p -> p == Collections.max(nums2));
        }

         */

        System.out.println(max);

    }

}
/*
warmup tasks:
	1. write a program that can swap the first and last elements of an ArrayList

	2. write a program that can return the first unique elements of an ArrayList

	3. write a program that can find the frequency of character from a String
                DO NOT use nested loop

                "AABBCCDDEE"  ==> "ABCDE"
                output: A2B2C2D2E2

	4. Write a program that can return the nth largest number from an ArrayList of integers

 */