import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class HashTableLinearProbing {
    private class Node {
        int key;
        String value;

        Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] table;
    private int count;

    public HashTableLinearProbing(int size) {
        table = new Node[size];
        count = 0;
    }

    private int hash(int key) {
        return key % table.length;
    }

    public void put(int key, String value) {
        Node node = new Node(key, value);
        int index = hash(key);
        int originalIndex = index;

        while (table[index] != null && table[index].key != key) {
            index = (index + 1) % table.length;
            if (index == originalIndex) {
                throw new IllegalStateException("Hash table is full");
            }
        }

        if (table[index] == null) {
            count++;
        }

        table[index] = node;
    }

    public String get(int key) {
        int index = hash(key);
        int originalIndex = index;

        while (table[index] != null) {
            if (table[index].key == key) {
                return table[index].value;
            }
            index = (index + 1) % table.length;
            if (index == originalIndex) {
                break;
            }
        }

        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        int originalIndex = index;

        while (table[index] != null) {
            if (table[index].key == key) {
                table[index] = null;
                count--;
                return;
            }
            index = (index + 1) % table.length;
            if (index == originalIndex) {
                break;
            }
        }

        throw new NoSuchElementException("Key not found");
    }


    public int size() {
        return count;
    }


}
