package Seventh.Composite;

public class Main {
    public static void main(String[] args) {
        Component main = new Component();
        Component box1 = new Component();
        Component box2 = new Component();
        Component box3 = new Component();
        Component box4 = new Component();
        Component box5 = new Component();
        Leaf leaf1 = new Leaf(1.2);
        Leaf leaf2 = new Leaf(2.3);
        Leaf leaf3 = new Leaf(3.4);
        Leaf leaf4 = new Leaf(4.5);
        Leaf leaf5 = new Leaf(5.6);
        Leaf leaf6 = new Leaf(6.7);
        Leaf leaf7 = new Leaf(7.8);
        Leaf leaf8 = new Leaf(8.9);
        Leaf leaf9 = new Leaf(9.1);
        Leaf leaf10 = new Leaf(10.2);
        Leaf leaf11 = new Leaf(11.3);
        Leaf leaf12 = new Leaf(12.4);
        Leaf leaf13 = new Leaf(13.5);
        Leaf leaf14 = new Leaf(14.6);
        Leaf leaf15 = new Leaf(15.7);
        box1.addToList(leaf1);
        box1.addToList(leaf2);
        box1.addToList(leaf3);
        box2.addToList(leaf4);
        box2.addToList(leaf5);
        box2.addToList(leaf6);
        box3.addToList(leaf7);
        box3.addToList(leaf8);
        box3.addToList(leaf9);
        box4.addToList(leaf10);
        box4.addToList(leaf11);
        box4.addToList(leaf12);
        box5.addToList(leaf13);
        box5.addToList(leaf14);
        box5.addToList(leaf15);
        box1.addToList(box2);
        box1.addToList(box3);
        box2.addToList(box4);
        box3.addToList(box5);
        main.addToList(box1);
        System.out.println(main.execute());
    }
}
