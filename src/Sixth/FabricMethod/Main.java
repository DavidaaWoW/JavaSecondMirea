package Sixth.FabricMethod;

public class Main {
    public static void main(String[] args) {
        Logistics logistics = new Logistics();
        logistics.createTransport(1);
        Logistics logistics2 = new Logistics();
        logistics2.createTransport(2);
        logistics.getTransport().deliver();
        logistics2.getTransport().deliver();
    }
}
