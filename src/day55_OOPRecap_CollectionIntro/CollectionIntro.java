package day55_OOPRecap_CollectionIntro;

import java.util.*;

public class CollectionIntro {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        List<Integer> list3 = new Vector<>();
        List<Integer> list4 = new Stack<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set<Integer> set3 = new TreeSet<>();

        Queue<Integer> queue1 = new PriorityQueue<>();
        Queue<Integer> queue2 = new ArrayDeque<>();
        Queue<Integer> queue3 = new LinkedList<>();

        System.out.println("--------------------------------------------------");

        List<Integer> list = new ArrayList<>();//Only this list has the index numbers
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list.remove(Integer.valueOf(10));



        System.out.println("list = " + list);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(list.get(4));
        //list accept duplicates, and they are in order


        Set<Integer> set = new HashSet<>();//does not have index numbers
        set.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        set.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        set.remove(10);//turned to wrapper class automatically (auto-boxing)

        System.out.println("set = " + set);// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        //set does not accept duplicates


        Queue<Integer> queue = new PriorityQueue<>();//does not have index numbers
        queue.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        queue.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        queue.remove(10);//turned to wrapper class automatically (auto-boxing)

        System.out.println("queue = " + queue);//[1, 1, 2, 4, 2, 3, 4, 6, 8, 10, 5, 6, 3, 7, 5, 8, 7, 9, 9, 10]
        //list accept duplicates, but they are not in an order
        /*
        for (int i = 0; i <= list.size()-1; i++) {
            if (list.get(i)<7){
                list.remove(list.get(i));
            }
        }
        System.out.println(list);

         */

        list.removeIf(p -> p<7);
        System.out.println(list);
    }
}
