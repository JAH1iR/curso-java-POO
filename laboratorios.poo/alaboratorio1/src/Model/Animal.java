package Model;

/**
 * CONCEPTO: CLASE PADRE (Superclase)
 * Define lo que todos los animales tienen en común (un nombre).
 */
public class Animal {
    protected String nombre; // 'protected' permite que los hijos usen este dato directamente

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /**
     * CONCEPTO: POLIMORFISMO
     * Definimos un método genérico que cada "hijo" va a personalizar.
     */
    public void hacerSonido() {
        System.out.println("El animal hace un sonido desconocido.");
    }

    public String getNombre() { return nombre; }
}