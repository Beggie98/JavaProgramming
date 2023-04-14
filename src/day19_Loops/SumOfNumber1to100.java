package day19_Loops;

public class SumOfNumber1to100 {
    /*
    write a program that can calculate the sum of all numbers between 1 to 100
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
