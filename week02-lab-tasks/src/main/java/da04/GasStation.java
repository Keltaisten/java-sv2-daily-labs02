package da04;

public class GasStation {
    int price;

    public GasStation(int price) {
        this.price = price;
    }

    public int refueling(Car car, int liter){
        car.setOil(liter);
        return price *liter;
    }
}
