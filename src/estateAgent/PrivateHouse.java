package estateAgent;

public class PrivateHouse extends Build{

    public PrivateHouse(double square, int number) {
        super(square, number);
    }

    @Override
    public double getPricePerAMeter() {
        if (getSquare() < 100) {
            return 700;
        }
        else
            return 600;
    }

    @Override
    public String setOwner() {
        return "New owner of private-house is Mrs. Smith";
    }

    @Override
    public String toString() {
        return "Private house number " + getNumber() +
                " with square " + getSquare() + " costs " + getSquare() * getPricePerAMeter()+
                ". " + setOwner();
    }
}
