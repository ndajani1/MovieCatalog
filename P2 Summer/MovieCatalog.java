import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class MovieCatalog implements Iterable<Movie>{
    private List<Movie> catalog;

    public MovieCatalog() {
        catalog = new ArrayList<>();
    }

    public void addMovie(Movie movie) throws DuplicateMovieException {
        for (Movie currentMovie : catalog) {
            if (currentMovie.equals(movie)) {
                throw new DuplicateMovieException("Duplicate Movie");
            }
        }
        catalog.add(movie);
    }

    public List<Movie> search(Searchable searchable) {

        List<Movie> results = new ArrayList<>();

        for (Movie movie : catalog) {
            if (searchable.matches(movie)) {
                results.add(movie);
            }
        }
        return results;
    }

    public void sort() {
        Collections.sort(catalog);
    }
    @Override
    public Iterator<Movie> iterator() {
        return new MovieIterator();
    }

    private class MovieIterator implements Iterator<Movie> {
        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < catalog.size();
        }

        @Override
        public Movie next() {
            if (this.hasNext()) {
                return catalog.get(i++);
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
