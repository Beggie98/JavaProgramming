package day57_Collection_Recap;

import java.util.*;

public class RemoveDuplicatedIntegers {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,4,4,4,10,10,5,5,6,7,11,11,8,8,9));

        //convert one collection type to another
        list = new ArrayList<>(new TreeSet<>(list)) ;//sorts the elements in ascending order

        System.out.println(list);

        System.out.println("-------------------------------------------------");

        Integer[] nums = {1,1,2,2,3,4,4,4,10,10,5,5,6,7,11,11,8,8,9};//MUST BE NON-PRIMITIVE
        //convert collection type to Array data structure: toArray()
        nums = new TreeSet<>(Arrays.asList(nums)).toArray(new Integer[0]);//paste 0 for the size of the new array

        System.out.println(Arrays.toString(nums));

        System.out.println("----------------------------------------------------");

        String[] students = {"Feruza","Sabir","Mucahit","Ismail"};//add "Esraa"

        ArrayList<String> l = new ArrayList<>(Arrays.asList(students));
        l.add("Esraa");
        l.add("Aysu");
        //convert collection type to Array data structure: toArray()
        students = l.toArray(new String[0]);

        System.out.println(Arrays.toString(students));

        System.out.println("---------------------------------------------------");

        Integer[] n = {1,2,3,4,5,6,7,8,9,10};//MUST BE NON-PRIMITIVE

        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(n));

        l2.removeIf(p -> p%2==0);

        n = l2.toArray(new Integer[0]);

        System.out.println(Arrays.toString(n));



    }

}
/*
3. write a program that can remove the duplicated Integers from a List of Integer
			Do Not change the insertion order
 */