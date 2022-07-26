package estateAgent;

public class Office extends Build{
    public Office(double square, int number) {
        super(square, number);
    }

    @Override
    public String getInformationAboutBuild() {
        String information = "The office number " + getNumber() +
                " with square " + getSquare() + " costs " + getSquare() * getPricePerAMeter() +
                ". " + setOwner();
        return information;
    }

    @Override
    public double getPricePerAMeter() {
        return 800;
    }


    @Override
    public String setOwner() {
        return "New owner of office is Mr. Smith";
    }
}
