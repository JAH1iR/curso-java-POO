package services;

public class EstudianteService {
    public char calificaciones(double nota) {
        if (nota >= 90) return 'A';
        if (nota >= 80) return 'B';
        if (nota >= 70) return 'C';
        if (nota >= 60) return 'D';
        return 'F';
    }

    public boolean esSobresaliente(double nota) {
        return nota >= 90;
    }

    public String estatus(double nota) {
        return (nota >= 70) ? "Aprobado" : "Reprobado";
    }
}