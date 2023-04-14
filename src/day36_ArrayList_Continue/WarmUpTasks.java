package day36_ArrayList_Continue;

import Utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        list.set(list.size()-1, 0);

        System.out.println(list);

        System.out.println("----------------------------------");
        list.clear();
        list.addAll(Arrays.asList(1,2,3,4,5));

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) != 0){
                list.set(i, list.get(i) * 2);
            }
        }

        System.out.println(list);
        System.out.println("---------------------------------------------");

        String[] arr1 = {"A", "B", "C"},
                arr2 = {"D", "E", "F", "G"};

        //String[] arr3 = ArraysUtility.mergeArrays(arr1,arr2);

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        list1.addAll(Arrays.asList(arr2));

        System.out.println(list1);

        /*
        for (String each : arr1){
            list.add(each);
        }

        for (String each : arr2){
            list.add(each);
        }

         */

        System.out.println("-----------------------------");

        int[] numbers = {1,2,3,4,5,6,7};
        ArrayList<Integer> list4 = new ArrayList<>();
        //list4.addAll( Arrays.asList(numbers));//cannot add primitive array

        for (int each : numbers){
            list4.add(each);
        }

        System.out.println(list4);


    }
}
/*
1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];

	2. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]

	3. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */