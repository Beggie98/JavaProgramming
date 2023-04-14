package day15_String_Intro;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();
        //index:       01234
        String result = "";

        if (word.length() > 5){
            result = "Too long";
        }else if (word.length() == 5){
            result = result + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        }else {
            result = "Too Short";
        }

        System.out.println(result);

    }

}
