package Methods;

import java.util.Arrays;

public class SwitchElements {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(do_switch(array)));

    }

    public static int[] do_switch(int[] array){
        int temp = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = temp;

        return array;
    }


}
