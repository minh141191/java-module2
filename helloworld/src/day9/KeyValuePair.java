package day9;

public class KeyValuePair<K, V> {
    private K kay;
    private V value;

    public KeyValuePair(K kay, V value) {
        this.kay = kay;
        this.value = value;
    }

    public K getKay() {
        return kay;
    }

    public void setKay(K kay) {
        this.kay = kay;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
