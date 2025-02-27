import java.util.Vector;

public class VecStack<T> implements IStack<T> {
   protected Vector<T> data;

	public VecStack(){
		data = new Vector<T>();
	}

	public void push(T item){
		data.add(item);
	}

	public T pop(){
		return data.remove(size()-1);
	}

    public int size(){
        return data.size();
    }
}
