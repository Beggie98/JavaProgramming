package day20_Branching_Statements;

public class BranchingStatements {
    public static void main(String[] args) {
        //break - is used for stopping iteration: exiting from loop
        for (int i = 0; i <= 5; i++) {

            if (i==3){
                break;
            }
            System.out.println(i);//0,1,2
        }
        System.out.println("------------------------");

        //continue - skipping the current iteration

        for (int i = 0; i <= 5; i++) {
            if (i==3){
                continue;
            }
            System.out.println(i);//0,1,2,4,5 - 3 is skipped
        }
        System.out.println("---------------------------");
        //print the odd numbers between 1 ~ 10. Must use continue

        for (int i = 1; i <= 10; i++) {
            if (i%2==0){//if i is even number
                continue;
            }
            System.out.println(i);
        }
        System.out.println("------------------------------------");
        //print all the numbers that are evenly divisible by 3 and 5 between 1 ~ 100

        for (int i = 1; i <= 100; i++) {
            if (i%3!=0 && i%5!=0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-------------------------------");
        //print all letters between A ~ Z, except for D, T, X

        for (char i = 'A'; i <= 'Z' ; i++) {
            if (i==(char)'D' || i==(char)'T' || i==(char)'X' ){
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
