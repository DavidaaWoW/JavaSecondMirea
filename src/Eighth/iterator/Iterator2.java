package Eighth.iterator;

import java.util.ArrayList;

public class Iterator2 implements Iterator{
    private ArrayList<Integer> list;
    private int currentPos = 0;

    public Iterator2(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(list.size()>currentPos+1){
            return true;
        }
        return false;
    }

    @Override
    public int getNext() {
        int result = list.get(currentPos);
        currentPos+=2;
        return result;
    }
}
