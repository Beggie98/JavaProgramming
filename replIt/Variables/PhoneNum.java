package Variables;

import java.util.Scanner;

public class PhoneNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter area code and local number");
        int areaCode = input.nextInt(),
            localNumber = input.nextInt();
        String phoneNumber = "(" + areaCode + ")-" + localNumber;

        System.out.println("Calling number " + phoneNumber);
        input.close();
    }
}
