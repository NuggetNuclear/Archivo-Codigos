import java.util.Stack;

public class EvaluadorPostfijo {
    
    public static int evaluarExpresionPostfija(String expresion) {
        // Inicializar una pila vacía
        Stack<Integer> pila = new Stack<>();

        // Dividir la expresión en tokens
        String[] tokens = expresion.split(" ");

        // Para cada token en la expresión
        for (String token : tokens) {
            // Si token es un número, ponerlo en la pila
            if (esNumero(token)) {
                pila.push(Integer.parseInt(token));
            } else { // Si token es un operador
                // Sacar los dos últimos operandos de la pila
                int operando2 = pila.pop();
                int operando1 = pila.pop();

                // Aplicar el operador al operando1 y operando2
                int resultado = realizarOperacion(operando1, operando2, token);

                // Poner el resultado en la pila
                pila.push(resultado);
            }
        }

        // Al final, el resultado estará en la cima de la pila
        return pila.pop();
    }

    private static boolean esNumero(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static int realizarOperacion(int operando1, int operando2, String operador) {
        // Realiza la operación correspondiente
        switch (operador) {
            case "+":
                return operando1 + operando2;
            case "-":
                return operando1 - operando2;
            case "*":
                return operando1 * operando2;
            case "/":
                return operando1 / operando2;
            default:
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }

    public static void main(String[] args) {
        String expresion = "2 3 + 3 3 + *";
        int resultado = evaluarExpresionPostfija(expresion);
        System.out.println("El resultado de la expresión '" + expresion + "' es: " + resultado);
    }
}
