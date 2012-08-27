import static java.lang.String.format;

/**
 * Created with IntelliJ IDEA.
 * User: SONY
 * Date: 8/17/12
 * Time: 9:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
    String movieName;
    String director;
    double rating;

    public Movie(String name,String director, double rating){
        this.movieName=name;
        this.director=director;
        rating= Double.parseDouble(format("%.2f",rating));
        this.rating=rating;
    }
    public String toString(){
        return movieName+" "+director+" "+rating;
    }
}
