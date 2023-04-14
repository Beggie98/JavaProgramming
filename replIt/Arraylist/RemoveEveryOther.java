package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveEveryOther {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size for the list");
        int size = input.nextInt();

        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a word");
            words.add(input.next());
        }

        System.out.println(words);
        System.out.println(removeEveryOther(words));

        input.close();


    }

    public static ArrayList<String> removeEveryOther(ArrayList<String> words){
        ArrayList<String> words1 = new ArrayList<>();

        for (int i = 1; i < words.size(); i+=2) {
            words1.add(words.get(i));
        }

        return words1;
    }


}
