package day37_CustomClassIntro;

public class CatPark {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Durka";
        cat1.color = "Black and White";
        cat1.gender = "Male";
        cat1.age = 2;
        cat1.breed = "Siamese";

        cat1.getInfo();

        System.out.println("-----------------------------------");

        Cat cat2 = new Cat();
        cat2.setInfo("Chase", "Yellow", "Female",3,"Sphynx");
        cat2.getInfo();

        System.out.println("------------------------------------");

        Cat cat3 = new Cat();
        cat3.setInfo("Larry", "Grey", "Male", 4, "Chartreux");
        cat3.getInfo();

        System.out.println("---------------------------------");

        cat1.eat("Whiskies");
        cat2.meow();
        cat3.scratch("sofa");





    }
}
