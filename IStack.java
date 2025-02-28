/*
 * Interface para la clase ArrayStack y VecStack, que contiene los metodos push, pop y operation
 */
public interface IStack<T> {
    public void push(T value);
    public T pop(int index);
}