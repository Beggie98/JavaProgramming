package day03_Variables;

public class VariableIntro {

    public static void main(String[] args) {

        short myAge = 24;
        byte broAge = 25;

        System.out.print("My age is ");
        System.out.println(myAge);
        System.out.print("My brother's age is ");
        System.out.println(broAge);

        //1998
        //byte myBirthYear = 1998; 1998 is outside of byte's range
        short myBirthYear = 1998;
        System.out.print("My birthyear is ");
        System.out.println(myBirthYear);

        // salary: 100k

        // short salary = 100000;
        int salary = 100000;

        //int number = 9999999999;
        long number = 999999999L; // when we see a compile error we declare a variable a long and we need to add 'L' or 'l' at the end of the number
        // compile error appears when the number is exceeding the int's range
    }

}
