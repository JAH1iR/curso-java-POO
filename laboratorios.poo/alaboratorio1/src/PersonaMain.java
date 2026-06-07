import Model.PersonaModel;
import View.PersonaView;
import services.PersonaService;

public class PersonaMain {
    public static void main(String[] args) {
        // CONCEPTO: INSTANCIA (El proceso de crear un objeto usando 'new')
        // CONCEPTO: OBJETO (La variable 'p' es un objeto, un ejemplar real de PersonaModel)
        PersonaModel p = new PersonaModel("8-111-222", "Eric Bocanegra", 20);
        PersonaService s = new PersonaService();
        PersonaView v = new PersonaView();
        
        v.mostrarDatos(p, s);
    }
}