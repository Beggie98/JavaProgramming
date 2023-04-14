package day08_If_Statements;

public class Single_If_Statement_Intro {

    public static void main(String[] args) {

        int score = 59;

        if(score >= 60){//if the student scored at least 60
            System.out.println("Congrats you passed the exam");
        }else{
            System.out.println("Unfortunately you failed");
        }
        // can also be solved this way
//        int score = 59;
//        boolean passed = score >= 60;
//        if(passed){ // if student passed the exam
//            System.out.println("Congrats you passed the exam");
//        }else{//else student failed
//            System.out.println("Unfortunately you failed");
//        }




    }

}
