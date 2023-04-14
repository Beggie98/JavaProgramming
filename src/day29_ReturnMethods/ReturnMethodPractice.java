package day29_ReturnMethods;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        int[] numbers = {10,5,0,-1,20,8,7};
        int max = numbers[0];
        int min = numbers[0];

        for (int each : numbers){
                max = maxNumber(each,max);
                min = minNumber(each,min);

        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("-----------------------------------------------------");

        int[] nums = {200,300,50,5,-1,0,1000,2000};
        int maximumNumber = maxNumberFromIntArray(nums);
        int minimumNumber = minNumberFromIntArray(nums);

        System.out.println("minimumNumber = " + minimumNumber);
        System.out.println("maximumNumber = " + maximumNumber);


    }

    public static int maxNumber(int a, int b){
        /*
        int max = 0;
        if (a > b){
            max = a;
        }else {
            max = b;
        }

        return max;
         */

        return (a>b)? a : b;


    }
    public static int minNumber(int a, int b){
        return (a<b)? a : b;
    }


    public static int maxNumberFromIntArray(int[] numbers){
        int max = numbers[0];
        for (int number : numbers){
            max = maxNumber(number, max);
        }
        return max;
    }

    public static int minNumberFromIntArray(int[] numbers){
        int min = numbers[0];
        for (int number : numbers){
            min = minNumber(number, min);
        }
        return min;
    }

}
