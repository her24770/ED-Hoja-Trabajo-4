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
		return data.remove(data.size()-1);
	}

	public boolean isEmpty(){
		return data.isEmpty();
	}
	
	public T peek(){
		return data.get(data.size()-1);
	}
	
}
