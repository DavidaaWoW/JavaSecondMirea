package Seventh.Composite;

import java.util.ArrayList;

public class Component implements Composite{
    private ArrayList<Composite> componentList;

    public Component() {
        componentList = new ArrayList<>();
    }

    public void addToList(Composite object){
        componentList.add(object);
    }

    @Override
    public double execute() {
        double result = 0;
        for (Composite composite:componentList) {
            result+=composite.execute();
        }
        return result;
    }
}
