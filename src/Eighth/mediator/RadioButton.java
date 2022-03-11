package Eighth.mediator;

public class RadioButton implements Components {
    public Mediator mediator;

    String name;

    public RadioButton(String name) {
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
