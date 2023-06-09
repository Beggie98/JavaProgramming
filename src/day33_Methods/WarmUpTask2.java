package day33_Methods;

public class WarmUpTask2 {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8};
        System.out.println(contains(array,10));
    }

    public static boolean contains(int[] array, int element){
        boolean result = false;

        for (int each : array){
            if (each == element){
                return true;
            }
        }


        return false;
    }

    public static boolean contains(double[] array, double element){
        boolean result = false;

        for (double each : array){
            if (each == element){
                return true;
            }
        }


        return false;
    }

    public static boolean contains(String[] array, String element){
        boolean result = false;

        for (String each : array){
            if (each.equals(element)){
                return true;
            }
        }


        return false;
    }

    public static boolean contains(char[] array, char element){
        boolean result = false;

        for (char each : array){
            if (each == element){
                return true;
            }
        }


        return false;
    }

}




/*
1. create a method that accepts two parameters: one integer array and one integer number. The method returns true if the number is contained in the integer array, otherwise returns false

		2. create a method that accepts two parameters: one double array and one double number. The method returns true if the decimal number is contained in the double array, otherwise returns false

		3. create a method hat accepts two parameters: one String array and one String. The method returns true if the String is contained in the String array, otherwise returns false

		4. create a method hat accepts two parameters: one char array and one char. The method returns true if the char is contained in the char array, otherwise returns false
 */