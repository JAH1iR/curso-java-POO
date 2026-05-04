package View;

import Model.ClienteModel;

public class ClienteView {
    public void mostrarPerfilCliente(ClienteModel c, String nivel, int puntos) {
        System.out.println("\n======= PERFIL DEL CLIENTE =======");
        System.out.println("ID:            " + c.getId());
        System.out.println("Nombre:        " + c.getNombre());
        System.out.println("Correo:        " + c.getCorreo());
        System.out.println("Monto Total:   $" + String.format("%.2f", c.getMontoAcumuladoCompras()));
        System.out.println("Nivel:         " + nivel);
        System.out.println("Puntos:        " + puntos);
        System.out.println("==================================\n");
    }
}
