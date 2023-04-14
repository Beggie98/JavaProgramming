package day30_Recap;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {100,200,300,400,500};

        for (int number : numbers){
            System.out.println(number);
        }

        System.out.println("-------------------------");

        int max = numbers[0];
        int min = numbers[0];

        for(int number : numbers){
            /*
            if (number > max){
                max = number;
            }
             */

            max = Math.max(number,max);//returns the maximum number between 2 numbers
            min = Math.min(number,min);
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("-------------------------------");

        System.out.println(Math.sqrt(4));//square root
        System.out.println(Math.pow(4,2));//power

        System.out.println(Math.E);
        System.out.println(Math.PI);

        System.out.println("--------------------------------------");

        String[] group1 = {"Sophie", "Feruza", "Ekaterina"};
        String[] group2 = {"Shazia", "Bilguun", "Danka", "Mucahit"};

        String[] group3 = new String[group1.length + group2.length];

        int i = 0;

        for (String name : group1) {
            group3[i++] = name;
        }

        for (String name : group2) {
            group3[i++] = name;
        }

        System.out.println(Arrays.toString(group3));

    }
}
