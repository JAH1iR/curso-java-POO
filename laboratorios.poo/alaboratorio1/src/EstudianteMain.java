import Model.EstudianteModel;
import View.EstudianteView;
import services.EstudianteService;

public class EstudianteMain {
    public static void main(String[] args) {
        // 1. Instanciamos los objetos necesarios
        EstudianteView vista = new EstudianteView();
        EstudianteService servicio = new EstudianteService();
        EstudianteModel estudiante = new EstudianteModel();

        // 2. Datos del estudiante (Heredados de Persona)
        estudiante.setNombre("Eric Bocanegra");
        estudiante.setCedula("8-000-000");
        estudiante.setEdad(21);

        // 3. Usamos la vista para pedir la nota
        double nota = vista.capturarNota();
        
        estudiante.setNota(nota);

        // 4. Procesamos la información con el servicio
        char letra = servicio.calificaciones(estudiante.getNota());
        boolean sobresaliente = servicio.esSobresaliente(estudiante.getNota());
        String estatus = servicio.estatus(estudiante.getNota());

        // 5. Le mandamos los resultados a la vista para que los imprima
        vista.imprimirReporte(estudiante, letra, sobresaliente, estatus);
}
}
