package day22_Recap;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        int totalPrice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Hotel");
        System.out.println("Would you like to reserve a room?");
        String answer = input.nextLine();

        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
            System.out.println("Would you like to reserve a room?");
            answer = input.nextLine();
        }

        while (answer.equalsIgnoreCase("Yes")){
            System.out.println("Which bed type do you want?");//King Bed, queen bed, single bed

            String bedType = input.nextLine().toLowerCase();

            if (bedType.equalsIgnoreCase("king bed")){
                totalPrice += 120;
            }else if (bedType.equalsIgnoreCase("queen bed")){
                totalPrice += 100;
            } else if (bedType.equalsIgnoreCase("single bed")) {
                totalPrice += 80;
            }else{
                System.out.println("Invalid room selected");
            }
            System.out.println("Do you want to reserve another room?");
            answer = input.nextLine();
            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid entry, please re-enter. Do you want to reserve another room?");
                answer = input.nextLine();
            }

        }
        System.out.println("Your total price is: $" + totalPrice);

    }
}
