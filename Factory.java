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
            return new ArrayLStack<T>(); 
        case "3.1":
            return  listFactory("3.1"); 
        case "3.2":
            return  listFactory("3.2");  
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