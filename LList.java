public class LList<T> implements IList<T> {
    protected Node<T> head;
    protected int count;
    
    public LList(){
        head = null;
        count = 0;
    }
    
    public void add(T value){
        head = new Node<T>(value, head);
        count++;
    }
    
    public T remove(int index){
        if(index < 0 || index >= count){
            return null;
        }
        Node<T> finger = head;
        if(index == 0){
            head = head.getNext();
        }else{
            Node<T> previous = null;
            for(int i = 0; i < index; i++){
                previous = finger;
                finger = finger.getNext();
            }
            previous.setNext(finger.getNext());
        }
        count--;
        return finger.getValue();
    }

} 