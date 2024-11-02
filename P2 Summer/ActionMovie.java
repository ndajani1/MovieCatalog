import java.util.Collection;

public class ActionMovie extends PhysicalMovie {
    private String mainActor;

    public ActionMovie(int id, String title, Collection<String> genres, String director, int year, Format format, String mainActor) throws MovieException {
        super(id, title, genres, director, year, format);
        if (mainActor == null || mainActor.isEmpty()) {
            throw new MovieException("Invalid input");
        }
        this.mainActor = mainActor;
    }

    public String getMainActor() {
        return this.mainActor;
    }

    @Override
    public String getType() {
        return "Action";
    }

    @Override
    public String toString() {
        return "Type: " + getType() + ", " + super.toString() + ", Main Actor: " + mainActor;
    }
}