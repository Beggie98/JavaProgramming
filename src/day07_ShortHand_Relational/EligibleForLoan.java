package day07_ShortHand_Relational;

public class EligibleForLoan {
/*
income has to be at least 60k
			at least have 2 years of work history
			at least have 700 of credit score
			at least 18 years old

 */
    public static void main(String[] args) {
        String name = "Bekzod";
        int income = 70000,
                yearsOfWorkHistory = 3,
                creditScore = 750,
                age = 17;

        boolean isEligibleForLoan = income >= 60000 && yearsOfWorkHistory >= 2 && creditScore >= 700 && age >=18;
        System.out.println(name + " is eligible for a loan: " + isEligibleForLoan);

        //can be solved this way too
//        boolean r1 = income >= 60000 && yearsOfWorkHistory >= 2;
//        boolean r2 = creditScore >= 700 && age >=18;
//        boolean isEligible = r1 && r2;
//
//        System.out.println(name + " is eligible for a loan: " +isEligible);

        /*
        income has to be at least 60k
			at least have 2 years of work history
			at least have 700 of credit score
			or
			at least 18 years old
         */

//        boolean result = income >= 60000 && yearsOfWorkHistory >= 2 && (creditScore >= 700 || age >=18);

    }



}
