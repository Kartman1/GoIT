package Java_core9.collections.myQueueList;

public class MyQueueList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

//----------------------- add --------------------
    public void add(T value){
        Node<T> newNode = new Node<>(value);
        if (tail != null){
            tail.setNext(newNode);
        }
        tail = newNode;
        if (head == null){
            head = newNode;
        }
        this.size++;
    }
//------------------------------------------------



//----------------------- peek -------------------
    public T peek(){
        if (head == null){
            return null;
        }
        return head.getValue();
    }
//------------------------------------------------



//----------------------- poll -------------------
    public T poll(){
        if (head == null){
            return null;
        }
        T value = head.getValue();
        head = head.getNext();
        if (head == null){
            tail = null;
        }
        size--;
        return value;
    }
//------------------------------------------------



//----------------------- size -------------------
    public int size(){
        return this.size;
    }
//------------------------------------------------


//----------------------- clear ------------------
    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }
//------------------------------------------------

}
