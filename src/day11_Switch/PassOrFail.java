package day11_Switch;

public class PassOrFail {
    public static void main(String[] args) {
        char grade = 'A';
        /*
        A, B, C, D - passed
        F - failed
         */
        switch (grade){
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Pass");
                break;
            case 'F':
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid input");
                break;







        }
    }
}
