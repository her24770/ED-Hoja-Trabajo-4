/**  
 * Esta clase implementa la interfaz IList y contiene los metodos add, remove, peek 
 * para una lista doblemente enlazada.
 * @author: https://www.geeksforgeeks.org/introduction-to-doubly-linked-lists-in-java/
 * Se hicieron modificaciones para le uso de genericos.
 * Solo se utilizaron 5 metodos de la pagina de referencia.
 */

public class DLList<T> implements IStack<T>{

    private Node<T> head;
    private Node<T> tail;
    private int count;

    /**
     * Metodo para agregar un elemento a la lista doblemente enlazada
     * por la derecha.
     * @param item elemento a agregar
     */
    
     public void push(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {  // Si la lista está vacía
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
        }
        count++;
    }
    

    public T pop() {
        if (head == null) {  // Si la lista está vacía
            return null;  // Devuelve null si no hay elementos
        }
        T value = head.getValue();  // Guarda el valor del nodo en la cabeza
        if (head == tail) {  // Si solo hay un elemento en la lista
            head = null;
            tail = null;
        } else {
            head = head.getNext();  // Mueve la cabeza al siguiente nodo
            if (head != null) {
                head.setPrevious(null);  // Elimina la referencia al nodo anterior
            }
        }
        count--;
        return value;  // Devuelve el valor eliminado
    }
    
}