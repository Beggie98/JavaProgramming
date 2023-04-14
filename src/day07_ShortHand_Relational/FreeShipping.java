package day07_ShortHand_Relational;

public class FreeShipping {

    public static void main(String[] args) {

        double price = 15; // > 25
        boolean isPrimeMember = false;// prime member

        boolean isEligibleForFreeShipping = price >= 25 || isPrimeMember == true;//at least 1 condition must be true to get true result, to get false result both should be false
        //                                     15 >= 25 ||           true == true
        //                                       false  ||           true == true
        //                                              true
        System.out.println(isEligibleForFreeShipping);






    }



}
