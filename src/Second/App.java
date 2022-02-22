package Second;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class App {
    ArrayList <Human> humans = new ArrayList<>();
    void addRandomHuman(){
        int randAge = (int)((Math.random() * ((100 - 1) + 1)) + 1);
        Random random = new Random();
        boolean flag = random.nextBoolean();
        String surname;
        if(flag){
            surname = "Ivanov";
        }
        else {
            surname = "SomeSurname";
        }
        LocalDate randDate = LocalDate.of(2022-randAge,(int)(Math.random() * ((12 - 1) + 1)) + 1, (int)(Math.random() * ((28 - 1) + 1)) + 1);
        Human human = new Human(randAge, "SomeName" + (int)(Math.random() * ((100 - 1) + 1)) + 1, surname + (int)(Math.random() * ((100 - 1) + 1)) + 1, randDate, (int)(Math.random() * ((100 - 1) + 1)) + 1);
        humans.add(human);
    }
    void outList(){
        for (Human human:humans
             ) {
            System.out.println(human.toString());
        }
    }

    public ArrayList<Human> getHumans() {
        return humans;
    }
}
