package day56_CollectionContinue;

import java.util.*;

public class IterablePractice2 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed"
        ));
        //remove all the names "ahmed" without using removeIf

        Iterator<String> it = names.iterator();

        while (it.hasNext()){

            if (it.next().equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println(names);


        System.out.println("----------------------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed"
        ));

        names2.removeIf(p -> p.equalsIgnoreCase("ahmed"));

        System.out.println(names2);


        System.out.println("---------------------------------------------------");

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(10,9,11,1,2,3,4,5,6,7,12,13,14,15,16,17,18,25,20));

        //remove all the elements that are less than 17

        for (Iterator<Integer> i = set.iterator(); i.hasNext();){
            //initialization                     ;   condition
            if (i.next() < 17){
                i.remove();
            }
        }

        System.out.println(set);

        System.out.println("--------------------------------------------------");

        Set<Integer> set2 = new HashSet<>();
        set2.addAll(Arrays.asList(10,9,11,1,2,3,4,5,6,7,12,13,14,15,16,17,18,25,20));

        set2.removeIf(p -> p < 17);

        System.out.println(set2);

        System.out.println("------------------------------------------");

        /*
        for ( ; ;){

        }

        System.out.println("Hello");//unreachable
         */

        for (int i = 1, j = 10, k = 100; i <= 10 ; i++, j += 10, k += 100) {
            System.out.println(i + " : " + j + " : " + k);
        }



    }

}
