package day08_If_Statements;

public class GradeReport2 {
    /*
    score

    grade:
        A: 90 <= score <= 100
        B: 80 <= score <= 89
        C: 70 <= score <= 79
        D: 60 <= score <= 69
        F: score < 60
     */
    public static void main(String[] args) {

        int score = 85;

        boolean madeA = score >= 90 && score <= 100;
        boolean madeB = !madeA && score >= 80;// not A
        boolean madeC = !madeA &&!madeB && score >= 70;//meaning not B and not A
        boolean madeD = !madeA &&!madeB && !madeC && score >= 60;//meaning not C, not B and not A
        boolean madeF = !madeA &&!madeB && !madeC && !madeD && score < 60;//meaning not D,not C, not B and not A

        if(madeA){
            System.out.println("A");
        }if(madeB){
            System.out.println("B");
        }if(madeC){
            System.out.println("C");
        }if(madeD){
            System.out.println("D");
        }if(madeF){
            System.out.println("F");
        }





    }




}
