package day14_Java_Recap;

import java.util.Scanner;

public class TernarySwitchPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number between 1 and 7: ");
        int number = input.nextInt();
        String name = "";
//        String name = (number>=1 && number<=7)? (number==1)? "Monday" :(number==2)? "Tuesday":(number==3)? "Wednesday"
//                :(number==4)? "Thursday":(number==5)? "Friday":(number==6)? "Saturday":"Sunday":"Invalid Day";

        if (number >=1 && number<=7){
            switch (number){
                case 1: name = "Monday";
                break;
                case 2: name = "Tuesday";
                break;
                case 3:name = "Wednesday";
                break;
                case 4:name = "Thursday";
                break;
                case 5:name = "Friday";
                    break;
                case 6:name = "Saturday";
                    break;
                default: name = "Sunday";
            }
        } else{
            name = "No such a day";
        }
        System.out.println(name);
        input.close();

    }
}
