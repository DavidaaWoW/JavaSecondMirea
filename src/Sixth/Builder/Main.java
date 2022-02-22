package Sixth.Builder;

public class Main {
    public static void main(String[] args) {
        Builder builder1 = new FirstHouseBuilder();
        Builder builder2 = new SecondHouseBuilder();
        Director director1 = new Director(builder1);
        Director director2 = new Director(builder2);
        director1.printResult();
        director2.printResult();
    }

}
