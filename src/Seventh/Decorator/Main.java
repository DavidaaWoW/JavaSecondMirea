package Seventh.Decorator;
public class Main {
    public static void main(String[] args) {
        SimpleCar car = new SimpleCar();
        System.out.println(car.getBaggageWeight() + " " + car.getSpeed());
        Car sportCar = new SportCar(car);
        System.out.println(sportCar.getBaggageWeight() + " " + sportCar.getSpeed());
        Car truck = new Truck(car);
        System.out.println(truck.getBaggageWeight() + " " + truck.getSpeed());
    }
}
