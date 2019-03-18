package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry> entries;

    public Table() {
        this.entries = new ArrayList();
    }

    public V get(K foo) {
        for (Entry e: this.entries) {
            if(e.getKey().equals(foo)){
                return (V) e.getValue();
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
            if(e.getKey().equals(foo)){
                entries.remove(e);
                break;
            }
        }
    }
}
