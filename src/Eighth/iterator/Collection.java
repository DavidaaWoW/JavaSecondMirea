package Eighth.iterator;

import java.util.ArrayList;

public class Collection implements IterableCollection{
    private ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }

    public void addToList(int number){
        list.add(number);
    }

    @Override
    public Iterator createIterator(int code) {
        switch (code){
            case 1:
                return new Iterator1(list);
            case 2:
                return new Iterator2(list);
            default:
                return null;
        }
    }
}
