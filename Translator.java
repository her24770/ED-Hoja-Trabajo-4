import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Translator {

    /**
     * Método para leer un archivo y retornar un array con las líneas
     * @param nameFile nombre del archivo
     * @return arrays con las expresiones infix
     */

    public ArrayList<String> reader(String nameFile) {
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nameFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return lines;
    }

    /**
     * Método para verificar si un string es un número
     * @param str string a verificar
     * @return true si es un número, false si no
     */

    private boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    
    /**
     * Método para obtener la precedencia de un operador
     * @param op operador
     * @return precedencia
     */


    private int precedence(String op) {
        switch (op) {
            case "+": case "-": return 1;
            case "*": case "/": return 2;
            case "^": return 3;
            default: return -1;
        }
    }

    /**
     * Método para convertir una expresión infix dentro de un array a postfix dentro de un array
     * @param infix expresión infix en un array
     * @return expresión postfix en un array
     */


    public ArrayList<String> infixToPostfix(ArrayList<String> infix) {
        VecStack<String> stack = new VecStack<>();
        ArrayList<String> postfix = new ArrayList<>();

        for (String ch : infix) {
            if (isNumeric(ch)) { // Si es número, agregar a postfix
                postfix.add(ch);
            } else if (ch.equals("(")) { // Si es '(', apilar
                stack.push(ch);
            } else if (ch.equals(")")) { // Si es ')', desapilar hasta '('
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    postfix.add(stack.pop(0));
                }
                stack.pop(0);
            } else { // Operador
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.add(stack.pop(0));
                }
                stack.push(ch);
            }
        }

        // Vaciar la pila al final
        while (!stack.isEmpty()) {
            postfix.add(stack.pop(0));
        }

        return postfix;
    }

}
