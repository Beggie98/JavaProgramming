package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MoveAllZerosToTheEnd {
    /*
    write a program that can move all the zeros to the end of the array
		Ex:
			array = {10, 0, 5, 0, 1, 0};

			output:
				{10, 5, 1, 0, 0, 0}
     */
    public static void main(String[] args) {
        int[] array = {10, 0, 5, 0, 1,0,0,0,0, 0,9,8,92,1,5,62,51,56,651,751};
        int[] result = new int[array.length];//{10, 5, 1, 0, 0, 0}
        int j = 0;
        for (int each : array) {
            if (each != 0){
                result[j++] = each;
            }
        }
        System.out.println(Arrays.toString(result));

    }
}
