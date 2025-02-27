/*
 * Interface para la clase Stack, que contiene los metodos push, pop y operation
 */
public interface IList<T> {
    public void add(T item);       
    public T remove(int index);    
    public T peek(int index);
}