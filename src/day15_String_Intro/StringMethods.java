package day15_String_Intro;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Muhtar";

        char ch = str.charAt(0);//returns the character at the given index

        System.out.println("ch = " + ch);

        String word = "Cybertek School";
//      index:         0123456789
        System.out.println(word.charAt(9));

        String word2 = "Java";
        //index:        0123
        char ch3 = word2.charAt(2);
        System.out.println("ch3 = " + ch3);

        System.out.println("-----------------------------------");

        String sentence = "Hello everyone, how are you all today?";
        int totalNumberOfCharacters = sentence.length();//returns the total number of characters in a String

        System.out.println("total number of characters = " + totalNumberOfCharacters);

        //chars:     12345678
        String s1 = "Cybertek School";
        //index:     01234567

        char firstCharacter = s1.charAt(0);
        char lastCharacter = s1.charAt(s1.length() - 1);

        System.out.println("firstCharacter = " + firstCharacter);
        System.out.println("lastCharacter = " + lastCharacter);

        System.out.println("---------------------------");

        String firsName = "John";
        String lastName = "King";

        String fullName = firsName + " " + lastName;
        //String fullName2 = firsName.concat(" ").concat(lastName);

        System.out.println("-----------------------------------------");

        //toLowerCase() and toUpperCase


        String s = "cybertek";//cannot modify a String, it is immutable
        s = s.toUpperCase();//returns a new String with uppercase of old String

        System.out.println(s);

        System.out.println("------------------------------------------");
        String s2 = "JAVA PROGRAMMING LANGUAGE";
        s2 = s2.toLowerCase();//java programming language: returns a new String with lowercase of old String
        System.out.println(s2);

        String name = "bekzod";
        name = name.toUpperCase();//"BEKZOD"

        System.out.println(name);

        name = name.toLowerCase();//bekzod

        System.out.println(name);
        System.out.println("---------------------------");

        //trim() - removes the white spaces (unused space) and returns new string object

        String schoolName = "                 Cybertek    School             ";

        schoolName = schoolName.trim();//"Cybertek    School" - removes the unused space

        System.out.println(schoolName);

    }
}
