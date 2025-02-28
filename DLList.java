/**  
 * Esta clase implementa la interfaz IList y contiene los metodos add, remove, peek 
 * para una lista doblemente enlazada.
 * @author: https://www.geeksforgeeks.org/introduction-to-doubly-linked-lists-in-java/
 * Se hicieron modificaciones para le uso de genericos.
 * Solo se utilizaron 5 metodos de la pagina de referencia.
 */

public class DLList<T> implements IList<T>,IStack<T> {

    private Node<T> head;
    private Node<T> tail;
    private int lenght;

    /**
     * Metodo para agregar un elemento a la lista doblemente enlazada
     * por la derecha.
     * @param item elemento a agregar
     */
    
    public void add(T item) {
        Node<T> newNode = new Node<T>(item);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }
        lenght++;
    }

    /**
     * Metodo para eliminar un elemento de la lista doblemente enlazada
     * por la izquierda.
     * @return el valor del elemento eliminado
     */

    public T deleteLeft() {
        if (head == null) {
            return null;
        }
        T value = head.getValue();
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node<T> newNode = head;
            head = head.getNext();
            head.setPrevious(null);
            newNode.setNext(null);
        }
        return value;
    }

    /**
     * Metodo para eliminar un elemento de la lista doblemente enlazada
     * por la derecha.
     * @return el valor del elemento eliminado
     */

    public T deleteRight() {
        if (tail == null) {
            return null;
        }
        T value = tail.getValue();
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node<T> newNode = tail;
            tail = tail.getPrevious();
            tail.setNext(null);
            newNode.setPrevious(null);
        }
        return value;

    }

    /**
     * Metodo para eliminar un elemento de la lista doblemente enlazada
     * por el indice.
     * @param index indice del elemento a eliminar
     * @return el valor del elemento eliminado
     */

    public T remove(int index) {
        if (index == 0) {
            return deleteLeft();
        } else {
            Node<T> current = head;
            int currentIndex = 0;
            while (current != null && currentIndex < index) {
                current = current.getNext();
                currentIndex++;
            }
            if (current == null) {
                return deleteRight();
            } else {
                T value = current.getValue();
                current.getPrevious().setNext(current.getNext());
                current.getNext().setPrevious(current.getPrevious());
                current.setNext(null);
                current.setPrevious(null);
                return value;
            }
        }
    }

    public void push(T value){
        add(value);
    }

    public T pop(){
        return deleteRight();
    }
}