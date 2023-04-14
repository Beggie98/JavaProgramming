package day29_ReturnMethods;

public class SystemExit_VS_Return {
    public static void main(String[] args) {
        passOrFailed(30);
    }


    public static void passOrFailed(int score){

        if (score<0 || score>100){
            System.out.println("Invalid");
            return;
            //System.exit(0);//terminates everything
        }
        if (score>=60){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

    }
}
