package day19_Loops;

public class ForLoopPractice2 {
    public static void main(String[] args) {
        // A ~ Z

        for (int i = 65; i <= 90; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println();

        System.out.println("-----------------------------------");
        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("-------------------------------------");
        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-------------------------------------------");

        // print the characters from 1000 ~ 30000 in same line separated by a space

        for (char i = 1000; i <= 3000 ; i++) {
            System.out.print(i + " ");

        }


    }
}
