package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("",""));
    }

    public static boolean isAnagram(String word1, String word2){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words");
        word1 = input.next().toLowerCase();
        word2 = input.next().toLowerCase();
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);

    }


}
