package day27_Recap;

public class FirstUniqueElement {
    public static void main(String[] args) {
        /*
        write a program that can return the first unique element from the array
         */
        int[] array = {1,1,2,3,3,3,4,5,5,5,6,6,6,7,7,7,8};

        for (int each : array) {
            int frequency = 0;
            for (int element : array) {
                if (each == element){
                    frequency++;
                }
            }
            if (frequency == 1){
                System.out.println(each);
                break;
            }
        }



    }
}
