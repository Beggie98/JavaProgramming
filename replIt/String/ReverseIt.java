package String;

import java.util.Scanner;

public class ReverseIt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();
        String result = "";

        if (word.length()==5){
            for (int i = 4; i >= 0; i--) {
                result += word.charAt(i) + "";
            }
        }else if (word.length()>5){
            result ="Too long";
        }else{
            result = "Too short";
        }
        System.out.println(result);

        input.close();
    }
}
