package day40_CustomClass_Statics.movieTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {
        Movie movie1 = new Movie();

        movie1.setInfo("Journey to SDET: Cybertek Batch 23","USA","Adventure, Comedy, Thriller, Horror",
                "Kuzzat Altay", LocalDate.of(2021,5,17));
        movie1.addCast("Asiya");
        String[] casts = {"Mehmet", "Akbar"};
        movie1.addCast(casts);

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Dilem", "Ahmet","Tugba"));

        movie1.addCast(students);

        System.out.println(movie1);

    }
}
/*
create a class called MovieObjects
			1. create an object of the movie:
					title: Journey to SDET: Cybertek Batch 23
					country: USA
					Genre: Adventure, Comedy, Thriller, Horror
					release date: May/17/2021
					director: Kuzzat Altay
					Casts: Asiya, Mehmet, Akbar and 5 more students from your group

			print the full info of the movie

 */