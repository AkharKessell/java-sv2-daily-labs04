package Day04;

public class Airport {

    public static void main(String[] args) {

        Passenger passenger = new Passenger("John Doe", "sdfglhs-3475ö2634", 2);
        Plane plane = new Plane(5);
        plane.addPassenger(passenger);

        System.out.println(passenger.getName());
        System.out.println(passenger.getBags());
        System.out.println(passenger.getTickedId());


        System.out.println(Currency.EUR.getCountriesWhereUsed());
    }
}
