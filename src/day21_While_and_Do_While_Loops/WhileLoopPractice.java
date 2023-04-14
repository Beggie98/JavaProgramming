package day21_While_and_Do_While_Loops;

public class WhileLoopPractice {
    public static void main(String[] args) {

        String sentence = "Java is fun, Java is cool, Java is not easy, Java Java";//replaceFirst("Java", "");
        //                " is fun, Java is cool, Java is not easy, Java Java
        //                " is fun, is cool, Java is not easy, Java Java
        //                " is fun, is cool, is not easy, Java Java
        //                " is fun, is cool, is not easy, Java
        //                " is fun, is cool, is not easy,

        int countJava = 0;

        while (sentence.contains("Java")){
            countJava++;
            sentence = sentence.replaceFirst("Java", "");//to take out Java from the string one by one
        }
        System.out.println("countJava = " + countJava);

    }
}
