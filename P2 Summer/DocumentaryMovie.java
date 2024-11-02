import java.util.Collection;
import java.util.Set;

public class DocumentaryMovie extends PhysicalMovie {
    private Collection<String> topics;

    public DocumentaryMovie(int id, String title, Set<String> genres, String director, int year, Format format, Collection<String> topics) throws MovieException {
        super(id, title, genres, director, year, format);

        if (topics == null || topics.isEmpty()) {
            throw new MovieException("Invalid topics");
        }
        this.topics = topics;
    }

    public Collection<String> getTopics() {
        return topics;
    }

    @Override
    public String getType() {
        return "Documentary";
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", " + super.toString() + ", Num Topics: " + topics.size();
    }
}