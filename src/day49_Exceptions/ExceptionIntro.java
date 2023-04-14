package day49_Exceptions;

import java.io.FileInputStream;

public class ExceptionIntro {

    public static void main(String[] args) {
        int[] arr = {1,2,3};

        //System.out.println(arr[100]);//ArrayIndexOutOfBoundsException

        //compile time is when we are writing a code
        //Exception: unwanted or unexpected events
        //unchecked exception: occurs during the runtime (unexpected event) - compiler cannot check during compile time
        //RuntimeException class is the parent of all unchecked exceptions
        //all the runtime exceptions are unchecked exceptions

        //System.out.println(100/0);//ArithmeticException / by zero


        String str = null;

        //System.out.println(str.toUpperCase());//NullPointerException

        System.out.println("Hello");

        System.out.println("-------------------------------------------------");

        try {
            Thread.sleep(3000);//checked exception occurs during compile time / all the exceptions that are not runtime exceptions are checked exception
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //FileInputStream file = new FileInputStream("");

        //checked exception - unwanted event

        System.out.println("Hello Robinson");

        System.out.println("--------------------------------------------");
        //Exception Handlings
        //try & catch blocks: used for handling both checked and unchecked exceptions

        /*
        Syntax:
        try{
            exception code (Plan A)
        }catch(ExceptionClass e){ (Plan B)
            statements
        }

        only one of them gets executed

         */



    }


}
