package day57_Collection_Recap;

import Utilities.StringUtility;

import java.util.*;

public class RemovePalindrome {

    public static void main(String[] args) {
        String[] arr = {"Apple", "John", "Paper", "Level", "Race", "Racecar","Java","Python", "Kayak"};
        List<String> list = new LinkedList<>();
        list.addAll(Arrays.asList(arr));
        Iterator<String> it = list.iterator();//Iterator is mandatory in order to remove from any collection type
        while (it.hasNext()){
            String each = it.next();
            String reverse = "";
            for (int j = each.length()-1; j >= 0; j--) {
                reverse += each.charAt(j);
            }
            if (each.equalsIgnoreCase(reverse)){
                it.remove();
            }
        }

        System.out.println(list);

        System.out.println("----------------------------------------------------------------");

        String[] arr1 = {"Apple", "John", "Paper", "Level", "Race", "Racecar","Java","Python", "Kayak"};
        List<String> list1 = new LinkedList<>();
        list1.addAll(Arrays.asList(arr));

        list1.removeIf(p -> StringUtility.isPalindrome(p));//internally using the iterator

        System.out.println(list1);

    }

}
/*
1. write a program that can remove the palindrome string from a list of String
			DO NOT use Lambda expressions
 */