import java.util.Collection;

public class MovieSearcher implements Searchable {
    private Collection<String> keyWords;

    public MovieSearcher(Collection<String> keyWords) {
        this.keyWords = keyWords;
    }

    @Override
    public boolean matches(Movie movie) {
        for (String keyWord : keyWords) {
            String movieString = movie.toString().toLowerCase();
            if (movieString.contains(keyWord.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}