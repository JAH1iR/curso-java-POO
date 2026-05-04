import Model.PersonaModel;
import services.PersonaService;
import View.PersonaView;

public class PersonaMain {
    public static void main(String[] args) {
        PersonaModel p = new PersonaModel("8-111-222", "Eric Bocanegra", 20);
        PersonaService s = new PersonaService();
        PersonaView v = new PersonaView();
        
        v.mostrarDatos(p, s);
    }
}