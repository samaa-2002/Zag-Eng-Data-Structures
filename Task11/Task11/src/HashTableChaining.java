import java.util.LinkedList;
import java.util.NoSuchElementException;
 public class HashTableChaining<K,V> {
        private class Entry {
            private K key;
            private V value;

            public Entry(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private LinkedList<Entry>[] table;
        int count =0;

        public HashTableChaining(int value) {
            table = new LinkedList[value];
        }

        private int hash(K key) {
            return key.hashCode() % table.length;
        }

        public void put(K key, V value) {
            Entry entry = new Entry(key, value);
            int index = hash(key);
            if (table[index] == null) {
                table[index] = new LinkedList<>();
            }
            for (Entry e : table[index]) {
                if (e.key == key) {
                    e.value = value;
                    return;
                }
            }
            table[index].add(entry);
            count++;

        }
        public V get (K key){
            int index= hash(key);
            if (table[index]==null){
                return null;
            }
            else{
                for(Entry e :table[index]){
                    if(e.key==key){
                        return e.value;
                    }
                }
            }
            return null;
        }
        public void remove (K key){
            int index= hash(key);
            if (table[index]==null){
                throw new NoSuchElementException("this key not found");
            }
            else{
                for(Entry e :table[index]){
                    if(e.key==key){
                        table[index].remove(e);
                        count--;
                        return;
                    }
                }
            }
            throw new NoSuchElementException("this key not found");
        }

        public int size(){
            return count;
        }
    }






