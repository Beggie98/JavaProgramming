package day50_Exceptions_Recap;

public class MorningWorkout {

    public static void main(String[] args) {

        for (int i = 1; i <= 30 ; i++) {
            System.out.println("Push-up " + i);
            /*
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             */
            //Thread.sleep(2500);
            pause(2.5);
        }

        System.out.println("--------------------------------------");

        for (int i = 1; i <= 20; i++) {
            System.out.println("Pull up " + i);
            /*
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             */

            //Thread.sleep(3500);

            pause(3.5);
        }

    }


    public static void pause(double seconds){

        try {
            Thread.sleep((long)(seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


}
/*
MorningWorkOut:
			1. Do 30 push-ups and try pausing 2.5 seconds in each


			2. Do 20 Pull-ups and try pausing 3.5 seconds in each
 */