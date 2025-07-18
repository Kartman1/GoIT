package Java_core9.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, };

        Collection letter = List.of('a', 'b', 'c', 'd');
        Iterator letterIterator = letter.iterator();
        
        while (letterIterator.hasNext()){
            System.out.println("letterIterator.next() = " + letterIterator.next());
        }
    }
}
