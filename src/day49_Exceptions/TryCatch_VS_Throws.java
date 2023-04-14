package day49_Exceptions;

import day48_JavaRecap.cybertekTask.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch_VS_Throws {

    public static void main(String[] args) {

        Employee employee1 = null;

        try {
            System.out.println(employee1.getSalary());
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Step 1");

       // method1();
        method2();
        test1();

    }


    public static void method1() throws FileNotFoundException {
        new FileInputStream("");
    }

    public static void method2(){
        try {
            new FileInputStream("");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void test1(){
        try {
            method1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void test2() throws FileNotFoundException{
        method1();
    }


}
