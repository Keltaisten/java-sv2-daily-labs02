package da04;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation gasStation = new GasStation(450);

        System.out.println("Tankolás ára: " + gasStation.refueling(car,35));

        car.setDrive(650);

        System.out.println("Az átlagfogyasztás: " + car.calculateConsumption());
    }
}
