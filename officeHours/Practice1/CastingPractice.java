package Practice1;

public class CastingPractice {

    public static void main(String[] args) {
        /*
        byte < short < int < long < float < double

        Type casting
        1-Implicit Casting

            double a = 5;//5.0

            - Done by Compiler
            - Smaller type to bigger type
            - No data loss

        2-Explicit Casting

            double b = 5.3;
            int i=b;

            - Done by developer
            - Bigger type to smaller type
            - We can lose data

         */



        byte b = 10;
        short s=b;//Implicit casting
        double c = 5.3;
        int k = (int)b;//5.3 is lost
        System.out.println(k);//5
        //double to int

        double a = 5.3;
        int i=(int)a; //Explicit casting
        System.out.println(i);
        a=i;// Implicit a = 5

        //long to int

        long l = 9999999999l;
        int ii=(int)l;

        System.out.println("ii : " + ii);







    }

}
