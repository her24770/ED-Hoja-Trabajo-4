/*
 * Interface para la clase Stack, que contiene los metodos push, pop y operation
 */
public interface IList<T> {
    void add(T item);       
    T remove(int index);    
    T peek(int index);
}