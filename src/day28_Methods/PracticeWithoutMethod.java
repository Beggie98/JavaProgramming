package day28_Methods;

public class PracticeWithoutMethod {
/*
step1: print hello 5 times (loop)
step2: print your name
step3: print hello 5 times (loop)
step4: print your school name
steo5: print hello 5 times (loop)
 */
    public static void main(String[] args) {
        //step1
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
         */

        CustomMethodsIntro.printHello5Times();//we need to call it throught the class name to use the method outside its own class

        //step2
        System.out.println("Bekzod");
        //step3
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
        //step4
        System.out.println("Cybertek");

        //step5
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }

    }

}
