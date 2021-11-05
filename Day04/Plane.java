package Day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int maxCapacity;
    private List<Passenger> passengers= new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean addPassenger(Passenger passenger){
        if(passengers.size()<maxCapacity) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    public int getNumberOfPackages(){
        int sumPackage=0;
        for(Passenger pass : passengers){
            sumPackage+=pass.getBags();
        }
        return sumPackage;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
}