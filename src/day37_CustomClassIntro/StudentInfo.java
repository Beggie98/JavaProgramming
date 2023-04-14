package day37_CustomClassIntro;

public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setInfo("Oliver","Male",23,517146);
        student1.getInfo();
        System.out.println("----------------------------------------------");

        Student student2 = new Student();
        student2.setInfo("Bryan","Male",25,1711011);
        student2.getInfo();
        System.out.println("------------------------------------------------");

        Student student3 = new Student();
        student3.setInfo("Mia","Female",22,354799);
        student3.getInfo();

        System.out.println("--------------------------------");
        student1.drink("coffee");
        student2.coding("java");
        student3.eat("Palov");




    }
}
