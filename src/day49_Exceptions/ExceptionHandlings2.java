package day49_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;

public class ExceptionHandlings2 {

    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("");
        }catch (FileNotFoundException e){
            e.printStackTrace();//gives the full report of the exceptions
        }

        System.out.println("Test Completed");

        System.out.println("----------------------------------------------");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Test Completed1");

        System.out.println("------------------------------------------------");

        try {
            System.out.println(100/0);
            System.out.println("try block");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Catch block");
        }finally {//ALWAYS gets executed regardless of exception being handled or not
            System.out.println("Finally block");
        }

        System.out.println("------------------------------------------------");

        try {
            System.out.println("Cybertek".charAt(-1));
            System.out.println("try block");
        }catch (RuntimeException e){
            System.out.println("Catch block");
            System.exit(0);//now finally block will not be executed
        }finally {
            System.out.println("Finally block");
        }

        //finally block is only used for code fragments that MUST be executed, otherwise no need to use it


    }

}
