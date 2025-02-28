import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLStackTest {
    private ArrayLStack<Integer> stack; 

    @Before 
    public void setUp() {
        stack = new ArrayLStack<>();
    }

    @Test
    public void shoulBeAbleToPush(){
    stack.push(15);
    stack.push(10);

    assertEquals(stack.size(), 2);
    }

    @Test 
    public void shouldBeAbleToPop(){
        stack.push(15);
        stack.push(10);

        assertEquals(stack.pop(), 0);
    }
}
