package day33_Methods;

import java.util.Arrays;
import Utilities.ArraysUtility;

public class WarmUpTask0 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        System.out.println(Arrays.toString(removeElement(array,2)));

        System.out.println("-------------------------------------------------");

        double[] array1 = {6.5, 7.5, 8.5, 9.5};
        array1 = removeElement(array1,2);
        System.out.println(Arrays.toString(array1));

        System.out.println("---------------------------------------------------");

        String[] students = {"Dilem", "Aysu", " Mucahit", "Tugba", "Fhilipp"};
        students = removeElement(students,2);
        System.out.println(Arrays.toString(students));//[Dilem, Aysu, Tugba, Fhilipp]

        students = removeElement(students,3);
        System.out.println(Arrays.toString(students));
        System.out.println("--------------------------------------------------");

        char[] chars1 = {'A', 'B', 'C', 'D', 'E'};
        char[] chars2 = {'F', 'G', 'H', 'I', 'J'};

        char[] chars3 = ArraysUtility.mergeArrays(chars1,chars2);

        System.out.println(Arrays.toString(chars3));
    }

    //remove the element at given index of the array

    public static int[] removeElement(int[] array, int index){

        if (index < 0 || index > array.length-1){
            System.out.println("Invalid Index");
            System.exit(0);
        }

        int[] arr = new int[array.length-1];

        for (int i = 0, j=0; i <array.length ; i++) {
            if (i == index){
                continue;
            }else {
                arr[j++] = array[i];
            }
        }

        return arr;

    }

    public static double[] removeElement(double[] array, double index){

        if (index < 0 || index > array.length-1){
            System.out.println("Invalid Index");
            System.exit(0);
        }

        double[] arr = new double[array.length-1];

        for (int i = 0, j=0; i <array.length ; i++) {
            if (i == index){
                continue;
            }else {
                arr[j++] = array[i];
            }
        }

        return arr;

    }

    public static String[] removeElement(String[] array, int index){

        if (index < 0 || index > array.length-1){
            System.out.println("Invalid Index");
            System.exit(0);
        }

        String[] arr = new String[array.length-1];

        for (int i = 0, j=0; i <array.length ; i++) {
            if (i == index){
                continue;
            }else {
                arr[j++] = array[i];
            }
        }

        return arr;

    }

    public static char[] removeElement(char[] array, int index){

        if (index < 0 || index > array.length-1){
            System.out.println("Invalid Index");
            System.exit(0);
        }

        char[] arr = new char[array.length-1];

        for (int i = 0, j=0; i <array.length ; i++) {
            if (i == index){
                continue;
            }else {
                arr[j++] = array[i];
            }
        }

        return arr;

    }



}
