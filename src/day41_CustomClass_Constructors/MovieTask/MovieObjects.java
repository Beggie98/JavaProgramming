package day41_CustomClass_Constructors.MovieTask;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Journey to SDET: Cybertek Batch 23", "USA","Adventure, Comedy",
                "Kuzzat Altay", LocalDate.of(2021,05,17));

        movie1.addCast("Jon Jones");

        String[] casts = {"Connor McGregor", "Cyril Gane"};

        movie1.addCast(casts);

        ArrayList<String> castsList = new ArrayList<>(Arrays.asList("Islam Makhachev", "Khabib Nurmagomedov", "Cody Garbrandt"));
        movie1.addCast(castsList);

        System.out.println(movie1);

    }
}
