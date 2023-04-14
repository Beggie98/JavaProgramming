package day47_Recap;

import Utilities.Data2;

public class AccessModifiers_Inheritance extends Data2 {

    public void method(){
        System.out.println(publicVariable);
        System.out.println(protectedVariable);//as long as there is inheritance protected is visible to subclass outside the package
        //System.out.println(defaultVariable);//default is only visible within the same package

        publicMethod();
        protectedMethod();//as long as there is inheritance protected is visible to subclass outside the package
        //defaultMethod();//default is only visible within the same package
    }

}
