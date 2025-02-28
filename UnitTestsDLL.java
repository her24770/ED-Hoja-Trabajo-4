import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class UnitTestsDLL {

    private DLList<Integer> list;

    
    @Before 
    public void setUp() {
        list = new DLList<>();
    }

    @Test 
    public void shouldBeAbleToPop(){
        list.push(15);
        list.push(10);

        assertEquals(list.pop(), Integer.valueOf(10));
    }

    @Test 
    public void shouldReturnNull(){
        assertEquals(null, list.pop());
    }
}
