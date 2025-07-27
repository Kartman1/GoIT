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
        list.add("Dasha");
        System.out.println("list.size() = " + list.size());
        list.add("Yana");
        list.add("Ivan");

//        System.out.println("list.get(0) = " + list.get(0));
//        System.out.println("list.get(1) = " + list.get(1));
////        System.out.println("list.get(2) = " + list.get(2));
//
//        System.out.println("list.get(2) = " + list.get(2));
//        System.out.println("list.get(3) = " + list.get(3));

        for (int i = 0; i < list.size(); i++){
            System.out.println("list = " + list.get(i));
        }

        list.remove(2);


        for (int i = 0; i < list.size(); i++){
            System.out.println("list = " + list.get(i));
        }

        list.clear();

        System.out.println("list.size() = " + list.size());

        list.add("Pavlo");
        list.add("Denis");
        list.add("Masha");

        System.out.println("list.size() = " + list.size());

        for (int i = 0; i < list.size(); i++){
            System.out.println("list = " + list.get(i));
        }




    }
}
