package Model;

public class EstudianteModel {
    
    private String nombre;
    private int edad;
    private String carrera;
    private double nota;

    public EstudianteModel(String nombre, int edad, String carrera, double nota) {
        this.nombre = nombre;
        this.setEdad(edad);
        this.carrera = carrera;
        this.setNota(nota);
    }
    
    public EstudianteModel() {}

    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    

    
    public int getEdad() {
        return edad;
    }

    
    public void setEdad(int edad) {
        
            this.edad = edad;
        }
    

    
    public String getCarrera() {
        return carrera;
    }

    
    public void setCarrera(String carrera) {
            this.carrera = carrera;
        }
    

   
    public double getNota() {
        return nota;
    }

   
    public void setNota(double nota) {
            this.nota = nota;
        }
    

   
   

}
