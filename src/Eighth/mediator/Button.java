package Eighth.mediator;

public class Button implements Components{
    public Mediator mediator;

    private String name;

    public Button(String name) {
        this.name = name;
        mediator = new ConcreteMediator();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void onPress() {
        mediator.notify(this);
    }
}
