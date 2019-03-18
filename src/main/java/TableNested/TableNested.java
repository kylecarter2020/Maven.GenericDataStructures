package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Entry> entries;

    private class Entry {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public TableNested(){
        entries = new ArrayList<>();
    }

    public V get(K foo) {
        for (Entry e: this.entries) {
            if(e.key.equals(foo)){
                return (V) e.value;
            }
        }
        return null;
    }

    public void put(K foo, V i) {
        if(get(foo) == null){
            entries.add(new Entry(foo, i));
        }
        else {
            remove(foo);
            entries.add(new Entry(foo, i));
        }
    }

    public void remove(K foo) {
        for (Entry e: this.entries) {
            if(e.key.equals(foo)){
                entries.remove(e);
                break;
            }
        }
    }
}
