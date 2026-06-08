package Model;

/**
 * CONCEPTO: HERENCIA (Perro hereda de Animal)
 */
public class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre); // Le pasamos el nombre al constructor del padre
    }

    // CONCEPTO: POLIMORFISMO (Sobrescritura / Override)
    // El perro usa el mismo método pero hace algo distinto: Ladrar.
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau Guau!");
    }
}