package Seventh.Decorator;

public class SimpleCar implements Car{
    private int speed = 50;
    private int baggageWeight = 100;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int getBaggageWeight() {
        return baggageWeight;
    }

}
