import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class ArrayLStackTest {
    private ArrayLStack<Integer> stack; 

    @Before 
    public void setUp() {
        stack = new ArrayLStack<>();
    }

    @Test
    public void shouldBeAbleToPush(){
    stack.push(15);
    stack.push(10);

    assertEquals(stack.size(), 2);
    }

    @Test 
    public void shouldBeAbleToPop(){
        stack.push(15);
        stack.push(10);

        assertEquals(stack.pop(), Integer.valueOf(10));
    }

    @Test 
    public void shouldReturnNull(){
        assertEquals(null, stack.pop());
    }

}
