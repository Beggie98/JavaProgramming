package day03_Variables;

public class VariablePractice1 {

    //double vs float

    public static void main(String[] args) {
        System.out.println(0.5);
        double num1 = 0.5;
        float num2 = 0.5f;
        // larger primitive data type cannot be assigned to smaller primitive data type
        // double > float > long > int > short > byte
        // smaller type can be assigned to larger type
        long num3=500;
        System.out.println("------------------------");
    }

}
