package day37_CustomClassIntro;

public class Cat {

    public String name;
    public String color;
    public String gender;
    public int age;
    public String breed;

    public void scratch(String item){
        System.out.println(name + " is scratching " + item);
    }

    public void breakThings(String thing){
        System.out.println(name + " is breaking " + thing);
    }

    public void jump(){
        System.out.println(name + " is jumping");
    }

    public void eat(String food){
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void meow(){
        System.out.println(name + " is meowing");
    }

    public void setInfo(String catName, String catColor, String catGender, int catAge, String catBreed){
        name = catName;
        color = catColor;
        gender = catGender;
        age = catAge;
        breed = catBreed;
    }

    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("color = " + color);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("breed = " + breed);
    }


}
