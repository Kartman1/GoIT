package Java_core9.collections.hashMap;

public class Node {
    private final Object key;
    private Object value;
    Node next;

    public Node(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
