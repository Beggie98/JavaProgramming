package day06_UnaryOperators;

public class UnaryOperators {

    public static void main(String[] args) {
        int a = 100;

        ++a; // pre-increment

        System.out.println("a = " + a);//101

        int b = 100;

        --b;// pre-decrement

        System.out.println("b = " + b);//99

        System.out.println("-----------------------");

        int x = 10;

        System.out.println(++x);// 11 pre: increases the value by 1 immediately

        System.out.println(x++);// 11 post: first passes the current value, then increase the value by 1

        System.out.println("x = " + x);

        System.out.println("----------------------");
        int n1 = 50;
        int n2 = n1++; //n2 = 50, n1 = 51

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);

        int a1 = 100;
        int a2 = ++a1; // a1 = 101, a2 = 101

        System.out.println("a1 = " + a1);
        System.out.println("a2 = " + a2);

        System.out.println("------------------");
        int r = 200;

        System.out.println( r++ ); //200. delay
        System.out.println("r = " + r);//201

        int p = 100;
        System.out.println( ++p );//101. right away
        System.out.println("p = " + p);

        System.out.println("-----------------------");

        int y = 100;
        int result = y++ + 1;
        //           100 + 1 = 101. after: y = 101
        System.out.println("result = " + result);//101
        System.out.println("y = " + y);

        int z = 100;//101
        int result2 = ++z + 1;
        //            101 + 1 = 102

        System.out.println("z = " + z);
        System.out.println("result2 = " + result2);
    }

}
