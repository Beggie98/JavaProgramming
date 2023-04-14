package day06_Homework;

public class Homework {

    public static void main(String[] args) {
        int a = 50;//a=50-1=49+1=50-1=49+1=50
        a = --a + a++ + a-- + a++;
        //   49 + 49  + 50  + 49
        //   98 + 50 + 49
        //   148 + 49
        //   a = 197
        System.out.println("a = " + a);
        System.out.println("-----------------------------");

        int x = 4;//x=4+1=5
        int y = x * 4 - x++;
        //      4 * 4 - 4
        //  y = 16 -4
        //  y = 12
        System.out.println("y = " + y);
        System.out.println("x = " + x);




    }

}
