package day29_ReturnMethods;

public class ReturnMethodsPractice2 {
    public static void main(String[] args) {
        int score = 105;
        System.out.println("Grade: " + grades(score));
    }

    public static String grades(int score){
        String grade = "";
        if (score>=0 && score<=100){
            if (score>=90){
                grade = "A";
            }else if (score>=80){
                grade = "B";
            }else if (score>=70){
                grade = "C";
            }else if (score>=60){
                grade = "D";
            }else {
                grade = "F";
            }
        }else {
            grade = "Invalid Entry";
        }
        return grade;
    }

}
