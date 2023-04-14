package Methods;

public class MethodOverloading1 {
    public static void main(String[] args) {
        int[] arr1 = {8,45,9,5,1,41,5,51,44};
        System.out.println(findMax(arr1));
        System.out.println("----------------------------------");

        double[] arr2 = {2.5,11.5,16.7,7.5,4,6.5};
        System.out.println(findMax(arr2));
    }

    public static int findMax(int[] array){
        int max = array[0];

        for (int each : array) {
            if (each > max){
                max = each;
            }
        }

        return max;
    }

    public static double findMax(double[] array){
        double max = array[0];

        for (double each : array) {
            if (each > max){
                max = each;
            }
        }

        return max;
    }

}
