package Methods;

public class Signum {
    public static void main(String[] args) {
        sign(0);
    }


    public static void sign(int a){
        if (a>0){
            System.out.println("Positive");
        }else if (a<0){
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
    }

}
