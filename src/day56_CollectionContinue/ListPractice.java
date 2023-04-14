package day56_CollectionContinue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class ListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.size();

        Vector<Integer> vector = new Vector<>();
        vector.size();

        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(1,2,3,4,5,6));

        int a = stack.pop();//removes the last inserted object from the stack (last here is 6)
        System.out.println(a);

        System.out.println(stack);

        int a2 = stack.pop();

        System.out.println(a2);
        System.out.println(stack);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack);


        //Stack is synchronized as well: thread-safe, LIFO (Last in first out) order
        //pop(): removes the last inserted object from the stack

        //Vector is synchronized ===> thread-safety

        //Process is execution instance of a program (ex. chrome, firefox, sublime, intelliJ ...) (or app)

        //Thread is a subset of a process (sequence of execution within a process)

        //Multi-thread: 2 or more threads are being executed within the process (Not Multitasking)

        //Multi-tasking: running multiple programs concurrently (within one process)

    }

    public void method1(){

    }

    public synchronized void method2(){//thread-safe, but slow

    }

}
