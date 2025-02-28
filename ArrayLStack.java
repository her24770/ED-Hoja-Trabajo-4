import java.util.ArrayList;

public class ArrayLStack <T> implements IStack<T>{

    protected ArrayList<T> data;

    public ArrayLStack(){
        data = new ArrayList<T>();
    }

    public void push(T value){
        data.add(value);
    }

    public T pop(){
        return data.removeLast();
    }

    public int size(){
        return data.size();
    }
}
