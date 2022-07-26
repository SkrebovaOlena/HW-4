package estateAgent;

public class PrivateHouse extends Build{


    public PrivateHouse(double square, int number) {
        super(square, number);
    }

    @Override
    public String getInformationAboutBuild() {
        String information ="The privateHouse number " + getNumber() +
                " with square " + getSquare() + " costs " + getSquare() * getPricePerAMeter()+
                ". " + setOwner();
        return information;
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
}
