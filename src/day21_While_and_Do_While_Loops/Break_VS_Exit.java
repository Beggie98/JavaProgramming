package day21_While_and_Do_While_Loops;

public class Break_VS_Exit {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i==3){
                //break;//exits the loop ONLY
                System.exit(0);//terminates the system
            }
            System.out.println("Cybertek School");
        }
        System.out.println("Hello");//executed in break case but not in System.exit case
    }

}
