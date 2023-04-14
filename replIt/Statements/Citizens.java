package Statements;

import java.util.Scanner;

public class Citizens {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens = input.nextInt();
        int nonSeniorCitizens = input.nextInt();

        System.out.println("What is new citizen's age?");
        int age = input.nextInt();
        String result = "";

        if (age > 0 && age < 150){
            if (age >=65){
                result = "Senior Citizen";
                ++seniorCitizens;
            }else {
                result = "Non-Senior Citizen";
                ++nonSeniorCitizens;
            }
        }else {
            result = "Invalid input";
        }
        System.out.println(result + "\nNew Senior Citizens count " + seniorCitizens +
                "\nNew nonSenior Citizens count "+nonSeniorCitizens);
        input.close();

    }
}
