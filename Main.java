import java.util.ArrayList;

/**
 * Calculadora Infix utilizando VecStack, ArrayList, DLListStack y LListStack
 * @author Josue Hernandez 24770, Oscar Rompich 24880, Gabriel Hidalgo 24939
 * Creación: 23-02-2025
 * Ultima edición: 23-02-2025
 */

public class Main {
    public static void main(String[] args) {
        Translator translator = new Translator();

        ArrayList<ArrayList<String>> lineas = translator.reader("datos.txt");
        ArrayList<ArrayList<String>> resultadoPostfix = new ArrayList<>();

        for (ArrayList<String> infix : lineas) {
            ArrayList<String> postfix = translator.infixToPostfix(infix);
            resultadoPostfix.add(postfix);
        }

        // Imprimir el resultado de las líneas convertidas a postfix
        for (ArrayList<String> postfix : resultadoPostfix) {
            System.out.println(postfix);
        }


        // 
    }   
}