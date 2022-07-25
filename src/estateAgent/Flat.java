package estateAgent;

public class Flat extends Build{

    protected int floor;

    public Flat(double square, int number, int floor) {
        super(square, number);
        this.floor = floor;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public double getPricePerAMeter() {
        if (floor < 3){
            return 300;
        }
        else if (floor < 10)  {
            return 400;
        }
        else
        return 500;
    }

    @Override
    public String setOwner() {
        return "New owner of flat is Mr.Bond";
    }
}

