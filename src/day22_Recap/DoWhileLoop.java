package day22_Recap;

public class DoWhileLoop {
    public static void main(String[] args) {

        int i = 10;

        while (i<5){
            System.out.println("Hello Cybertek");
        }

        System.out.println("-------------------------------");

        do {
            System.out.println("Hello Cybertek");
        }while (i<5);//false, but do{} gets executed first even if the condition is false and do-while loop will be
        // executed one time

    }



}
