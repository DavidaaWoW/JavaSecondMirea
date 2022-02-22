package Third;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Set set = new HashSet();
        CustomSet set2 = new CustomSet();
        Map map = new HashMap();
        CustomMap map2 = new CustomMap();
        Thread one = new Thread(()->{
            for(int a = 0; a<100; a++){
                set.add((Math.random() * ((1000 - 2) + 1)) + 2);
                set2.add((Math.random() * ((1000 - 2) + 1)) + 2);
                map.put(a, (Math.random() * ((1000 - 2) + 1)) + 2);
                map2.put(a, (Math.random() * ((1000 - 2) + 1)) + 2);

            }
        });
        Thread two = new Thread(()->{
            for(int a = 0; a<100; a++){
                set.add((Math.random() * ((1000 - 2) + 1)) + 2);
                set2.add((Math.random() * ((1000 - 2) + 1)) + 2);
                map.put(a, (Math.random() * ((1000 - 2) + 1)) + 2);
                map2.put(a, (Math.random() * ((1000 - 2) + 1)) + 2);
            }
        });
        one.start();
        two.start();
        Thread.sleep(3000);
        System.out.println(set.size());
        System.out.println(set2.size());
        System.out.println(map.size());
        System.out.println(map2.size());
    }
}
