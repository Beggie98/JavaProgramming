package day36_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,8,8,8));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %2 != 0){
                list.remove(i);
            }
        }

        System.out.println(list);




    }
}
