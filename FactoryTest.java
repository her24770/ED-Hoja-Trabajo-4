import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;

/**
 * Pruebas unitarias de la clase Factory
 */
public class FactoryTest {
    
    //Pruebas unitarias StackFactory
    @Test
    public void shouldBeAbleToReturnVecStackObjectUsingStackFactory(){
        assertEquals(Factory.stackFactory("1").getClass(), VecStack.class);
    }

    @Test
    public void shouldBeAbleToReturnArrayLStackObjectUsingStackFactory(){
        assertEquals(Factory.stackFactory("2").getClass(), ArrayLStack.class);
    }

    @Test
    public void shouldBeAbleToReturnLListObjectUsingStackFactory(){
        assertEquals(Factory.stackFactory("3.1").getClass(), LList.class);
    }

    @Test
    public void shouldBeAbleToReturnDLListObjectUsingStackFactory(){
        assertEquals(Factory.stackFactory("3.2").getClass(), DLList.class);
    }

    @Test
    public void shouldBeAbleToThrowExceptionInStackFactory(){
        assertThrows(IllegalArgumentException.class, () -> Factory.stackFactory("5"));
    }

    //Pruebas unitarias ListStack

    @Test
    public void shouldBeAbleToReturnLListObjectUsingListStack(){
        assertEquals(Factory.listFactory("3.1").getClass(), LList.class);
    }

    @Test
    public void shouldBeAbleToReturnDLListObjectUsingListStack(){
        assertEquals(Factory.listFactory("3.2").getClass(), DLList.class);
    }

    @Test
    public void shouldBeAbleToThrowExceptionInListFactory(){
        assertThrows(IllegalArgumentException.class, () -> Factory.listFactory("5"));
    }
}
