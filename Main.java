import java.util.ArrayList;
import java.util.Scanner;

/**
 * Calculadora Infix utilizando VecStack, ArrayList, DLListStack y LListStack
 * @author Josue Hernandez 24770, Oscar Rompich 24880, Gabriel Hidalgo 24939
 * Creación: 23-02-2025
 * Ultima edición: 23-02-2025
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Translator translator = new Translator();

        ArrayList<ArrayList<String>> lineas = translator.reader("datos.txt");
        ArrayList<ArrayList<String>> resultadoPostfix = new ArrayList<>();

        for (ArrayList<String> infix : lineas) {
            ArrayList<String> postfix = translator.infixToPostfix(infix);
            resultadoPostfix.add(postfix);
        }


        ////------------------- PRUEBAS DE CALCULADORA -------------------////
        // Evaluar cada expresión postfix y mostrar el resultado
        boolean loop = true;
        while (loop) {
            // Crear el stack utilizando la opción seleccionada
            System.out.println("Elija una implementación de pila para esta operación:");
            System.out.println("1. VecList");
            System.out.println("2. ArrayList");
            System.out.println("3. LinkedList");
            System.out.println("4. DoubleList");
            System.out.println("5. Salir");
            String opcion = scanner.nextLine();
            if (opcion=="5"){
                loop = false;
            }else{
                for(ArrayList<String> postfix : resultadoPostfix){
                    // Crear el stack con el factory
                IStack<String> stack = Factory.stackFactory(opcion);
    
                // Evaluar la expresión postfix
                double result = evaluatePostfix(postfix, stack);
    
                // Imprimir el resultado
                System.out.println("El resultado de la expresión postfix es: " + result);
                }
            }
        }
    } 
    
    

    public static double evaluatePostfix(ArrayList<String> postfix, IStack<String> stack) {
        Calculator<Double> calculator = new Calculator<>();

        for (String token : postfix) {
            if (isNumeric(token)) {
                stack.push(token); 
            } else {
                double operand2 = Double.parseDouble(stack.pop());
                double operand1 = Double.parseDouble(stack.pop());

                double result = calculator.operation(token.charAt(0), operand1, operand2);

                stack.push(String.valueOf(result));
            }
        }
        return Double.parseDouble(stack.pop());
    }

    private static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
}