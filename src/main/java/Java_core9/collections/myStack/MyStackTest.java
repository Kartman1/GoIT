package Java_core9.collections.myStack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        myStack.push("Apple");
        myStack.push("Orange");
        myStack.push("Lemon");
        myStack.push("cup");
        myStack.push("table");

//        System.out.println("myStack.size() = " + myStack.size());
//        System.out.println("myStack.peak() = " + myStack.peak());

//        myStack.clear();
//        System.out.println("myStack.peak() = " + myStack.peak());
//        System.out.println("myStack.size() = " + myStack.size());

        myStack.remove(3);


        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.pop() = " + myStack.pop());
        System.out.println("myStack.size() = " + myStack.size());
    }
}
