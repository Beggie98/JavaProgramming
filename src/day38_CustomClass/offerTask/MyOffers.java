package day38_CustomClass.offerTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer();
        offer1.setInfo("IL",true,110000,false,"SDET");

        Offer offer2 = new Offer();
        offer2.setInfo("IN",true,100000,true,"QA");

        Offer offer3 = new Offer();
        offer3.setInfo("KY",false,120000,false,"Java Developer");

        Offer offer4 = new Offer();
        offer4.setInfo("MI",true,115000,true,"SDET");

        Offer offer5 = new Offer();
        offer5.setInfo("IL",true,120000,true,"QA");

        Offer offer6 = new Offer();
        offer6.setInfo("IN", false, 110000,false,"SDET");

        Offer offer7 = new Offer();
        offer7.setInfo("OH",true, 125000,true,"SDET");

        Offer[] array = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};
        ArrayList<Offer> offers = new ArrayList<>();
        offers.addAll(Arrays.asList(array));

        offers.removeIf(p -> !p.state.equals("IL"));

        for (Offer each : offers){
            System.out.println(each);
        }

        System.out.println("---------------------------------");

        ArrayList<Offer> list = new ArrayList<>(Arrays.asList(array));

        list.removeIf(p -> !(p.jobTitle.equals("SDET") || p.jobTitle.equals("QA")) );

        for (Offer each : list) {
            System.out.println(each);
        }

        System.out.println("-------------------------------------------");
        ArrayList<Offer> list1 = new ArrayList<>();

        for (Offer each : array) {
            if (each.workFromHome){
                list1.add(each);
            }
        }

        System.out.println(list1);
        

        System.out.println("-----------------------------------------");

        ArrayList<Offer> list2 = new ArrayList<>(Arrays.asList(array));

        list2.removeIf(p -> !p.hasBenefit);

        for (Offer each : list2) {
            System.out.println(each);
        }

        System.out.println("--------------------------------------");
        ArrayList<Offer> hightSalaryOffers = new ArrayList<>(Arrays.asList(array));
        hightSalaryOffers.removeIf(p -> p.salary < 115000);

        System.out.println(hightSalaryOffers);

    }
}
/*
Offer:
	    Attributes:
	       state, hasBenifit(boolean), salary, WFH(boolean), JobTitle

	    Actions:
	        SetInfo, toString

	    create a class named MyOffers
	        1. create 7 objects Offer Class and store them into an arraylist
	        2. write a program that can only keep the offers from your local area
	        3. write program that can remove all the offers that are not SDET or QA
	        4. write a program that can remove all the offers that are not WFH
	        5. write a program that can remove all the offers that do not have benifits
 */