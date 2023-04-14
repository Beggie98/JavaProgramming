package day41_CustomClass_Constructors.ScrumTask;

public class BankOfAmerica {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Yuliang", 'M',"QA",10,110000);
        Tester tester2 = new Tester("Abbos", 'M',"Scrum Master",11,115000);
        Tester tester3 = new Tester("Selda",'F',"QE",12,120000);

        Tester[] testers = {tester2, tester3};

        Developer developer1 = new Developer("Zorana",'F',"Software Developer",13,125000);
        Developer developer2 = new Developer("Mehmet",'M',"Java Developer",14,130000);
        Developer developer3 = new Developer("Yuliia",'F',"Software Developer",15,125000);
        Developer developer4 = new Developer("Yasin",'M',"Java Developer",16,122000);

        Developer[] developers = {developer2, developer3, developer4};

        ScrumTeam scrum1 = new ScrumTeam("Shazia","Fhilipp","Aysu");

        scrum1.hireTester(tester1);
        scrum1.hireDeveloper(developer1);
        scrum1.hireTester(testers);
        scrum1.hireDeveloper(developers);
        System.out.println(scrum1);

        double budget = 0;

        scrum1.hireTester( new Tester("Tugba",'F',"SDET",9,11800));

        for (Tester eachTester : scrum1.testers){
            budget += eachTester.salary;
        }

        for (Developer eachDeveloper : scrum1.developers){
            budget += eachDeveloper.salary;
        }

        System.out.println("budget = " + budget);

        ScrumTeam scrum2 = new ScrumTeam("","","");//add 5 testers & 6 developers
        ScrumTeam scrum3 = new ScrumTeam("","","");//add 2 testers & 4 developers

        ScrumTeam[] scrumTeams = {scrum1, scrum2, scrum3};

        //print name and salary
        /*
        for (ScrumTeam scrumTeam : scrumTeams) {
            for (Tester tester : scrumTeam.testers) {

            }

            for (Developer developer : scrumTeam.developers) {

            }
        }

        1. total budget
        2. total number of testers in Bank of America
        3. total number of developers in Bank of America
        4. max and min salary of testers
        5. max and min salary of developers

         */

    }
}
