package day49_Exceptions;

public class ThrowsKeyword {
    //throws keyword is ONLY used for handling checked exceptions, but it handles them temporarily
    //caller of the method will be responsible for handling the exception
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Test started");
        System.out.println("Step 1");
        sleep(2.5);


        //Thread.sleep(3000);

        //System.out.println(9/0);

        System.out.println("Step 2");

        sleep(2.5);


        //Thread.sleep(3000);
        //System.out.println("".charAt(-200));


        System.out.println("Test completed");

    }


    public static void sleep(double seconds) throws InterruptedException {
        long milliseconds = (long)(seconds * 1000);
        Thread.sleep(milliseconds);
    }



    /*
    public static void sleep(double seconds) {
        long milliseconds = (long)(seconds * 1000);
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

     */


}
