package View;

/**
 * CLASE BASE PARA VISTAS
 * Aquí definimos métodos de formato que todas las vistas pueden usar.
 */
public class ViewBase {

    // Método compartido para imprimir títulos elegantes
    public void imprimirEncabezado(String titulo) {
        System.out.println("\n=======================================");
        System.out.println("  " + titulo.toUpperCase());
        System.out.println("=======================================");
    }

    public void imprimirLinea() {
        System.out.println("---------------------------------------");
    }
}