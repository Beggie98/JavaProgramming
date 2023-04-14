package day31_Recap;

import Utilities.StringUtility;

import java.util.Arrays;

public class WarmupTasks {
    public static void main(String[] args) {
        //create a method that can remove duplicates from string, returns string

        String str = "AAABBBBCCCCDDD";

        System.out.println(StringUtility.removeDuplicates(str));
        System.out.println("---------------------------------------");

        String s1 = "heart",
                s2 = "earth";

        System.out.println("Anagram: "+StringUtility.isAnagram(s1,s2));
        System.out.println("-----------------------------------------------");

        String str1 = "AAABB";

        System.out.println(StringUtility.frequency(str1,'A'));

        System.out.println("--------------------------------------------");

        String s = "aaaabccccdeeeef";

        String unique = "";
        /*
        for (char ch : s.toCharArray()){
            int count = StringUtility.frequency(s,ch);

            if (count == 1){
                unique += ch;
            }

        }

         */

        System.out.println(StringUtility.uniqueChars(s));
        System.out.println("-----------------------------------------------");

        String s4 = "MMMMMMMMMMMNNNNNNNNNNNNNNNHHHHHHYYYYYYYTTTTTRRRREEEE";

        System.out.println(StringUtility.frequencyOfChars(s4));
        System.out.println("----------------------------------------------");

    }




}
