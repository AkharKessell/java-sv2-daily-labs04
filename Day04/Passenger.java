package Day04;

public class Passenger {

    private String name;
    private String tickedId;
    private double bags;

    public Passenger(String name, String tickedId, double bags) {
        this.name = name;
        this.tickedId = tickedId;
        this.bags = bags;
    }

    public String getName() {
        return name;
    }

    public String getTickedId() {
        return tickedId;
    }

    public double getBags() {
        return bags;
    }

    public void setName(String name) {
        this.name = name;
    }
}
