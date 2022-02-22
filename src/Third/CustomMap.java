package Third;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomMap implements Map{
    Map map;
    public CustomMap(){
        map = new HashMap();
    }
    private static final Lock lock = new ReentrantLock();
    @Override
    public int size() {
        lock.lock();
        int k = map.size();
        lock.unlock();
        return k;
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        boolean k = map.isEmpty();
        lock.unlock();
        return k;
    }

    @Override
    public boolean containsKey(Object key) {
        lock.lock();
        boolean k = map.containsKey(key);
        lock.unlock();
        return k;
    }

    @Override
    public boolean containsValue(Object value) {
        lock.lock();
        boolean k = map.containsValue(value);
        lock.unlock();
        return k;
    }

    @Override
    public Object get(Object key) {
        lock.lock();
        Object k = map.get(key);
        lock.unlock();
        return k;
    }

    @Override
    public Object put(Object key, Object value) {
        lock.lock();
        Object k = map.put(key, value);
        lock.unlock();
        return k;
    }

    @Override
    public Object remove(Object key) {
        lock.lock();
        Object k = map.remove(key);
        lock.unlock();
        return k;
    }

    @Override
    public void putAll(Map m) {
        lock.lock();
        map.putAll(m);
        lock.unlock();
    }

    @Override
    public void clear() {
        lock.lock();
        map.clear();
        lock.unlock();
    }

    @Override
    public Set keySet() {
        lock.lock();
        Set k = map.keySet();
        lock.unlock();
        return k;
    }

    @Override
    public Collection values() {
        lock.lock();
        Collection k = map.values();
        lock.unlock();
        return k;
    }

    @Override
    public Set<Entry> entrySet() {
        lock.lock();
        Set <Entry> k = map.entrySet();
        lock.unlock();
        return k;
    }
}
