package day25_ForEachLoop;

import java.util.Arrays;

public class ReverseElements {
    /*
    write a program that can  reverse each elements in an array of string
		Ex:
		    array = {"Java", "Python", "C#"}

	    	output:
	    		["avaJ", "nohtyP", "#C"]
     */
    public static void main(String[] args) {
        String[] array = {"Java", "Python", "C#", "Cybertek", "School", "Selenium", "API"};

        for (int j = 0; j < array.length; j++) {//j= the index numbers of the array


        String element = array[j];//"Java"
        //                           0123
        String reverse = "";//"avaJ"

        for (int i = element.length()-1; i >=0 ; i--) {
            reverse += element.charAt(i);//gets the characters from the string element


        }

        array[j] = reverse;//[avaJ, nohtyP, #C]

    }
        System.out.println(Arrays.toString(array));


        /*
        String[] reversedElements = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            char[] chars = array[i].toCharArray();
            String word = "";
            for (int j = chars.length-1; j >= 0 ; j--) {
                word += chars[j];
            }

            reversedElements[i] = word;

        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reversedElements));

         */
    }
}
