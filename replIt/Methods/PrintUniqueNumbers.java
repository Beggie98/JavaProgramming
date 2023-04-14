package Methods;

import java.util.Scanner;

public class PrintUniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size");
        int size = input.nextInt();

        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = input.nextInt();
        }

        printUniqueNumbers(nums);

    }


    public static void printUniqueNumbers(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int each = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int num = nums[j];
                if (each == num){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }
    }


}
