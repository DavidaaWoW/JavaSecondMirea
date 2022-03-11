package Seventh.Composite;

public class Leaf implements Composite{
    private double price;

    public Leaf(double price) {
        this.price = price;
    }

    @Override
    public double execute() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
