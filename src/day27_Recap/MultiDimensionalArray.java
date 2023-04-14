package day27_Recap;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[] scrum1 = {"Komiljon", "Yuliang"};
        String[] scrum2 = {"Sabir", "Tamara"};
        String[] scrum3 = {"Tugba", "Hilal"};

        String[][] scrumTeams = {scrum1 , scrum2, scrum3};

        System.out.println(Arrays.toString(scrumTeams[0]));
        System.out.println(Arrays.deepToString(scrumTeams));
        System.out.println(scrumTeams[1][1]);

        System.out.println("----------------------------------");

        for (String[] each1D : scrumTeams){
            System.out.println(Arrays.toString(each1D));
        }

        System.out.println("---------------------------------------");

        for (String[] each1D : scrumTeams){
            for (String eachMember : each1D){
                System.out.print(eachMember + " ");
            }
        }
        System.out.println("\n-----------------------------------------------");

        for (int i = 0; i < scrumTeams.length; i++) {
            for (int j = 0; j < scrumTeams[i].length; j++) {
                System.out.print(scrumTeams[i][j] + " ");
            }
        }

        System.out.println("\n-----------------------------------");

        int[] numbers = {1,2,3,4,5}; // {5,2,3,4,1}
        int c = numbers[0];
        numbers[0] = numbers[4];
        numbers[4] = c ;

        System.out.println(Arrays.toString(numbers));

    }
}
