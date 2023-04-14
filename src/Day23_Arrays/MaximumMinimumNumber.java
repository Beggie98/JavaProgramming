package Day23_Arrays;

public class MaximumMinimumNumber {
    // write a program that can find the maximum number from an array of integers
    public static void main(String[] args) {
        int[] numbers = {10,5,4,400,50,0,-1};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers[i];
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);

    }
}
