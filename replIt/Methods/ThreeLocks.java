package Methods;

public class ThreeLocks {
    public static void main(String[] args) {
        System.out.println(threeLocks(false, false, true));
    }

    public static boolean threeLocks(boolean a, boolean b, boolean c){
        boolean result = false;
        if ((a == true && b == true) || (c == true)){
            result = true;
        }

        return result;
    }

}
/*
**threeLocks** accepts 3 booleans and returns a boolean.

It returns true only if both **_a and b are true_** or **_c is true_**.

Hint: See truth table

 */