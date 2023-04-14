package day11_Switch;

public class Operators {
    public static void main(String[] args) {
        double n1 = 44,
                n2 = 22;
        char operator = '1';
        double result = 0;

        switch (operator){
            case '+': result = n1 + n2;
            break;
            case '-': result = n1 - n2;
            break;
            case '*': result = n1 * n2;
            break;
            case  '/': result = n1 / n2;
            break;
            default:
                System.err.println("Invalid entry");
                break;
        }
        System.out.println(result);
    }
}
