package Day23_Arrays;

public class NestedLoop {
    public static void main(String[] args) {
        //nested loop: loop inside another loop (inner loop & outer loop)

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();//to make a new line

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();//to make a new line

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();//to make a new line

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();//to make a new line

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();//to make a new line

        System.out.println("---------------------------------------------");

        //nested loop
        for (int j = 1; j <= 5; j++){//outer loop
            for (int i = 1; i <= 5; i++) {//inner loop
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 20; j++) {//********************
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------");


        for (int i = 1; i <= 8; i++) {//number of lines
            for (int j = 1; j <=i ; j++) {// number of * in the line
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
