package Java_core9.collections.myLinkedList;

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

//-------------- add -------------------------
    public void add(T item){
        Node<T> node = new Node<>();
        node.setValue(item);
        if (head == null){
            head = node;
        }else {
                Node<T> last = head;
                while (last.getNext() != null){
                last = last.getNext();
            }

            last.setNext(node);
            node.setPrevious(last);
        }
    }
//--------------------------------------------

//-------------- size ------------------------
    public int size(){
        if (head == null){
            return 0;
        }

        int count = 1;
        Node<T> last = head;
        while (last.getNext() != null){
            last = last.getNext();
            count++;
        }
        return count;
    }
//--------------------------------------------

//-------------- get -------------------------
    public T get(int index){
        if(head == null){
            throw new IndexOutOfBoundsException("List is empty");
        }

        Node<T> search = head;
        for (int i = 0; i < index; i++) {
            search = search.getNext();
        }

        if (search == null){
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size());
        }

        return search.getValue();
    }
//--------------------------------------------

//-------------- remove ----------------------
    public void remove(int index){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Invalid index: " + index + ", Size: " + size());
        }

        if(index == 0){
            head = head.getNext();
            if (head != null){
                head.setPrevious(null);
            }
        } else{
            Node<T> current = head;
            for (int i = 0; i < index; i++){
                current = current.getNext();
            }

            Node<T> prev = current.getPrevious();
            Node<T> next = current.getNext();

            if (prev != null) prev.setNext(next);
            if (next != null) next.setPrevious(prev);
            if (current == tail){
                tail = prev;
            }
        }




    }
//--------------------------------------------

//-------------- clear -----------------------
    public void clear(){
        Node<T> current = head;
        while (current != null){
            Node<T> next = current.getNext();

            current.setValue(null);
            current.setNext(null);
            current.setPrevious(null);

            current = next;
        }

        head = null;
        tail = null;
    }
//--------------------------------------------

}
