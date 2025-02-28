public class Factory {
    
/**
 * Factory para instancia de Stacks
 * @param <T> 
 * @param option tipo de stack elegido por usuario
 * @return instancia de stack
 */
public static <T> IStack<T> stackFactory(String option) {
    switch (option) {
        case "1":
            return new VecStack<T>();  
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

/**
 * Factory especifico para los Stacks de List
 * @param <T>
 * @param option Stack seleccionado por usuario
 * @return instancia de stack
 */
public static <T> IStack<T> listFactory(String option) {
    switch (option) {
        case "3.1":
            return new LList<T>(); 
        case "3.2":
            return new DLList<T>();  
        default:
            throw new IllegalArgumentException("Opción no válida: " + option);
    }
}

}