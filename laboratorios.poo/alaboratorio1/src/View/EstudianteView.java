package View;
import java.util.Scanner;

public class EstudianteView {
    private Scanner sc = new Scanner(System.in);

    public double capturarNota() {
        System.out.print("Ingrese la nota del estudiante: ");
        return sc.nextDouble();
    }

    public void imprimirReporte(char letra, boolean sobresaliente, String estatus) {
        System.out.println("--- RESULTADOS DEL ESTUDIANTE ---");
        System.out.println("Calificación: " + letra);
        System.out.println("¿Es sobresaliente?: " + (sobresaliente ? "Sí" : "No"));
        System.out.println("Estatus: " + estatus);
        System.out.println("---------------------------------");
    }
}