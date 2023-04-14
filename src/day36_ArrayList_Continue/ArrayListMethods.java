package day36_ArrayList_Continue;

import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ArrayListMethods {
    public static void main(String[] args) {
        //removeIf(Predicate) - when we want to the elements under a condition (if the elements are unknown)
        //Predicate is a functional interface designed to create lambda expression (->), returns boolean
        //NEVER USE remove() inside a loop



        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,8,8,8));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %2 != 0){
                list.remove(i);
            }
        }

        System.out.println(list);

        System.out.println("------------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,8,8,8));


        //list1.removeIf(p -> p < 5);//Predicate p represents each element in the Arraylist
        list1.removeIf(each -> each%2 !=0);//[2, 2, 2, 2, 4, 4, 4, 4, 6, 6, 6, 6, 8, 8, 8] odd elements have been removed

        System.out.println(list1);

        System.out.println("----------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Ahmad", "Merve", "Feruza", "Said", "Komiljon", "Selda", "Philip"));

        names.removeIf(p -> p.toLowerCase().contains("a"));

        System.out.println(names);

        System.out.println("------------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Anna", "Racecar", "level", "Java", "Python", "Cybertek", "Sabas", "Pop", "Kayak"));

        System.out.println(words);

        words.removeIf(p -> StringUtility.isPalindrome(p));// if the strung is palindrome, then remove it from the array

/*
        for (int j = 0; j < words.size(); j++) {
            String reverse = "";

            for (int i = words.get(j).length()-1; i >= 0 ; i--) {
                reverse += words.get(j).charAt(i);
            }

            boolean isPalindrome = reverse.equalsIgnoreCase(words.get(j));

            words.removeIf(p -> isPalindrome);
        }

 */


        System.out.println(words);



    }
}
