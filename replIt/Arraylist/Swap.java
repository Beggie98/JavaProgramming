package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("a","c","b","d","e"));
        System.out.println(swap(words,0,3));
    }

    public static ArrayList<String> swap(ArrayList<String> words, int pos1, int pos2){
        String temp = words.get(pos1);
        words.set(pos1,words.get(pos2));
        words.set(pos2,temp);

        return words;
    }

}
