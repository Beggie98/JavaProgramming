package day56_CollectionContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterablePractice1 {//used for iterating collection objects, good for removing elements from a collection type
    //Iterable is Root Interface of Collection
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));//remove < 4
        //removeIf() uses Iterable internally

        for (int i = 0; i < list1.size(); i++) {//this will not help remove elements less than 4
            if (list1.get(i) < 4){
                list1.remove(i);
            }
        }

        System.out.println(list1);//[2, 4, 5, 2, 4, 5, 2, 4, 5]

        System.out.println("---------------------------------------------------------");

        //Iterable is the ONLY legit way to remove elements from a collection type
        //Classes that are implementing iterable interface gains the ability to use iterator interface

        /*
        Iterator (I): ONLY applied for classes that are iterable (IS A relation with Iterable)
            1. allows us to get access to each object

            2. allows us to remove any objects from collection type
         */

        System.out.println("--------------------------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        Iterator<Integer> it = list2.iterator();//returns Iterator

        //hasNext() - checks if there is object. returns boolean

        //next() - if hasNext() is true ==> can get access to the object (retrieving the object)
        //next() - if hasNext() is false ==> no object can be accessed

        while (it.hasNext()) {//This is the right way for removing elements of collection type
            if (it.next() < 4){
                it.remove();//removes an object
            }
        }

        System.out.println("list2 = " + list2);//[4, 5, 4, 5, 4, 5]

        System.out.println("-------------------------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        list3.removeIf(p -> p<4);//iterator is used internally

        System.out.println("list3 = " + list3);


    }


}
