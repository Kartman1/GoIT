package Java_core9.collections.hashMap;

public class MyHashMap {

    private static final int INITIAL_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;

    private Node[] buckets;
    private int size;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        buckets = new Node[INITIAL_CAPACITY];
        size = 0;
    }

//------------------ put ---------------------------
public void put(Object key, Object value) {
    int index = getIndex(key);

    Node current = buckets[index];
    while (current != null) {
        if (current.getKey().equals(key)) {
            current.setValue(value); // Обновляем значение
            return;
        }
        current = current.next;
    }

    Node newNode = new Node(key, value);
    newNode.next = buckets[index];
    buckets[index] = newNode;
    size++;

    if ((float) size / buckets.length >= LOAD_FACTOR) {
        resize();
    }
}
//--------------------------------------------------


//------------------ remove ------------------------
public boolean remove(Object key) {
    int index = getIndex(key);
    Node current = buckets[index];
    Node prev = null;

    while (current != null) {
        if (current.getKey().equals(key)) {
            if (prev == null) {
                buckets[index] = current.next;
            } else {
                prev.next = current.next;
            }
            size--;
            return true;
        }
        prev = current;
        current = current.next;
    }
    return false;
}
//--------------------------------------------------


//------------------ clear -------------------------
    public void clear() {
        buckets = new Node[INITIAL_CAPACITY];
        size = 0;
    }
//--------------------------------------------------


//------------------ size --------------------------
    public int size() {
        return size;
    }
//--------------------------------------------------


//------------------ get ---------------------------
    public Object get(Object key) {
        int index = getIndex(key);
        Node current = buckets[index];
        while (current != null) {
            if (current.getKey().equals(key)) {
                return current.getValue();
            }
            current = current.next;
        }
        return null;
    }
//--------------------------------------------------

    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = buckets.length * 2;
        Node[] newBuckets = new Node[newCapacity];

        for (Node oldNode : buckets) {
            while (oldNode != null) {
                Node next = oldNode.next;

                int newIndex = Math.abs(oldNode.getKey().hashCode()) % newCapacity;

                oldNode.next = newBuckets[newIndex];
                newBuckets[newIndex] = oldNode;

                oldNode = next;
            }
        }

        buckets = newBuckets;
    }

    private int getIndex(Object key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

}
