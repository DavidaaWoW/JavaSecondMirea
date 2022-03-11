package Eighth.iterator;

import java.util.ArrayList;

public class Iterator1 implements Iterator{
    private ArrayList<Integer> list;
    private int currentPos = 0;

    public Iterator1(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(list.size()>currentPos){
            return true;
        }
        return false;
    }

    @Override
    public int getNext() {
        int result = list.get(currentPos);
        currentPos++;
        return result;
    }
}
