import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public abstract class Movie implements Comparable<Movie> {
    private final int id;
    private final String title;
    private final Collection<String> genres;
    private final String director;
    private final int year;

    public Movie(int id, String title, Collection<String> genres, String director, int year) throws MovieException {
        if (id <= 0 || title == null || title.isEmpty() || genres == null || genres.isEmpty() || director == null || director.isEmpty() || year <= 0) {
            throw new MovieException("Invalid arguments");
        }

        this.id = id;
        this.title = title;
        this.genres = new HashSet<>(genres);
        this.director = director;
        this.year = year;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Collection<String> getGenres() {
        return this.genres;
    }

    public final String getDirector() {
        return this.director;
    }

    public final int getYear() {
        return this.year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (!(obj instanceof Movie))    
            return false;

        Movie otherMovie = (Movie) obj;

        return this.id == otherMovie.id || (this.title.equals(otherMovie.title) && this.director.equals(otherMovie.director));
    }

    @Override
    public int compareTo(Movie otherMovie) {
        if (this.id < otherMovie.id)
            return -1;
        if (this.id > otherMovie.id)
            return 1;
    
        return 0;
    }
    public abstract String getType();

    @Override
    public String toString() {
        String genresString = Arrays.deepToString(genres.toArray());
        return "ID: " + id + ", Title: " + title + ", Genres: " + genresString + ", Director: " + director + ", Year: " + year;
    }

}