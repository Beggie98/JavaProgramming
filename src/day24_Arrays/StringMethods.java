package day24_Arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        //split(value): returns string array, splits the string by given value
        String sentence = "I love learning Java programming language";
        String[] split = sentence.split(" ");
        System.out.println(Arrays.toString(split));//[I, love, learning, Java, programming, language]


        for (int i = split.length - 1; i >= 0; i--) {
            System.out.print(split[i] + " ");
        }
        System.out.println();

        String email = "Cybertek@gmail.com";
        String firstName = email.split("@")[0];//[Cybertek, gmail.com]

        System.out.println("firstName = " + firstName);

        System.out.println("----------------------------------------");
        //toCharArray(): returns char array

        String str = "Cybertek";
        char[] chars = str.toCharArray();//{'C', 'y', 'b', 'e', 'r', 't', 'e', 'k'}

        System.out.println(Arrays.toString(chars));

        String str1 = "A,B C 4 E! ";
        char[] chars1 = str1.toCharArray();//[A, ,, B,  , C,  , 4,  , E, !,  ]

        System.out.println(Arrays.toString(chars1));

    }
}
