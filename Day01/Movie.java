package Day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private int published;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int published) {
        this.title = title;
        this.published = published;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int counter = 0;

        for (Actor actual : actors) {
            int age = published - actual.getYear();
            if (age >= 20 && age < 30) {
                counter++;
            }
            return counter;
        }
        return counter;
    }
}

