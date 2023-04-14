package day04_Variables;

public class ConcatenationPractice {

    public static void main(String[] args) {
        /*
            +:
                addition: when we have two numbers
                    10 + 10 = 20

                concatenation: when there is at least one String
                    "10" + "10" = 1010
                    1 + "10" = "110"
                    "2" + 3 = 23
         */

        String word = "Java";

        System.out.println("My favourite programming language is " + word + " programming language");

        System.out.println("------------------------------");

        int dollar = 10000;
        double lira = 8.41;
        double dollarInLira = dollar * lira;
        double euro = dollar * 0.88;

        System.out.println(dollar + " US dollars equals to " + dollarInLira + " Turkish liras");
        System.out.println(dollar + " US dollars equals to " + euro + " Euros");

        System.out.println("---------------------------");
        int a = 10,
            b = 20;

        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println("------------------------------");

        String name = "Bekzod",
                favouriteBook = "Alchemist",
                favouriteMusic = "JANAGA",
                favouriteSeries = "Alice in Borderland";

        System.out.print("\tHello, my name is " + name);
        System.out.print(", my favourite book is \"" + favouriteBook);
        System.out.print("\", my favourite music is \"" + favouriteMusic);
        System.out.println("\", my favourite series is \"" + favouriteSeries +"\"");
        System.out.println("-----------------------------------------");

        String today = "Monday",
                todayClass = "Java",
                tomorrow = "Tuesday",
                tomorrowClass = "Selenium";

        System.out.println("Today is " + today + ", today we have " + todayClass + " Class" + ". Tomorrow is "
                + tomorrow + ", tomorrow we have " + tomorrowClass + " Class.");
    }

}
