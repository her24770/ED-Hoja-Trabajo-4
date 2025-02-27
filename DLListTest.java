import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class DLListTest {

    private DLList<Integer> list;

    @Before
    public void setUp() {
        list = new DLList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }

    @Test

    public void shouldBeAbletoAddElement() {
        list.add(6);
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
        assertEquals(4, (int) list.remove(3));
    }
}
