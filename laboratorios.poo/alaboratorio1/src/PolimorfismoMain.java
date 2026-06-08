import Model.Animal;
import Model.Gato;
import Model.Perro;

public class PolimorfismoMain {
    public static void main(String[] args) {
        
        // 1. Polimorfismo: Tratamos a diferentes objetos como si fueran del mismo tipo (Animal)
        Animal miPerro = new Perro("Rex");
        Animal miGato = new Gato("Michi");

        System.out.println("--- Probando sonidos individuales ---");
        // Aunque las variables son de tipo 'Animal', Java sabe ejecutar el sonido correcto
        miPerro.hacerSonido(); 
        miGato.hacerSonido();  

        // 2. Colecciones polimórficas
        // Podemos guardar perros y gatos en un mismo arreglo de animales
        System.out.println("\n--- Probando polimorfismo en una lista ---");
        Animal[] misMascotas = {
            new Perro("Bobby"),
            new Gato("Garfield"),
            new Perro("Laika")
        };

        for (Animal mascota : misMascotas) {
            // Aquí está el poder del polimorfismo: un solo comando, muchos comportamientos
            mascota.hacerSonido();
        }
    }
}