import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class VecStackTest {

    private VecStack<Integer> stack;

    @Before 
    public void setUp() {
        stack = new VecStack<>();
    }

    @Test
    public void shouldBeAbleToPush(){
        stack.push(1);
        assertEquals(stack.isEmpty(), false);
    }

    @Test 
    public void shouldBeAbleToPop(){
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(stack.pop(), Integer.valueOf(3));
    }

    @Test
    public void shouldBeAbleToPeek(){
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(stack.pop(), Integer.valueOf(3));
    }
}
