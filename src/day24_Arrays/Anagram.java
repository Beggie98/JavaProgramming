package day24_Arrays;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        /*
        heart && earth
        race && care
        listen && silent

        output: true
         */

        String s1 = "heart"; //aehrt - sorted, String does not have sort method so we need to use toCharArray() and sort the arrays
        String s2 = "earth"; //aehrt - sorted

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean isAnagram = Arrays.equals(ch1,ch2);

        System.out.println("Is Anagram: " + isAnagram);




    }
}
