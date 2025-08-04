package Java_core9.collections.myStack;

public class MyStack<T> {
    private Node<T> top;
    private int size = 0;

//--------------------- push ---------------------------
    public void push(T value){
        Node<T> newNode = new Node<>(value);
        newNode.setNext(top);
        top = newNode;
        size++;
    }
//------------------------------------------------------


//--------------------- remove -------------------------
    public void remove(int index){
        if (index <0 || index > size){
            throw new IndexOutOfBoundsException();
        }

        int target = size - 1 - index;

        if (index == 0){
            top = top.getNext();
        }else {
            Node<T> current = top;
            for (int i = 0; i < target - 1; i++){
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
        }
        size--;
    }
//------------------------------------------------------


//--------------------- clear --------------------------
    public void clear(){
        size = 0;
        top = null;
    }
//------------------------------------------------------


//--------------------- size ---------------------------
    public int size(){
        return size;
    }
//------------------------------------------------------


//--------------------- peak ---------------------------
    public T peak(){
        if (top == null){
            return null;
        }
        return top.getValue();
    }
//------------------------------------------------------


//--------------------- pop ----------------------------
    public T pop(){
        if (top == null){
            return null;
        }
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }
//------------------------------------------------------
}
