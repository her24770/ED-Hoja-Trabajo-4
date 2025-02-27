/**
 * Representación de punteros del stack
 */

public class Node<T> {

    protected T value; 
    protected Node<T> nodeNext; 
    protected Node<T> nodePrevious; 
 
    //constructor para LinkedList
    public Node(T v, Node<T> next){
        value = v;
        nodeNext = next;
    }

    //constructor para DoublyLinkedList
    public Node(T v, Node<T> next, Node<T> previous){
        value = v;
        nodeNext = next;
        nodePrevious = previous;
    }
 
    public Node(T v){
       this(v,null);
    }
 
    public Node<T> getNext(){
       return nodeNext;
    }
 
    public void setPrevious(Node<T> next){
        nodeNext = next;
    }

    public Node<T> getPrevious(){
        return nodeNext;
     }
  
     public void setNext(Node<T> next){
         nodeNext = next;
     }
 
    public T getValue(){
       return value;
    }
 
    public void setValue(T v){
       value = v;
    }
}