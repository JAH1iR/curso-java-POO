package services;

/**
 * Lógica de Negocio: Aquí se procesan los datos del Estudiante para obtener
 * resultados académicos (calificaciones, estatus, etc).
 */
public class EstudianteService {
    
    // Determina la calificación literal (A, B, C, D o F) basándose en rangos numéricos
    public char calificaciones(double nota) {
        if (nota >= 90) return 'A';
        if (nota >= 80) return 'B';
        if (nota >= 70) return 'C';
        if (nota >= 60) return 'D';
        return 'F';
    }

    // Determina si el desempeño es excelente (sobresaliente)
    public boolean esSobresaliente(double nota) {
        return nota >= 90;
    }

    // Clasifica el resultado final en Aprobado, Revalida o Reprobado
    public String estatus(double nota) {
        if (nota >= 71) {
            return "APROBADO";
        } else if (nota >= 61) {
            return "REVALIDA";
        } else {
            return "REPROBADO";
        }
    }
}