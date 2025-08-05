package Java_core9.collections.hashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put("apple", 12);
        map.put("juice", 5);
        map.put("orange", 8);

        System.out.println("map.get(\"apple\") = " + map.get("apple"));
        System.out.println("map.size() = " + map.size());

        map.remove("apple");

        System.out.println("map.size() = " + map.size());

        System.out.println("map.get(\"apple\") = " + map.get("apple"));

        map.clear();
        System.out.println("map.size() = " + map.size());
    }
}
