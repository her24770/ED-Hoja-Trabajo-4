public class Factory {
    
    // Método para crear implementaciones de IStack
public static <T> IStack<T> stackFactory(String option) {
    switch (option) {
        case "1":
            return new VecStack<T>();  // Retorna una implementación de IStack
        case "2":
            return new ArrayLStack<T>();  // Retorna una implementación de IStack
        case "3":
            return  listFactory("3.1");  // Convierte la instancia de IList a IStack
        case "4":
            return  listFactory("3.2");  // Convierte la instancia de IList a IStack
        default:
            throw new IllegalArgumentException("Opción no válida: " + option);
    }
}

// Método para crear implementaciones de IList
public static <T> IStack<T> listFactory(String option) {
    switch (option) {
        case "3.1":
            return new LList<T>();  // Retorna una implementación de IList
        case "3.2":
            return new DLList<T>();  // Retorna una implementación de IList
        default:
            throw new IllegalArgumentException("Opción no válida: " + option);
    }
}

}