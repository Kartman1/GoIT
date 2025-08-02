package Java_core9.collections.myQueueList;

public class MuQueueTest {
    public static void main(String[] args) {
        MyQueueList<String> myque = new MyQueueList<>();

        myque.add("Apple");
        System.out.println("myque.size() = " + myque.size());

        myque.add("Orange");
        myque.add("Lemon");

        System.out.println("myque.size() = " + myque.size());

        System.out.println("myque.peek() = " + myque.peek());
        System.out.println("myque.peek() = " + myque.peek());

        myque.clear();
        System.out.println("myque.peek() = " + myque.peek());

        myque.add("Orange");
        myque.add("Lemon");

        System.out.println("myque.peek() = " + myque.peek());

//        System.out.println("myque.poll() = " + myque.poll());
//        System.out.println("myque.poll() = " + myque.poll());
//        System.out.println("myque.poll() = " + myque.poll());
//        System.out.println("myque.poll() = " + myque.poll());

    }
}
