package day24_Arrays;



public class Classmates {
    /*
    create string array, and store the names of your  class mates (10)
            print the first three characters of each name
     */
    public static void main(String[] args) {
        String[] classmates = {"Abbos", "Otabek", "Kamron", "Sarvar","Sherzod",
                "Shaxzod", "Alfred", "Akrom", "Faxriddin", "Doston"};

        for (int i = 0; i < classmates.length; i++) {
            String each = classmates[i];

            String eachFirstThreeChars = each.substring(0,3);

            System.out.println(eachFirstThreeChars);

        }

    }
}
