package estateAgent;

public class Office extends Build{
    public Office(double square, int number) {
        super(square, number);
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
