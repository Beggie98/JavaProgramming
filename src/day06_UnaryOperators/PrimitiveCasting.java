package day06_UnaryOperators;

import java.text.DecimalFormat;

public class PrimitiveCasting {

    public static void main(String[] args) {
        byte a = 10;
        long b = a;//implicit casting is done automatically - converting smaller type to larger type

        double num1 = 23.0;
        int num2 = (int) num1;//explicit casting is done manually - converting larger type to smaller type

        System.out.println("-------------------------");

        long n = 100;
        short m = (short)n; // cannot be casted since int is still larger than short

        float q = 2.5f;
        int u = (int)q;

        long r = (long)q;
        short s = (short)q;

        System.out.println((double)2.5f);
        System.out.println((double)10L);

        int w = 129;
        byte z = (byte)w;//129 is out of byte's range. the result will be a negative number
        System.out.println("z = " + z);

        int e = 70000;
        short g = (short) e;

        System.out.println("g = " + g);

        System.out.println("-------------------------");

        double num3 = 1000.0;
        int num4 = (int) num3;//explicit casting

        System.out.println("num4 = " + num4);
        System.out.println("num3 = " + num3);

        System.out.println((int)110.215651);//110

//        DecimalFormat df = new DecimalFormat("0.00");
//        System.out.println(df.format(156.56151281));//156.56


    }

}
