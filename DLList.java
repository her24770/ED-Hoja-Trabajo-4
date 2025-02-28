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
        newNode.setNext(head); 
        head = newNode;        
        count++;               
    }

    public T pop() {
        if (head == null) { 
            return null;
        }
        T value = head.getValue();  
        head = head.getNext();     
        count--;                    
        return value;          
    }
    
}