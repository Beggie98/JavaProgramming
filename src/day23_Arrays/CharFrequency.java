package day23_Arrays;

import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "aabcccd";
        int count = 0;
        char letter = input.next().charAt(0);

/*
        for (int i = 0; i < str.length(); i++){
            if (str.substring(i,i+1).equals(letter)){
                str.replaceFirst(letter, "");
                count++;
            }
        }

 */
        for (int i = 0; i < str.length(); i++){
            char each = str.charAt(i);
            if (each == letter){
                count++;
            }
        }

        System.out.println(count);
        input.close();

    }
}
