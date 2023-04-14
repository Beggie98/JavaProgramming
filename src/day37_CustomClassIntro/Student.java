package day37_CustomClassIntro;

public class Student {

    public String name;
    public String gender;
    public int age;
    public int studentID;

    public void setInfo(String studentName, String studentGender, int studentAge, int ID){
        name = studentName;
        gender = studentGender;
        age = studentAge;
        studentID = ID;
    }

    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("studentID = " + studentID);
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void coding(String lang){
        System.out.println(name + " is coding in " + lang);
    }



}
