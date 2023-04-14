package day19_Loops;

public class ForLoopPractice {

    public static void main(String[] args) {
        for (int i=0; i<=1000; i++){
            System.out.print(i + " ");
        }
        System.out.println();//to make a new line
        System.out.println("Hello");

        System.out.println("------------------------");
        for (int i=1; i<=100; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("-----------------------------------");
        for (int i=1; i <= 100; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("----------------------------------");

        for (int i=1; i <= 100; i++){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

        System.out.println("-----------------------------");

        String evens = "";
        String odds = "";
        for (int i=1; i<=100; i++){
            if (i%2 == 0){
                evens += i + " ";
            }else{
                odds += i + " ";
            }
        }
        System.out.println("odds = " + odds);
        System.out.println("evens = " + evens);



    }

}
