package Sixth.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        ModernFurnitureFactory factory = new ModernFurnitureFactory();
        Chair chair = factory.createChair();
        VictorianFurnitureFactory factory1 = new VictorianFurnitureFactory();
        CoffeeTable table = factory1.createCoffeeTable();
        Sofa sofa = factory.createSofa();
        chair.sit();
        table.sit();
        sofa.sit();
    }
}
