package Day01;

public class Actor {

    private String name;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Actor(String name, int year) {
        this.name = name;
        this.year = year;
    }
}
