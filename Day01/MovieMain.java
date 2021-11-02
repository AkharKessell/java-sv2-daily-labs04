package Day01;

public class MovieMain {
    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", 1997);
        movie.addActor(new Actor("Sophia Loren", 1968));
        movie.addActor(new Actor("Bruce Willis", 1993));
        movie.addActor(new Actor("Sophia Loren", 1987));

        System.out.println(movie.actorsInTheirTwenties());
    }
}