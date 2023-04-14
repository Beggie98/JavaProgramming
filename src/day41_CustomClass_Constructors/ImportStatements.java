package day41_CustomClass_Constructors;

import java.util.Arrays;//regular import: imports everything from the class
//import PackageName.className;


 //static import: only imports specific static members that you need.
// static import PackageName.className.staticMembers;



//import Utilities.Data;
import static Utilities.Data.str3;
import static Utilities.Data.str4;
import static Utilities.Data.*;//selects all the static members in the class


public class ImportStatements {


    public static void main(String[] args) {
        /*
        Data obj = new Data();
        System.out.println(obj.str1);
        System.out.println(obj.str2);

        System.out.println(Data.str3);
        System.out.println(Data.str4);

         */

        System.out.println("-----------------------------");
        //if only static members needed, we can import only static members
        //once imported no need to call classname to use the static members
        System.out.println(str3);
        System.out.println(str4);
        method3();
    }


}
/*
class Data{
    int a,b;

    static int c, d;
}
 */