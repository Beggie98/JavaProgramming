package day40_CustomClass_Statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlocks {

    public static int a = 10;//if static variable takes one step to initialize, then we don't need static block
    //public static Excel excel
    public static ArrayList<String> list = new ArrayList<>();
    //list.addAll(Arrays.asList("A", "B", "C"));


    public static void main(String[] args) {//main method runs only within the current class, not outside the class
        //list.addAll(Arrays.asList("A", "B", "C"));
        System.out.println(list);//[A, B, C]
    }



    static {//static initializer block
        list.addAll(Arrays.asList("A","B","C"));
    }
    //static block runs first than main method, and it runs one time


}
