package Java_core9.collections.myLinkedList;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedListTests {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        System.out.println("list.size() = " + list.size());
        list.add("Diana");
//        System.out.println("list = " + list.toString());
        System.out.println("list.size() = " + list.size());
        list.add("dasha");
        System.out.println("list.size() = " + list.size());

        System.out.println("list.get(0) = " + list.get(0));
        System.out.println("list.get(1) = " + list.get(1));
//        System.out.println("list.get(2) = " + list.get(2));

        List<String> list1 = new LinkedList<>();
        list1.add("Dima");
        list1.add("Dasha");
        list1.add("Sasha");

        System.out.println("list1 = " + list1);
        System.out.println("list1.size() = " + list1.size());
        //        list1.remove(4);
        System.out.println("list1 = " + list1);
        System.out.println("list1.size() = " + list1.size());
    }
}
