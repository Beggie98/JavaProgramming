package Utilities;

import java.util.Arrays;

public class StringUtility {

    public static void main(String[] args) {



    }


    //reverses any given String, and returns it
    public static String reverse(String str){
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    //checks if two strings are palindrome
    public static boolean isPalindrome(String str){
        String reversedStr = reverse(str);

        return str.equalsIgnoreCase(reversedStr);

    }

    //removes duplicates from a String
    public static String removeDuplicates(String str){
        String result = "";

        for (char ch : str.toCharArray()){
            if (result.indexOf(ch)<0){//!result.contains("" + ch)
                //if the character is not contained in the result, then concate the character
                result += ch;
            }
        }

        return result;
    }

    //checks if two strings are anagram
    public static boolean isAnagram(String str1, String str2){
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);

    }

    //checks frequency of a char in a string
    public static int frequency(String str, char ch){
        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (each == ch){
                frequency++;
            }

        }
        return frequency;
    }

    //collects unique chars in a string
    public static String uniqueChars(String str){
        String unique = "";

        for (char ch : str.toCharArray()){
            int count = StringUtility.frequency(str,ch);

            if (count == 1){
                unique += ch;
            }

        }
        return unique;
    }

    //returns the frequency of a word in a string
    public static int frequencyOfWord(String str, String word){
        int count = 0;
        str = str.toLowerCase();
        word = word.toLowerCase();
        while (str.contains(word)){
            count++;
            str = str.replaceFirst(word,"");
        }

        return count;
    }

    //AAABBCCCC => A3B2C4
    public static String frequencyOfChars(String str){
        String result = "";

        for (char each : StringUtility.removeDuplicates(str).toCharArray()){ //ABC == > 'A', 'B', 'C'
            result += ""+ each + StringUtility.frequency(str,each);//gets the frequency of each character in a string
        }

        return result;
    }


    //counts all letters in a string
    public static String countLetters(String word){
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            char ch = word.charAt(i);
            for (int j = 0; j < word.length(); j++) {
                char each = word.charAt(j);
                if (each == ch){
                    count++;
                }

            }
            if (!result.contains(""+ch)){
                result += "" + ch + count;
            }
        }

        return result;

    }


}
