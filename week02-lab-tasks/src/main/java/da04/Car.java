package da04;

public class Car {
    int oil;
    int drive;

    public void setOil(int oil){
        this.oil = oil;
    }

    public void setDrive(int drive){
        this.drive = drive;
    }

    public double getOil() {
        return oil;
    }

    public int getDrive() {
        return drive;
    }

    public double calculateConsumption(){
        return ((oil*1.0)/drive)*100;
    }

}
