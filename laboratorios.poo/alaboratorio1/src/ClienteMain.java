import Model.ClienteModel;
import View.ClienteView;
import services.ClienteService;

public class ClienteMain {
    public static void main(String[] args) {
        // 1. Registrar un cliente inicial (usando constructor vacío y setters)
        ClienteModel cliente = new ClienteModel();
        // CONCEPTO: HERENCIA - Usamos setters de PersonaModel
        cliente.setCedula("8-6767-666");
        cliente.setNombre("Eric Bocanegra");
        cliente.setEdad(30);
        // Atributos propios de ClienteModel
        cliente.setCorreo("papin@ejemplo.com");
        cliente.setMontoAcumuladoCompras(650.0);

        ClienteService service = new ClienteService();
        ClienteView view = new ClienteView();

        // 2. Evaluar y mostrar perfil inicial (Debería ser 'Regular')
        System.out.println("--- Estado Inicial ---");
        view.mostrarPerfilCliente(cliente, service.asignarNivel(cliente), service.calcularPuntosFidelidad(cliente));

        // 3. Actualizar su monto de compra (Simulamos compras adicionales)
        System.out.println(">> Actualizando compras: sumando $750.00...");
        cliente.setMontoAcumuladoCompras(cliente.getMontoAcumuladoCompras() + 750.0);

        // 4. Evaluar estatus actualizado y proyectar perfil (Debería subir a 'VIP')
        System.out.println("--- Estado Actualizado ---");
        view.mostrarPerfilCliente(cliente, service.asignarNivel(cliente), service.calcularPuntosFidelidad(cliente));
    }
}
