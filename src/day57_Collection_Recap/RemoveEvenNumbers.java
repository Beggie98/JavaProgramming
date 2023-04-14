package day57_Collection_Recap;

import java.util.*;

public class RemoveEvenNumbers {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()){

            if (it.next()%2==0){
                it.remove();
            }
        }

        System.out.println(set);

        System.out.println("-----------------------------------------------");

        Set<Integer> set2 = new TreeSet<>();
        set2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));

        set2.removeIf(p -> p%2==0);

        System.out.println(set2);

    }


}
/*
2. write a program that can remove the even numbers from a Set of Integers
			DO NOT use Lambda expressions

 */
