package day28_Methods;

import java.util.Scanner;

public class MethodsWithParameter {
    //Eligible to buy alcohol
    public static void main(String[] args) {

        eligible(30);


    }
    //Methods with parameter we need it if method requires extra information to complete is functionality
    public static void eligible(int age){
        if (age >= 21){
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }
    }

}
