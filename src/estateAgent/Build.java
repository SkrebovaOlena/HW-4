package estateAgent;

public abstract class Build implements OwnerAble {

    private double square;
    private int number;

    public Build(double square, int number) {
        this.square = square;
        this.number = number;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

   public abstract String getInformationAboutBuild();

    public abstract double getPricePerAMeter();
}
