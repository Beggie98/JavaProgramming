package day07_ShortHand_Relational;

public class PassOrFail {
/*
PassOrFail
			pass: score >= 60
			fail: score <60

 */
    public static void main(String[] args) {
        int score = 59;


        boolean passOrFail = score >=60;
        System.out.println("The student passed: " + passOrFail);



    }



}
