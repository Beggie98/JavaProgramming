package Methods;

import java.util.Arrays;

public class AddToArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(addToArray(array,6)));

    }

    public static int[] addToArray(int[] array, int number){
        int[] result = Arrays.copyOf(array,array.length+1);

        result[result.length-1] = number;

        return result;

    }


}
