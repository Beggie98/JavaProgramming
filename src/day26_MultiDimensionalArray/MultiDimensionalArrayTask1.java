package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayTask1 {
    /*
    use for each loop to print each names of the fgiven array:
	String[][][][][] names = { {  {{{"Viktoria", "Feruza"},{"Koray", "Break"} }, {{"Komiljon", "Yasin"}}}
	, { {{"Alexandra", "Merve"}, {"Zaur", "Vulkasin"} }}} };

     */
    public static void main(String[] args) {
        String[][][][][] names = { {  {{{"Viktoria", "Feruza"},{"Koray", "Break"} }, {{"Komiljon", "Yasin"}}}
                , { {{"Alexandra", "Merve"}, {"Zaur", "Vulkasin"} }}} };
        for (String[][][][] arr4D : names){
            for (String[][][] arr3D : arr4D){
                for (String[][] arr2D : arr3D){
                    for (String[] arr1D : arr2D){
                        for (String element : arr1D){
                            System.out.println(element);
                        }
                    }
                }
            }
        }

        System.out.println();
        System.out.println("---------------------------------------------");

    }
}