import java.util.ArrayList;

/**
 * Calculadora Infix utilizando VecStack, ArrayList, DLListStack y LListStack
 * @author Josue Hernandez 24770, Oscar Rompich 24880, Gabriel Hidalgo 24939
 * Creación: 23-02-2025
 * Ultima edición: 23-02-2025
 */

public class Main {
    public static void main(String[] args) {
        Translator  translator = new Translator();
        ArrayList<String> linesString =translator.reader("datos.txt");
        for (String line : linesString) {
            System.out.println(line);
        }
    }   
}
