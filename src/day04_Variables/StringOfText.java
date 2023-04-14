package day04_Variables;

public class StringOfText {
    
    /*
    String: for string of text. "" (multiple characters involved)
     */

    public static void main(String[] args) {
        String greeting = "Hello";

        System.out.println("greeting = " + greeting);
        
        String name = "Bekzod";

        System.out.println("name = " + name);

        String brand = "Toyota";
        String cityName = "McLean";
        String gender = "Male";
        char gender2 = 'M';

        String s1 = "12";
        int n1 = 12;

        System.out.println(n1 * 2);
//        System.out.println(s1*12);

        System.out.println("---------------------");

        int age = 31;
        String sentence = "My age is: " + age;// '+': concatenation
        System.out.println(sentence);

            //My age is: 21

        System.out.println("12"+1); // concatenation: 121
        System.out.println(12+1); // addition: 13

        System.out.println("------------------");

        int number = 5000;

        System.out.println("number = " + number); //result will be String

    }

}
