package services;

public class EstudianteService {
    public char calficaciones(double calificacion) {
        if (calificacion >= 91 || calificacion == 100) {
            return 'A';
        } else if (calificacion >= 81 || calificacion == 90) {
            return 'B';
        } else if (calificacion >= 71 || calificacion == 80) {
            return 'C';
        } else if (calificacion >= 61 || calificacion == 70) {
            return 'D';
        } else {
            return 'F';
        }
    }
public boolean esSobresaliente(double calificacion) {
    return calificacion >= 90 ; 
}
public String estatus(double calificacion) {
    if (calificacion >= 71) {
        if (calificacion >= 71 || calificacion == 80) {
            return "Aprobado con la nota minima , tiene que mejorar ";
        } else {
            return "Aprobado";
        }
    } else {
        if (calificacion <= 60) {
            return "Reprobado por baja nota (F) por bot";
        } else {
            return "pasa con la minima pero tendra que repetir el curso para mejorara nota ";
        }
    }
}
}
