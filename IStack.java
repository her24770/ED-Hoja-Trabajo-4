/*
 * Interface para la clase ArrayStack y VecStack, que contiene los metodos push, pop y operation
 */
public interface IStack<T> {
    void push(T value);
    T pop();
    T operation(char operator, T value1, T value2);
}