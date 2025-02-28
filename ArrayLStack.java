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
        if(data.size() != 0){
            return data.removeLast();
        }
        return null;
    }

    public int size(){
        return data.size();
    }
}
