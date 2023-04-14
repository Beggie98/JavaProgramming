package day56_CollectionContinue;

import java.util.*;

public class QueuePractice {

    public static void main(String[] args) {
        Queue<Integer> q1 = new PriorityQueue<>();//PriorityQueue(C): order is random, does not have index
        q1.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));//[1, 2, 1, 3, 5, 3, 2, 4, 4, 5]

        Queue<Integer> q2 = new ArrayDeque<>();//ArrayDeque(C): keeps the same insertion order, does not have index
        q2.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));//[1, 2, 3, 4, 5, 1, 2, 3, 4, 5]

        Queue<Integer> q3 = new LinkedList<>();//LinkedList(C): keeps the same insertion order, has index. Is a list and a queue
        q3.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));//[1, 2, 3, 4, 5, 1, 2, 3, 4, 5]

        System.out.println("q1 = " + q1);
        System.out.println("q2 = " + q2);
        System.out.println("q3 = " + q3);

        System.out.println(((LinkedList) q3).get(2));//Queue class does not get method, referenceType decides what we can call. Downcasting needed
        //System.out.println(((LinkedList) q1).get(2));//PriorityQueue is not a LinkedList
        //System.out.println(((LinkedList) q2).get(2));//ArrayDeque is not a LinkedList

        //poll(): removes the first object from the queue, and returns it. FIFO

        System.out.println("------------------------------------------------------------------");
        q1.poll();//for PriorityQueue it is hard to tell which element is being removed

        System.out.println("q1 = " + q1);

        q2.poll();

        System.out.println("q2 = " + q2);

        q3.poll();

        System.out.println("q3 = " + q3);



    }


}
