package day37_CustomClassIntro;

import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class Dogs {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setInfo("Snuffles", "Dalmation", "Male", "Black and white", "large", 5);

        Dog dog2 = new Dog();
        dog2.setInfo("Fluffy", "Husky", "Male", "White and blue", "medium", 2);

        Dog dog3 = new Dog();
        dog3.setInfo("Kelly", "Corgi", "Female", "Brown and white", "small", 3);

        Dog dog4 = new Dog();
        dog4.setInfo("Alex", "Doberman", "Male", "Black and brown", "large", 4);

        Dog dog5 = new Dog();
        dog5.setInfo("Ralph", "Bulldog", "Male", "White and brown", "small", 1);

        Dog dog6 = new Dog();
        dog6.setInfo("Snack", "Chihuahua", "Female", "White", "tiny", 5);

        Dog dog7 = new Dog();
        dog7.setInfo("Snuffles", "Dalmation", "Male", "Black and white", "large", 5);

        Dog dog8 = new Dog();
        dog8.setInfo("Noodle", "Havanese", "Male", "Yellow", "small", 5);

        Dog dog9 = new Dog();
        dog9.setInfo("Pud", "Husky", "Female", "White", "medium", 4);

        Dog dog10 = new Dog();
        dog10.setInfo("Scooby", "Husky", "Male", "Brown", "large", 6);

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5, dog6, dog7, dog8, dog9, dog10};
        ArrayList<Dog> list = new ArrayList<>();
        list.addAll(Arrays.asList(dogs));


        System.out.println(list);

    }
}
