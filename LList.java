public class LList<T> implements IStack<T> {
    protected Node<T> head;
    protected int count;
    
    public LList(){
        head = null;
        count = 0;
    }
    
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