import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class UnitTestsDLL {

    private DLList<Integer> list;

    @Before
    public void setUp() {
        list = new DLList<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

    }

    @Test

    public void shouldBeAbletoAddElement() {
        list.push(6);
        assertEquals(6, (int) list.deleteRight());
    }

    @Test
    public void shouldBeAbletoDeleteLeft() {
        assertEquals(1, (int) list.deleteLeft());
    }

    @Test
    public void shouldBeAbletoDeleteRight() {
        assertEquals(5, (int) list.deleteRight());
    }

    @Test
    public void shouldBeAbletoRemoveAnEspecificItem() {
        assertEquals(4, (int) list.pop(3));
    }
}
