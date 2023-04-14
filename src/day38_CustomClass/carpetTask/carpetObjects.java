package day38_CustomClass.carpetTask;

import java.util.ArrayList;
import java.util.Arrays;

public class carpetObjects {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet();
        Carpet carpet2 = new Carpet();
        Carpet carpet3 = new Carpet();
        Carpet carpet4 = new Carpet();
        Carpet carpet5 = new Carpet();

        carpet1.customerOrder(3,2,100,true);
        carpet2.customerOrder(2,1,80,false);
        carpet3.customerOrder(1,4,130,false);
        carpet4.customerOrder(2,2,95,true);
        carpet5.customerOrder(3,5,150,true);

        Carpet[] carpets = {carpet1, carpet2, carpet3, carpet4, carpet5};
         /*
        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customerOrder(3,2,100,true);
        carpets[1].customerOrder(2,1,80,false);
        carpets[2].customerOrder(1,4,130,false);
        carpets[3].customerOrder(2,2,95,true);
        carpets[4].customerOrder(3,5,150,true);

         */

        ArrayList<Carpet> allCarpets = new ArrayList<>();
        allCarpets.addAll(Arrays.asList(carpets));

        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        //ArrayList<Carpet> regularCarpets = new ArrayList<>();

        for (Carpet each : allCarpets) {
            if (each.isPersian){
                persianCarpets.add(each);
            }
            //else {
            //    regularCarpets.add(each);
            //}
        }

        for (Carpet each : persianCarpets) {
            System.out.println(each);
        }

        System.out.println("---------------------------------------------");

        ArrayList<Carpet> regularCarpets = new ArrayList<>(allCarpets);
        regularCarpets.removeIf(p -> p.isPersian);

        for (Carpet each : regularCarpets) {
            System.out.println(each);
        }

        System.out.println("Total persian carpets: " + persianCarpets.size());
        System.out.println("Total regular carpets: " + regularCarpets.size());

    }
}
/*
 create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
        write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets

                    use for each loop to print out all the persian carpets
 */