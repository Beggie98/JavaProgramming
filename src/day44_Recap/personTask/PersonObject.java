package day44_Recap.personTask;

import java.time.LocalDate;

public class PersonObject {
    public static void main(String[] args) {
        Person person1 = new Person("John",'M', LocalDate.of(2007,10,8),"USA","English");
        person1.setName("Shay");
        person1.setGender('F');

        System.out.println(person1.getName());
        System.out.println(person1);


    }
}
