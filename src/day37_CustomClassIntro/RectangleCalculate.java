package day37_CustomClassIntro;

import java.util.Arrays;

public class RectangleCalculate {

    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        rec.setInfo(10,20);
        //rec.getInfo();
        System.out.println(rec);

        System.out.println("-------------------------------");

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(10,50);
        //rectangle2.getInfo();

        System.out.println(rectangle2);

        System.out.println("--------------------------------------");

        //System.out.println(rec.toString());//Width: 10.0, Length: 20.0
        //System.out.println(rectangle2);//Width: 10.0, Length: 50.0
        // don't have to include toString() in print statement, compiler does it implicitly, object is enough


//        int[] arr = {1,2,3,4,5,6};
//        System.out.println(arr);

        //toString() - instance method used to print objects, can be executed implicitly by compiler
        //returnType: String

        System.out.println("-------------------------------");

        Rectangle[] arr = {rec, rectangle2};

        System.out.println(Arrays.toString(arr));

    }


}
