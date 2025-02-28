public class Calculator<T> {

    // Instancia única de la clase Calculator
    private static Calculator<?> instance;

    // Constructor privado para evitar instanciación externa
    private Calculator() {}

    // Método estático para obtener la instancia única
    public static synchronized <T> Calculator<T> getInstance() {
        if (instance == null) {
            instance = new Calculator<>();
        }
        return (Calculator<T>) instance;
    }

    // Método de operación genérica
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
            case '^':
                return (T) (Double) Math.pow((Double) value1, (Double) value2);
            default:
                return null;
        }
    }
}

