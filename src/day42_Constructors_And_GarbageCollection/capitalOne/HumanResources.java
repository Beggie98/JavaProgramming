package day42_Constructors_And_GarbageCollection.capitalOne;

import day41_CustomClass_Constructors.ScrumTask.Developer;
import day41_CustomClass_Constructors.ScrumTask.Tester;

public class HumanResources {

    public static Tester[] testersTeam1, testersTeam2, testersTeam3;
    public static Developer[] devopsTeam1, devopsTeam2, devopsTeam3;

    static {
        testersTeam1 = new Tester[]{
                new Tester("Yuliang",'M',"QA",10,110000),
                new Tester("Abbos",'M',"SM",11,115000),
                new Tester("Selda",'F',"QE",12,120000)
        };

        testersTeam2 = new Tester[]{
                new Tester("Feruza",'F',"SDET",17,125000),
                new Tester("Ahmet",'M',"QA",18,109000),
                new Tester("Muhtar",'M',"SDET",19,135000),
                new Tester("Ismail",'M',"QA",20,111000)
        };

        testersTeam3 = new Tester[]{
                new Tester("Shirin",'F',"SDET",21,100000),
                new Tester("Emre",'M',"SDET",23,115000)
        };


    }

    static {
        devopsTeam1 = new Developer[]{
                new Developer("Zorana",'F',"Software Developer", 13,135000),
                new Developer("Mehmet",'M',"Java Developer", 14,125000),
                new Developer("Yulia",'F',"Software Developer", 15,145000),
                new Developer("Yasin",'M',"Python Developer", 16,130000)
        };

        devopsTeam2 = new Developer[]{
                new Developer("Meltem",'F',"Software Developer", 24,125000),
                new Developer("Dilem",'M',"Python Developer", 25,120000),
                new Developer("Davut",'M',"Java Developer", 26,135000),
                new Developer("Ekaterina",'F',"Software Developer", 27,160000),
                new Developer("Memet",'M',"Developer", 28,155000)
        };

        devopsTeam3 = new Developer[]{
                new Developer("Merve",'F',"Python Developer", 30,125000),
                new Developer("Tamara",'M',"Software Developer", 31,120000),
                new Developer("Christian",'M',"Java Developer", 32,135000),
        };

    }


}
