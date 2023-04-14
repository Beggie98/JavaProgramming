package day40_CustomClass_Statics;

import day38_CustomClass.employeeTask.Employee;

public class HumanResource {

    public static Employee employee1 = new Employee();
    //employee1.setInfo("Ahmet",'M',1,"SDET",100000);//methods must be called in a method or block



    public static Employee employee2 = new Employee();
    public static Employee employee3 = new Employee();
    public static Employee employee4 = new Employee();
    public static Employee employee5 = new Employee();

    static {
        employee1.setInfo("Ahmet",'M',1,"SDET",100000);
        employee2.setInfo("John",'M',2,"SDET",120000);
        employee3.setInfo("Daniel",'M',3,"SDET",120000);
        employee4.setInfo("Aaron",'M',4,"SDET",120000);
        employee5.setInfo("Chris",'M',5,"SDET",120000);
    }
//we can use as many static blocks as we want, but one static block is enough
    /*
    public static void main(String[] args) {
        employee1.setInfo("Ahmet",'M',1,"SDET",100000);
    }

     */

}
