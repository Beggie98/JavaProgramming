package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TimesTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size for the list");
        int size = input.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            nums.add(input.nextInt());
        }

        System.out.println(timesTwo(nums));
        input.close();
    }

    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer each : nums) {
            list.add(each*2);
        }

        return list;
    }

}
/*
Create a method that:

- is called `timesTwo`
- returns an `ArrayList` of Integers
- takes in a single parameter - an `ArrayList` of `Integers` called `nums`

This method should take the ArrayList parameter and multiply every value by two.
 */