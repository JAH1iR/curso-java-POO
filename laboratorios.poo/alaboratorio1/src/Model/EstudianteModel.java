package Model;

public class EstudianteModel {
    private double nota;

    public EstudianteModel() {}

    public EstudianteModel(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}