import Model.EstudianteModel;
import View.EstudianteView;
import services.EstudianteService;

public class EstudianteMain {
    public static void main(String[] args) {
        // 1. Instanciamos los objetos necesarios
        EstudianteView vista = new EstudianteView();
        EstudianteService servicio = new EstudianteService();
        EstudianteModel estudiante = new EstudianteModel();

        // 2. Usamos la vista para pedir la nota
        double nota = vista.capturarNota();
        
        // 3. Guardamos la nota en el modelo (opcional, pero buena práctica POO)
        estudiante.setNota(nota);

        // 4. Usamos el servicio para calcular todo basándonos en la nota del modelo
        char letra = servicio.calificaciones(estudiante.getNota());
        boolean sobresaliente = servicio.esSobresaliente(estudiante.getNota());
        String estatus = servicio.estatus(estudiante.getNota());

        // 5. Le mandamos los resultados a la vista para que los imprima
        vista.imprimirReporte(letra, sobresaliente, estatus);
}
}
