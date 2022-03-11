package Eighth.mediator;

public class Main {
    public static void main(String[] args) {
        Components button1 = new Button("Button1");
        Components button2 = new Button("Button2");
        Components checkbox1 = new Checkbox("Checkbox1");
        Components radioButton1 = new RadioButton("Radiobutton1");
        Components checkbox2 = new Checkbox("Checkbox2");
        button1.onPress();
        button2.onPress();
        checkbox1.onPress();
        checkbox2.onPress();
        radioButton1.onPress();

    }
}
