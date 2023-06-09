package day40_CustomClass_Statics.movieTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String title, country, genre, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts = new ArrayList<>();

    public static boolean film, hasCredit;

    public void setInfo(String title, String country, String genre, String director, LocalDate releaseDate) {
        this.title = title;
        this.country = country;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
    }

    public void addCast(String cast){
        casts.add(cast);
    }

    public void addCast(String[] casts){
        this.casts.addAll(Arrays.asList(casts));
    }

    public void addCast(ArrayList<String> casts){
        this.casts.addAll(casts);
    }

    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/YYYY EEEE");
        return "Movie{" +
                "title='" + title + '\'' +
                ", country='" + country + '\'' +
                ", genre='" + genre + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate=" + releaseDate.format(dtf) +
                ", total number of casts: " + casts.size() +
                '}';
    }
}
/*
2. Create a class named Movie
		Attributes:
			title (String)
			country (String)
			Genre (String)
			releaseDate (LocalDate)
			director (String)
			casts (ArrayList<String>)

			statics:
				film (boolean)
				hasCredit (boolean)

		Instance methods
			setInfo(): sets the country, title, Genre ,release date, and director of the Movie
			addCast(String): adds the given string argumnet to the arrayList casts
			addCast(String[]): adds the given string array argumnet to the arrayList casts
			addCast(ArrayLis<String>): adds the given string arraylist argumnet to the arrayList casts
			toString(): returns the name of country, title, release date, and total number of casts


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
