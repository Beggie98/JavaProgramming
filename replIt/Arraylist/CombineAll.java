package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CombineAll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many elements for the first list?");
        int size1 = input.nextInt();

        ArrayList<Integer> numbers1 = new ArrayList<>();

        for (int i = 0; i < size1; i++) {
            numbers1.add(input.nextInt());
        }

        System.out.println("How many elements for the first list?");
        int size2 = input.nextInt();

        ArrayList<Integer> numbers2 = new ArrayList<>();

        for (int i = 0; i < size2; i++) {
            numbers2.add(input.nextInt());
        }

        System.out.println(combineAll(numbers1,numbers2));
        input.close();

    }


    public static ArrayList<Integer> combineAll(ArrayList<Integer> numbers1, ArrayList<Integer> numbers2){
        ArrayList<Integer> numbers3 = new ArrayList<>();

        for (Integer each : numbers1) {
            numbers3.add(each);
        }

        for (Integer each : numbers2) {
            numbers3.add(each);
        }

        return numbers3;

    }


}
/*
Create a static method that:

- is called `combineAL`
- returns an `ArrayList<Integer>`
- takes two parameters: an `ArrayList` of numbers called `numbersOne`, and another ArrayList of numbers called `numbersTwo`

This method should create a **new ArrayList of Integer**, add all the numbers (in order) from numbersOne, then add all the numbers (in order) from numbersTwo.
In other words, it is combining all the elements from the two lists.
 */