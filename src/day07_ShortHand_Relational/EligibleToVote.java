package day07_ShortHand_Relational;

public class EligibleToVote {
/*
to Vote:
		1. MUST be US citizen
		2. at least 18 years old

		Must be US citizen  OR  at least 18 years old
 */
    public static void main(String[] args) {

        String name = "Aaron King";

        int age = 34;
        String citizen = "UK";

        boolean eligibleToVote = age >= 18 && citizen == "USA";// both should be true to get true, at least 1 condition is false: result is false
        //                       34  >= 18 &&    "UK" == "USA"
        //                          true   &&        false

        System.out.println(name + " is eligible to vote for Biden: " + eligibleToVote);



    }




}
