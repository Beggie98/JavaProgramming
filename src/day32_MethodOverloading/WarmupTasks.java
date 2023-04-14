package day32_MethodOverloading;

public class WarmupTasks {
    public static void main(String[] args) {

        int sum2 = sumOf2Numbers(10,12);
        int sum3 = sumOf3Numbers(100,200,300);
        int sum4 = sumOf4Numbers(1000,2000,3000,4000);

        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        System.out.println("-----------------------------------------");

        int r1 = sum(10,12);
        int r2 = sum(100,200,300);
        int r3 = sum(1000,2000,3000,4000);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("---------------------------------");
        //10.5, 20.5
        double r4 = sum(10.5,20.);

        //2.5, 3.2, 4,8

        double r5 = sum(2.5, 3.2, 4.8);

        //5.5, 10.5, 3.5, 20.5
        double r6 = sum(5.5, 10.5, 3.5, 20.5);

        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);
        System.out.println("r6 = " + r6);


    }

    public static int sumOf2Numbers(int a, int b){
        return a+b;
    }

    public static int sumOf3Numbers(int a, int b, int c){
        return a+b+c;
    }

    public static int sumOf4Numbers(int a, int b, int c, int d){
        return a+b+c+d;
    }


    //-------------------------------- Method Overloading ------------------------------

    public static int sum(int a, int b){
        return a+b;
    }

    public static double sum(double a, double b){
        return a+b;
    }



    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static double sum(double a, double b, double c){
        return a+b+c;
    }

    public static int sum(int a, int b, int c, int d){
        //return sum(a,b) + sum(c,d);
        //return sum( sum(a,b) , sum(c,d) );//nested method calls

        //return sum(a,b,c) + d;

        return a+b+c+d;
    }

    public static double sum(double a, double b, double c, double d){
        return a+b+c+d;
    }

}
