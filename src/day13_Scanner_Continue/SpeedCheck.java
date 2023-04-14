package day13_Scanner_Continue;

import java.util.Scanner;

public class SpeedCheck {
    /*
    3. Write a program for the speed check.
		a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything

		Ex:
			speedLimit = 55;
			Enter current speed:
			105

			output:
			You're driving 50 mph over the limit. Slow down!

			Enter current speed:
			45

			output:
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your current speed: ");
        double speed = input.nextDouble();//if we are using the Scanner input once only
        //  double speed = new Scanner(System.in).nextDouble() is also correct for one time use of Scanner input: no variable will be needed for Scanner\


        double speedlimit = 55;
        if (speed > speedlimit){
            System.out.println("You are driving " + (speed - speedlimit) + " mph over the limit. Please slow down");
        }else{

        }
    }
}
