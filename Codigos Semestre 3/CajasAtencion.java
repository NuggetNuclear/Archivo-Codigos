public class CajasAtencion {

    public static String determinarCajaRapida(String secuenciaClientes, int tiempoAtencionC1, int tiempoAtencionC2) {
        // Inicializar el tiempo de atención de cada caja como 0
        int tiempoC1 = 0;
        int tiempoC2 = 0;

        // Recorrer cada caracter de la secuencia de clientes
        for (char caracter : secuenciaClientes.toCharArray()) {
            if (caracter == 'C' || caracter == 'E') {
                // Sumar el tiempo de atención de la caja de creación y eliminación de productos
                tiempoC1 += tiempoAtencionC1;
            } else if (caracter == 'P') {
                // Sumar el tiempo de atención de la caja de reporte de problemas
                tiempoC2 += tiempoAtencionC2;
            }
        }

        // Comparar los tiempos de atención de ambas cajas
        if (tiempoC1 < tiempoC2) {
            return "c1";
        } else if (tiempoC2 < tiempoC1) {
            return "c2";
        } else {
            return "c1c2";
        }
    }

    public static void main(String[] args) {
        String secuenciaClientes = "CEPCEP";
        int tiempoAtencionC1 = 5; // Tiempo de atención en la caja de creación y eliminación de productos
        int tiempoAtencionC2 = 4; // Tiempo de atención en la caja de reporte de problemas
        
        String resultado = determinarCajaRapida(secuenciaClientes, tiempoAtencionC1, tiempoAtencionC2);
        System.out.println("La caja que termina primero de atender es: " + resultado);
    }
}
