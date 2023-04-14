package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveInstances {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size for the list");
        int size = input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number");
            numbers.add(input.nextInt());
        }

        System.out.println("Which number should I remove?");
        int number = input.nextInt();

        System.out.println(removeInst(numbers,number));
        input.close();
    }

    public static ArrayList<Integer> removeInst(ArrayList<Integer> list, int number){
        list.removeIf(p -> p == number);
        return list;
    }

}
