package day07_ShortHand_Relational;

public class MarketGroups {
    /*
    earlyBirds: 50 ~ 60
    group1: 40 ~ 49
    group2: 30 ~ 39
    angryBirds: < 30
     */
    public static void main(String[] args) {
            int score = 35;
            boolean earlyBird = score >= 50 && score <= 60;//false
            //                     false    &&   true
            boolean group1 = score >= 40 && score <=49;//false
        //                     false     &&   true
            boolean group2 = score >= 30 && score <=39;//true
        //                     true    &&   true
            boolean angryBird = score < 30;//false

        System.out.println("earlyBird = " + earlyBird);
        System.out.println("group1 = " + group1);
        System.out.println("group2 = " + group2);
        System.out.println("angryBird = " + angryBird);



    }



}
