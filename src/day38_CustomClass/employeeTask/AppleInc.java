package day38_CustomClass.employeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleInc {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setInfo("Karina", 'F', 11,"SDET",110000);

        System.out.println(employee1);

        employee1.salary = 115000;
        System.out.println(employee1);

        Employee employee2 = new Employee();
        employee2.setInfo("Abbos", 'M', 12,"QA",100000);

        System.out.println(employee2);

        Employee employee3 = new Employee();
        employee3.setInfo("Tugba",'F',13,"SDET",120000);

        Employee employee4 = new Employee();
        employee4.setInfo("Phillip", 'M', 21,"SDET",115000);


        Employee employee5 = new Employee();
        employee5.setInfo("Ella",'F',13,"QA", 110000);

        Employee employee6 = new Employee();
        employee6.setInfo("Ahmet", 'M',14,"QA",110000);

        Employee employee7 = new Employee();
        employee7.setInfo("Sophie", 'F', 16, "SDET",115000);


        Employee[] arr = {employee1, employee2, employee3, employee4, employee5, employee6, employee7};
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(arr));

        double budget = 0;
        for (Employee each : employees){
            //System.out.println(each.employeeName + " : " + each.salary);
            //System.out.println(each);
            budget += each.salary;

        }

        System.out.println("sum = " + budget);

        System.out.println("--------------------------------------");


        ArrayList<Employee> list = new ArrayList<>(employees);
        //remove all the employees that are making more than 115000
        list.removeIf(p -> p.salary >= 115000);

        for (Employee each : list){
            System.out.println(each);
        }

        System.out.println("----------------------------------");
        //remove employees that are not SDET

        ArrayList<Employee> list2 = new ArrayList<>(employees);
        list2.removeIf(p -> !p.jobTitle.equals("SDET"));



        /*
        ArrayList<Employee>  list2 = new ArrayList<>();

        for (Employee each : employees) {
            if (each.jobTitle.equals("SDET")){
                list2.add(each);
            }
        }

         */

        for (Employee each : list2){
            System.out.println(each);
        }

    }
}
