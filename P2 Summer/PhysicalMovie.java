import java.util.Collection;

public abstract class PhysicalMovie extends Movie {
    private Format format;

    public PhysicalMovie(int id, String title, Collection<String> genres, String director, int year, Format format) throws MovieException {
        super(id, title, genres, director, year);

        if (format == null) {
            throw new MovieException("Invalid format");
        }

        this.format = format;
    }

    public Format getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return super.toString() + ", Format: " + format;
    }

    @Override
    public int compareTo(Movie otherMovie) {
        if (otherMovie instanceof PhysicalMovie) {
            PhysicalMovie diffMovie = (PhysicalMovie) otherMovie;
            
            int formatComparison = this.format.compareTo(diffMovie.format);
            if (formatComparison != 0) {
                return formatComparison;
            }
    
            if (this instanceof ActionMovie && diffMovie instanceof DocumentaryMovie) {
                return -1; 
            } else if (this instanceof DocumentaryMovie && diffMovie instanceof ActionMovie) {
                return 1; 
            }

            return this.getTitle().compareTo(diffMovie.getTitle());
        }

        return super.compareTo(otherMovie);
    }
}
