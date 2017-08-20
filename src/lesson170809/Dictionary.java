package lesson170809;

import lesson170809.Dictionary.Pair;

import java.util.*;

public class Dictionary<K, V> implements Iterable<Pair<K, V>> {

    static class Pair<K,V> implements Map.Entry<K,V> {
        final K key;
        V value;

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public String toString() {
            return key.toString() + " = " + value.toString();
        }

        /*
         * (e.getKey()==null   ? 0 : e.getKey().hashCode()) ^ (e.getValue()==null ? 0 : e.getValue().hashCode())
         */
        public int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }

        public V setValue(V newValue) {
            V tmp = value;
            value = newValue;
            return tmp;
        }

        public final boolean equals(Object o) {
            if (o == this)
                return true;
            if (o instanceof Map.Entry) {
                Map.Entry<?,?> toCompare = (Map.Entry<?,?>)o;
                if (Objects.equals(key, toCompare.getKey()) && Objects.equals(value, toCompare.getValue())) {
                    return true;
                }
            }
            return false;
        }

    }

    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private static final int DEFAULT_SIZE = 4;
    private float loadFactor = DEFAULT_LOAD_FACTOR;
    private int size = 0;
    private int listCount = 0;
    List<Pair>[] data = new List[DEFAULT_SIZE];

    public Dictionary(float lf) {
        this.loadFactor = lf;
    }

    public Dictionary() {
        this.loadFactor = DEFAULT_LOAD_FACTOR;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void put(K key, V value) {
        int index = hash(key);

        if (data[index] == null) {
            data[index] = new ArrayList<>();
            listCount++;
        }

        Pair pair = getPair(index, key);

        if (pair == null) {
            data[index].add(new Pair(key, value));
            size++;
        } else {
            pair.value = value;
        }

        if (data[index].size() > data.length * loadFactor) {
            resize();
        }
    }

    private void resize() {
        List<Pair>[] dataCopy = data;
        this.data = new List[dataCopy.length * 3 / 2];
        this.listCount = 0;
        this.size = 0;

        for (int i = 0; i < dataCopy.length; i++) {
            if (dataCopy[i] != null) {
                for (int j = 0; j < dataCopy[i].size(); j++) {
                    Pair<K, V> pair = dataCopy[i].get(j);
                    this.put(pair.getKey(), pair.getValue());
                    size++;
                }
            }
        }
    }

    public V remove(K key) {
        int hash = hash(key);
        List<Pair> list = data[hash];

        if (list == null) { // guard condition
            return null;
        }

        for (Pair pair : list) {
            if (pair.key.equals(key)) {
                list.remove(pair);
                size--;
                return (V) pair.value;
            }
        }

        return null;
    }

    private int hash(K key) {
        return key.hashCode() & 0x7FFFFFFF % data.length;
    }

    public V get(K key) {
        Pair pair = getPair(hash(key), key); // Calculating hash anyway, why not to pass it to getPair method?
        return pair == null ? null : (V) pair.getValue();
    }

    private Pair getPair(int index, K key) {
        List<Pair> list = data[index];

        if (list == null) { // guard condition
            return null;
        }

        for (Pair pair : list) {
            if (pair.key.equals(key)) {
                return pair;
            }
        }

        return null;
    }

    @Override
    public Iterator<Pair<K, V>> iterator() {
        return new Iterator<Dictionary.Pair<K, V>>() {
            int currentElement = -1;
            Iterator<Pair> listIterator = null;

            @Override
            public boolean hasNext() {

                if (listIterator != null && listIterator.hasNext()) {
                    return true;
                }

                listIterator = null;

                for (++currentElement; listIterator == null
                        && currentElement < data.length; currentElement++) {
                    List<Pair> list = data[currentElement];
                    if (list == null) {
                        continue;
                    }
                    listIterator = list.iterator();
                    if (!listIterator.hasNext()) {
                        continue;
                    }
                    return listIterator.hasNext();
                }

                return false;
            }

            @Override
            public Pair next() {
                if (!hasNext()) {
                    throw new IllegalArgumentException();
                }
                return listIterator.next();
            }
        };
    }
}