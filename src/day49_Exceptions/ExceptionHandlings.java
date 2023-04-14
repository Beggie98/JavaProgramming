package day49_Exceptions;

import day46_OOP_Inheritance_Continue.shapeTask.Circle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlings {
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

    public static void main(String[] args) {
        String str = "Cybertek";

        try {
            System.out.println(str.charAt(200));//unchecked exception: StringIndexOutOfBoundsException
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch block: Runtime exception occurred");
        }

        str += " School";

        System.out.println(str);

        System.out.println("----------------------------------------------");

        try{
            System.out.println(9/0);
        }catch (IllegalArgumentException e){
            //System.out.println(e.getMessage());//getMessage() will get the name of the exception
            e.printStackTrace();//this will get the full message of the exception
        }catch (IndexOutOfBoundsException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (ArithmeticException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (RuntimeException e){//parent of unchecked exceptions (RuntimeException) is included inside the last catch block
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Test completed1");

        System.out.println("-------------------------------------------------");
        try {
            System.out.println("".substring(10,20));
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }


        System.out.println("Test completed2");

        System.out.println("--------------------------------------------------");

        Circle circle1 = null;
        try {
            circle1.getRadius();
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test completed3");
    }

}
