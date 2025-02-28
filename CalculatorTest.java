import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    
    private Calculator<Double> calculator = new Calculator<Double>();
    
    @Test
    public void shouldBeAbleToAdd(){
        assertEquals(calculator.operation('+', 5.0, 3.0), Double.valueOf(8.0));
    }

    @Test
    public void shouldBeableToSubstract(){
        assertEquals(calculator.operation('-', 5.0, 3.0), Double.valueOf(2.0));
    }

    @Test
    public void shouldBeableToMultiply(){
        assertEquals(calculator.operation('*', 5.0, 3.0), Double.valueOf(15.0));
    }

    @Test
    public void shouldBeableToDivide(){
        assertEquals(calculator.operation('/', 10.0, 5.0), Double.valueOf(2.0));
    }

    @Test
    public void shouldBeableToMod(){
        assertEquals(calculator.operation('%', 5.0, 3.0), Double.valueOf(2.0));
    }

    @Test
    public void shouldBeAbleToPower(){
        assertEquals(calculator.operation('^', 2.0, 3.0), Double.valueOf(8.0));   
    }

    @Test
    public void shouldReturnNull(){
        assertEquals(calculator.operation('0', 5.0, 3.0), null);
    }
}