public class Calculator<T> {
   
    public T operation(char operator, T value1, T value2) {
        switch (operator) {
            case '+':
                return (T) (Double) ((Double) value1 + (Double) value2);
            case '-':
                return (T) (Double) ((Double) value1 - (Double) value2);
            case '*':   
                return (T) (Double) ((Double) value1 * (Double) value2);
            case '/':
                return (T) (Double) ((Double) value1 / (Double) value2);
            case '%':       
                return (T) (Double) ((Double) value1 % (Double) value2);
            default:
                return null;
        }
    }
}
