package day08_If_Statements;

public class EligibleToVote {

    public static void main(String[] args) {
        String name = "Bryan";
        int age = 21;
        String citizen = "USA";

        boolean eligibleToVote = age >= 21 && citizen == "USA";

        if (eligibleToVote){
            System.out.println(name + " is eligible to Vote");
        }
        if(!eligibleToVote){
            System.out.println(name + " is ineligible to vote");
        }




    }



}
