package Java_core9;

public class MyArrayListTests {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();


        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get() = " + list.get(5));
        list.clear();
        System.out.println("list = " + list);
        System.out.println("list.size() = " + list.size());
        list.add("Dima");
        list.add("Dasha");
        list.add("Diana");
        list.add("Ivan");
        list.add("Igor");
        list.remove(2);
        System.out.println("list.size() = " + list.size());
        System.out.println("list = " + list);
    }
}
