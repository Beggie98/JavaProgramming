package Methods;

public class HamletLogic {
    public static void main(String[] args) {
        System.out.println(hamletQuote(false,false));
    }


    public static boolean hamletQuote(boolean b1, boolean b2){
        boolean result = false;

        if (b1==true || b2 == true){
            result = true;
        }

        return result;


    }


}
