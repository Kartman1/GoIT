package Java_core9.collections.myArrayList;

import java.util.Arrays;
import java.util.StringJoiner;

public class MyArrayList<T> {
    private static final int INIT_SIZE = 8;

    private Object[] data;
    private int index;

    public MyArrayList(){
        data = new Object[INIT_SIZE];
    }


    private void resizeIfNeed() {
        if(index == data.length){
            int newSize = data.length * 2;
            Object[] newData = new Object[newSize];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
            //TODO resize
        }
    }
    //------- add(Object value)  -----------------------
    public void add(T value){
        resizeIfNeed();
        data[index] = value;
        index++;
    }
//--------------------------------------------------

    //------- get(int index) ---------------------------
    public T get(int i){
        //TODO А что если i < 0 или i > data.length?
        return (T) data[i];
    }
//--------------------------------------------------

    //------- clear() ----------------------------------
    public void clear(){
        Arrays.fill(data, 0);
        index = 0;
    }
//--------------------------------------------------

    //------- remove(int index) ------------------------
    public void remove(int indexi){
        for(int i = indexi; i < data.length - 1; i++){
            data[i] = data[i+1];
        }
        index--;
    }
//--------------------------------------------------

    public int size(){
        return index;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < index; i++){
            result.add(data[i].toString());
        }
        return "[" + result + "]";
    }
}