package Eighth.iterator;

public class Main {
    public static void main(String[] args) {
        Collection collection = new Collection();
        Collection collection1 = new Collection();
        Iterator it1 = collection.createIterator(1);
        Iterator it2 = collection1.createIterator(2);
        for(int a = 0; a<20; a++){
            collection.addToList(a);
            collection1.addToList(a);
        }
        while(it1.hasNext()){
            System.out.println(it1.getNext());
        }
        while (it2.hasNext()){
            System.out.println(it2.getNext());
        }
    }
}
