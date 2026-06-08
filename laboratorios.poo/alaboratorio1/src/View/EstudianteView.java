package View;
import Model.EstudianteModel;
import java.util.Scanner;

/**
 * Capa de Vista: Se encarga exclusivamente de la interacción con el usuario 
 * (Entrada de teclado y salida por pantalla).
 */
public class EstudianteView {
    
    // Captura la nota desde la consola
    public double capturarNota() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la nota final del estudiante (0-100): ");
        return sc.nextDouble();
    }

    // Imprime un reporte detallado
    public void imprimirReporte(EstudianteModel e, char letra, boolean sobresaliente, String estatus) {
        System.out.println("\n========== REPORTE ACADÉMICO ==========");
        // DEMOSTRACIÓN DE HERENCIA: Accedemos a métodos que están definidos en PersonaModel
        System.out.println("Estudiante: " + e.getNombre());
        System.out.println("Cédula:     " + e.getCedula());
        System.out.println("---------------------------------------");
        System.out.println("Nota Numérica: " + e.getNota()); // Atributo propio de Estudiante
        System.out.println("Calificación:  " + letra);
        System.out.println("¿Sobresaliente?: " + (sobresaliente ? "SÍ" : "NO"));
        System.out.println("Estatus Final:  " + estatus);
        System.out.println("=======================================\n");
    }
}