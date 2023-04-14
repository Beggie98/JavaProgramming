package day36_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        //Collections.sort(CollectionType) - sorts a collection in ascending order
        //Collections.reverse(CollectionType) - sorts a collection in descending order
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,5,0,-1,30,40,15,20,20,20,20));

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        System.out.println("------------------------------------------");
        //Collections.swap(CollectionType, index1, index2) - swaps 2 elements in a collection

        Collections.swap(list,0,2);
        System.out.println(list);

        System.out.println("-------------------------------------------");
        //Collections.replaceAll(CollectionType, old value, new value) - all old values will be replaced with new values

        Collections.replaceAll(list,10,20);
        System.out.println(list);

        //Collections.frequency(CollectionType, element) - returns the frequency of an element in a colletion, returns int

        int f = Collections.frequency(list, 20);
        System.out.println(f);

        System.out.println("-----------------------------------------------");

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'A', 'B', 'C', 'C', 'C', 'D'));
        /*
        ArrayList<Character> uniques = new ArrayList<>();

        for (Character each : chars) {
            if (Collections.frequency(chars, each) == 1){
                uniques.add(each);
            }
        }

        System.out.println(uniques);
         */

        ArrayList<Character> uniques = new ArrayList<>(chars);

        System.out.println(uniques);

        uniques.removeIf(p -> Collections.frequency(uniques,p) != 1);

        System.out.println(uniques);

        System.out.println("---------------------------------------------");
        /*
        String str = "ABABABACDEEEE";
        String unique = "";

        ArrayList<String> result = new ArrayList<>( Arrays.asList(str.split("")) );
        System.out.println(result);

        for (String each : result) {
            if (Collections.frequency(result,each) == 1){
                unique += each;
            }
        }

        System.out.println(unique);

         */

        String str = "ABABABACDEEEE";
        String unique = "";

        ArrayList<String> result = new ArrayList<>( Arrays.asList(str.split("")) );

        result.removeIf(p -> Collections.frequency(result,p) != 1);

        System.out.println(result);
        System.out.println("-----------------------------------------------");

//        Collections.max(CollectionType) - returns max number in a collection
//        Collections.min(CollectionType) - returns min number in a collection

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("min = " + min);
        System.out.println("max = " + max);


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,10,9,9,8,7,6,5,4,3,2,1));
        int firstMax = Collections.max(numbers);

        numbers.removeIf(p -> p == Collections.max(numbers));
        int secondMax = Collections.max(numbers);

        numbers.removeIf(p -> p == Collections.max(numbers));
        int thirdMax = Collections.max(numbers);

        System.out.println("firstMax = " + firstMax);
        System.out.println("secondMax = " + secondMax);
        System.out.println("thirdMax = " + thirdMax);


    }
}
