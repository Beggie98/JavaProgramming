package Practice1;

public class PersonInfo {

    public static void main(String[] args) {
        //First way
        String name = "Mehmet";
        //Second way
        String name1;
        name1 = "Mehmet";

        //Third way
        String name2, surname;
        name2="Mehmet";
        surname="Cybertek";



        String name4 = "Mehmet";
        byte age = 40;
        char gender ='M';
        boolean isStudent = true;
        short numberOfSiblings = 2;
        long favouriteNumber = 7;
        int numberOfSeason=4, year = 1998;
        double birthDate=07.18;
        String fullBirthDate = "" + birthDate + "." + year;
        System.out.println("fullBirthDate = " + fullBirthDate);
        String favouriteQuote = "It is about not winning, it is about not quitting";

        System.out.println("name4 = " + name4);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("isStudent = " + isStudent);
        System.out.println("numberOfSiblings = " + numberOfSiblings);
        System.out.println("favouriteNumber = " + favouriteNumber);
        System.out.println("numberOfSeason = " + numberOfSeason);

        //Escape Sequences
        System.out.println("========== Escape Sequences =============");

        System.out.println("\tname : " + name4 + "\n\tage :" + age + "\n\tgender :" + gender);




    }

}
