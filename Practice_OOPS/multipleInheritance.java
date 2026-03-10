package Practice_OOPS;

import java.util.*;
import java.text.*;

interface SearchbyGenre{
    void searchbyGenre(String genre);
}

interface SearchbyTitle{
    void searchbyTitle(String title);
}

class Movie{
    private String title;
    private String genre;

    public Movie(String title,String genre){
        this.title = title;
        this.genre = genre;
    }

    public String getTitle(){
        return title;
    }

    public String getGenre(){
        return genre;
    }

    public void getMovieDetail(){
        System.out.println("Title : " + title);
        System.out.println("Genre : " + genre);
        System.out.println("--------------------");
    }
}

class Catalog implements SearchbyTitle, SearchbyGenre{

    private static Date lastUpdated;
    private static List<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie movie){
        movieList.add(movie);

        Calendar cal = Calendar.getInstance();
        lastUpdated = cal.getTime();
    }

    public void searchbyTitle(String title){
        for(Movie movie : movieList){
            if(movie.getTitle().equalsIgnoreCase(title)){
                movie.getMovieDetail();
            }
        }
    }

    public void searchbyGenre(String genre){
        for(Movie movie : movieList){
            if(movie.getGenre().equalsIgnoreCase(genre)){
                movie.getMovieDetail();
            }
        }
    }

    public void showLastUpdated(){
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String todayDate = df.format(lastUpdated);

        System.out.println("Catalog Last Updated Date : " + todayDate);
    }
}

public class multipleInheritance {

    public static void main(String[] args) {

        Catalog catalog = new Catalog();

        catalog.addMovie(new Movie("Inception","Sci-Fi"));
        catalog.addMovie(new Movie("Titanic","Romance"));
        catalog.addMovie(new Movie("Avatar","Sci-Fi"));

        System.out.println("Search by Title");
        catalog.searchbyTitle("Avatar");

        System.out.println("\nSearch by Genre");
        catalog.searchbyGenre("Sci-Fi");

        System.out.println();
        catalog.showLastUpdated();
    }
}
	


