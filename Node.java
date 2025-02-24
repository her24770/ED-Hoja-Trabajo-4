/**
 * Representación de punteros del stack
 */

public class Node<T> {

    private T value; 
    private Node<T> next; 
    private Node<T> previous; 

    /**
     * Constructor de la clase Node
     * @param value Valor del nodo
     */
    public Node(T value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    
    public T getValue() {
        return value;
    }
    
    /**
     * Setter del valor del nodo
     * @param value Valor del nodo
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Getter del siguiente nodo
     * @return Siguiente nodo
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Setter del siguiente nodo
     * @param next Siguiente nodo
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     * Getter del nodo anterior
     * @return Nodo anterior
     */
    public Node<T> getPrevious() {
        return previous;
    }

    /**
     * Setter del nodo anterior
     * @param previous Nodo anterior
     */
    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }
}