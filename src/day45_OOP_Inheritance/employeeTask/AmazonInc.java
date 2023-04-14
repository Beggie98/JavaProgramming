package day45_OOP_Inheritance.employeeTask;

public class AmazonInc {//AmazonInc HAS A Tester
                        //AmazonInc HAS A Developer

    public static void main(String[] args) {

        Tester tester = new Tester("Robinson",'M',28,11,"SDET",120000);
        tester.eat("steak");
        tester.sleep();
        tester.testing();
        //tester.code();//not common for this class, unique to Developer class only
        //tester.fixBugs();//not common for this class, unique to Developer class only

        Developer developer = new Developer("Selda",'F',27,12,"Java Developer",150000);
        developer.eat("sushi");
        developer.sleep();
        //developer.testing();//not common for this class, unique to Tester class only
        developer.code();
        developer.fixBugs();

        Driver driver = new Driver("John",'M',79,13,"Truck Driver",85000);
        driver.eat("lobster");
        driver.sleep();
        driver.drive();

    }

}
