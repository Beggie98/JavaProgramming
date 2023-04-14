package day17_String_Continue;

public class StringMethods {

    public static void main(String[] args) {
        //contains(str) - checks if the given str is contained in the string. returns boolean (has)
        String sentence = " My favorite programming languages are: C#, Java, JavaScript";
        boolean hasPython = sentence.contains("Python");//false
        boolean hasJava = sentence.contains("Java"); //true
        boolean hasJava2 = sentence.contains("java"); //false
        boolean hasJava3 = sentence.toLowerCase().contains("java"); //true

        System.out.println("hasPython = " + hasPython);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasjava = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);
        System.out.println("-------------------------------------------");

        //startsWith(str) - checks if the string is started with given str. returns boolean
        String sentence1 = "Cybertek School is the best";
        boolean startWithCybertek = sentence1.startsWith("Cybertek");//true
        boolean startWithSchool = sentence1.startsWith("School");//false

        System.out.println("startWithCybertek = " + startWithCybertek);
        System.out.println("startWithSchool = " + startWithSchool);


        System.out.println("---------------------------------------");

        //endswith() - checks if the string is ended with given str. returns boolean

        boolean endsWithBest = sentence1.endsWith("best");

        System.out.println("endsWithBest = " + endsWithBest);



    }
}
