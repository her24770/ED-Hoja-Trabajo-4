import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class LListTest {
    private LList<Integer> list;

    @Before 
    public void setUp() {
        list = new LList<>();
    }

    @Test
    public void shouldBeableToPush(){
        list.push(15);

        assertEquals(list.head.getValue(), Integer.valueOf(15));
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
