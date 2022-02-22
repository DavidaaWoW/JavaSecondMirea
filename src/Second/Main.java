package Second;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        for(int a = 0; a<10; a++){
            app.addRandomHuman();
        }
        app.outList();
        System.out.println("Sorted by weight:");
        Stream<Human> stream = app.getHumans().stream();
        stream.sorted(Comparator.comparingInt(Human::getWeight)).forEach(System.out::println);
        System.out.println("Filtered by NOT Ivanov:");
        Stream<Human> stream2 = app.getHumans().stream();
        stream2.filter(human -> !human.getLastName().contains("Ivanov")).forEach(System.out::println);
        Stream<Human> stream3 = app.getHumans().stream();
        System.out.println("Sorted by age:");
        stream3.sorted(Comparator.comparingInt(Human::getAge)).forEach(System.out::println);
        Stream<Human> stream4 = app.getHumans().stream();
        System.out.println("Product of numbers:");
        int product = stream4.mapToInt(Human::getAge).reduce(1, (a, b) -> a * b);
        System.out.println(product);

        Stream<Human> stream5 = app.getHumans().stream();
        stream5.flatMap((input) -> Arrays.asList(input.getFirstName() + " ").stream()).forEach(System.out::print);
    }
}
