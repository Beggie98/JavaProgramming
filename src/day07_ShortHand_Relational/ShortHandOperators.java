package day07_ShortHand_Relational;

public class ShortHandOperators {

    public static void main(String[] args) {
        String name1 = "Bekzod";
        String name2 = "Juraev";
        String name3 = name2;//name3 = "Juraev"
        name2 = name1;//name2 = "Bekzod"
        //name1 = name2;//name1 = "Bekzod"
        name1 = name3;//name1 = "Juraev"

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        System.out.println("------------------------------");

        int a = 200;
        System.out.println("a = " + a);// a = 200
        int b = a;//b = 200
        a = 100 + 300;//a = 400
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("----------------------------");

        int balance = 300;
        //balance = balance + 200;
        balance += 200;//balance = 500; addition assignment

        System.out.println("balance = " + balance);

        balance += 1000;
        System.out.println("balance = " + balance);

        String school = "Cybertek";
        school += " School"; // == school = school + " School"; =  Cybertek School

        System.out.println("school = " + school);

        String name = "John";
        String lastName = "Daniel";
        name += " " + lastName;
        //name += " "
        //name += lastName
        System.out.println("name = " + name);//John Daniel
        System.out.println("----------------------------------");

        //withdraw money from the balance
        balance -= 300;// == balance = balance - 300; subtraction assignment
        System.out.println("balance = " + balance);//1500 - 300 = 1200

        balance -= 1000;
        System.out.println("balance = " + balance);//200

        System.out.println("------------------------------");

        // *=: multiplication assignment

        double salary = 100000;
        salary *= 2;// == salary = salary * 2;

        System.out.println("salary = $" + salary);//$200000

        salary *= 1.5;
        System.out.println("salary = $" + salary);

        //0.65 = take home salary (after tax)
        salary *= 0.65;
        System.out.println("salary = $" + salary);//$195000; salary after tax
        System.out.println("-----------------------------------------");

        // /= : division assignment
        double slices = 10;
        slices /= 3;

        System.out.println("slices per person = " + slices);
        System.out.println("-----------------------------------");

        // %= : remainder assignment
        int cents = 105;
        int quarters = cents/25;//4 quarters 5 cents remainder

        cents %= 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        System.out.println("---------------------------");





    }



}
