package Model;

/**
 * CONCEPTO: HERENCIA (Gato hereda de Animal)
 */
public class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    // CONCEPTO: POLIMORFISMO (Sobrescritura / Override)
    // El gato usa el mismo método pero hace algo distinto: Maullar.
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau Miau!");
    }
}