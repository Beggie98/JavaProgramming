package day41_CustomClass_Constructors.OfferTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1 = new Offer("CA","SDET",true,false,120000);
        Offer offer2 = new Offer("NV","QA",true,false,110000);
        Offer offer3 = new Offer("CA","SDET",false,true,115000);
        Offer offer4 = new Offer("MO","SM",false,false,125000);
        Offer offer5 = new Offer("NY","QE",true,true,105000);

        Offer[] offers = {offer1, offer2, offer3, offer4, offer5};
        ArrayList<Offer> allOffers = new ArrayList<>(Arrays.asList(offers));

        ArrayList<Offer> localOffers = new ArrayList<>(allOffers);
        localOffers.removeIf(offer -> !offer.state.equals("CA"));
        for (Offer localOffer : localOffers) {
            System.out.println(localOffer);
        }

        System.out.println("-------------------------------------");

        ArrayList<Offer> offers1 = new ArrayList<>();


        for (Offer each : allOffers) {
            if (!(each.jobTitle.equals("SDET") || each.jobTitle.equals("QA"))){
                offers1.add(each);
            }
        }

        for (Offer each : offers1) {
            System.out.println(each);
        }

        System.out.println("-------------------------------------------");

        ArrayList<Offer> offers2 = new ArrayList<>(allOffers);
        offers2.removeIf(offer -> offer.workFromHome);

        for (Offer offer : offers2) {
            System.out.println(offer);
        }

        System.out.println("------------------------------------------------");

        ArrayList<Offer> offers3 = new ArrayList<>(allOffers);
        offers3.removeIf(offer -> offer.hasBenefit);

        for (Offer offer : offers3) {
            System.out.println(offer);
        }


    }
}
