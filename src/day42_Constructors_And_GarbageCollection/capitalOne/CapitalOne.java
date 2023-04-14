package day42_Constructors_And_GarbageCollection.capitalOne;

import day41_CustomClass_Constructors.ScrumTask.Developer;
import day41_CustomClass_Constructors.ScrumTask.ScrumTeam;
import day41_CustomClass_Constructors.ScrumTask.Tester;

public class CapitalOne {
    public static void main(String[] args) {
        ScrumTeam scrumTeam1 = new ScrumTeam("Zengin","Engin","Cengiz");
        scrumTeam1.hireTester(HumanResources.testersTeam1);
        scrumTeam1.hireDeveloper(HumanResources.devopsTeam1);

        ScrumTeam scrumTeam2 = new ScrumTeam("Selda","Mucahit","Dilem");
        scrumTeam2.hireTester(HumanResources.testersTeam2);
        scrumTeam2.hireDeveloper(HumanResources.devopsTeam2);

        ScrumTeam scrumTeam3 = new ScrumTeam("Mohigul","Maftuna","Zulkhumor");
        scrumTeam3.hireTester(HumanResources.testersTeam3);
        scrumTeam3.hireDeveloper(HumanResources.devopsTeam3);

        System.out.println(scrumTeam1);
        System.out.println(scrumTeam2);
        System.out.println(scrumTeam3);

        System.out.println("------------------------------------------------------");

        ScrumTeam[] scrumTeams = {scrumTeam1, scrumTeam2, scrumTeam3};

        //Task1: Total budget
        double budget = 0;
        for (ScrumTeam eachScrumTeam : scrumTeams) {
            for (Tester eachTester : eachScrumTeam.testers){
                budget += eachTester.salary;
            }
        }

        for (ScrumTeam eachScrumTeam : scrumTeams){
            for (Developer eachDeveloper : eachScrumTeam.developers) {
                budget += eachDeveloper.salary;
            }
        }

        System.out.println("budget = " + budget);

        System.out.println("------------------------------------------");

        int totalNumberOfTesters = 0,
                totalNumberOfDevelopers = 0;

        for (ScrumTeam scrumTeam : scrumTeams) {
            totalNumberOfTesters += scrumTeam.testers.size();
            totalNumberOfDevelopers += scrumTeam.developers.size();
        }

        System.out.println("totalNumberOfTesters = " + totalNumberOfTesters);
        System.out.println("totalNumberOfDevelopers = " + totalNumberOfDevelopers);

        System.out.println("---------------------------------------------------------");

        double maxSalaryOfTester = 0;//scrumTeams[0].testers.get(0).salary;
        double minSalaryOfTester = Double.MAX_VALUE;
        String t1 = "", t2 = "";

        double maxSalaryOfDeveloper = 0;//scrumTeams[0].testers.get(0).salary;
        double minSalaryOfDeveloper = Double.MAX_VALUE;
        String d1 = "", d2 = "";

        for (ScrumTeam eachScrumTeam : scrumTeams){
            for (Tester eachTester : eachScrumTeam.testers){

                if (eachTester.salary > maxSalaryOfTester){
                    maxSalaryOfTester = eachTester.salary;
                    t1 = eachTester.name;
                }

                if (eachTester.salary < minSalaryOfTester){
                    minSalaryOfTester = eachTester.salary;
                    t2 = eachTester.name;
                }

                /*
                maxSalaryOfTester = Math.max(eachTester.salary, maxSalaryOfTester);
                minSalaryOfTester = Math.min(eachTester.salary, minSalaryOfTester);

                 */

            }

            for (Developer eachDeveloper : eachScrumTeam.developers){
                if (eachDeveloper.salary > maxSalaryOfDeveloper){
                    maxSalaryOfDeveloper = eachDeveloper.salary;
                    d1 = eachDeveloper.name;
                }

                if (eachDeveloper.salary < minSalaryOfDeveloper){
                    minSalaryOfDeveloper = eachDeveloper.salary;
                    d2 = eachDeveloper.name;
                }

            }


        }

        System.out.println("maxSalaryOfTester = " + maxSalaryOfTester + " ====> " + t1);
        System.out.println("minSalaryOfTester = " + minSalaryOfTester + " ====> " + t2);

        System.out.println("maxSalaryOfDeveloper = " + maxSalaryOfDeveloper + " ====> " + d1);
        System.out.println("minSalaryOfDeveloper = " + minSalaryOfDeveloper + " ====> " + d2);

    }
}
