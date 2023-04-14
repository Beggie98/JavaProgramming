package day41_CustomClass_Constructors.MovieTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String title, country, genre, director;
    public LocalDate releaseDate;
    public ArrayList<String> casts;

    public static boolean isFilm, hasCredit;

    static {
        isFilm = true;
        hasCredit = true;
    }

    public Movie(String title, String country, String genre, String director, LocalDate releaseDate) {
        this.title = title;
        this.country = country;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        casts = new ArrayList<>();
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
        return "Country: " + country + "\n" + "Title: " + title + "\n" + "Release Date: " + releaseDate.format(dtf) +
                "\n" + "Genre: " + genre + "\n" + "Director: " + director + "\n" + "Casts: " + casts.size();
    }
}
