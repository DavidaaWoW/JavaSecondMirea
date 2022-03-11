package Eighth.mediator;

public class ConcreteMediator implements Mediator{
    @Override
    public void notify(Components components) {
        System.out.println("User pressed " + components.getName());
    }
}
