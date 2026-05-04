package services;

import Model.ClienteModel;

public class ClienteService {

    public String asignarNivel(ClienteModel c) {
        double monto = c.getMontoAcumuladoCompras();
        if (monto > 1000.00) {
            return "VIP";
        } else if (monto >= 500.00) {
            return "Premium";
        } else {
            return "Regular";
        }
    }

    public int calcularPuntosFidelidad(ClienteModel c) {
        // Otorgar 1 punto por cada $10.00 gastados (usamos casting a int)
        return (int) (c.getMontoAcumuladoCompras() / 10);
    }
}
