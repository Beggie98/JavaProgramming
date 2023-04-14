package day30_Recap;

public class BranchingStatements {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i==3){
            break;//can also use return method to exit the main method, break will exit the loop, continue will skip the current iteration
            }
            System.out.println(i);

        }
    }
}
