package Model;
//clase estudiante
public class EstudianteModel {
    //atributos
    private String nombre;
    private int edad;
    private String carrera;
    private double Nota;
    //contructor lleno 
    public EstudianteModel(String nombre, int edad, String carrera , double Nota) { 
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.Nota = Nota;
    }
    
    public EstudianteModel() {}// aqui el contructor vacio

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
        return Nota;
    }

    public void setNota(double nota) {
        Nota = nota;
    }

 //getters y setters.para hacer esto usamos click derecho accion de codigo fuente y ya
    
    

   

}
