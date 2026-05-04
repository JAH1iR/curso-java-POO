package View;
import java.util.Scanner;
public class EstudianteView {
   private Scanner leer = new Scanner(System.in);

    // Método para capturar la entrada del usuario
    public double capturarNota() {
        System.out.println("-----------------------------------");
        System.out.print("Ingrese la nota del estudiante: ");
        return leer.nextDouble();
    }

    // Método para mostrar la información procesada
    public void imprimirReporte(char letra, boolean esSobresaliente, String estatus) {
        System.out.println("\n===== RESULTADOS DEL ESTUDIANTE =====");
        System.out.println("Calificación en letra: " + letra);
        System.out.println("¿Es sobresaliente?: " + (esSobresaliente ? "SÍ" : "NO"));
        System.out.println("Estatus final: " + estatus);
        System.out.println("=====================================");
    }

}