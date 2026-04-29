package services;
import Model.InvetarioModel;
public class InventarioServices {
   
    public double calcularSubtotal(Producto producto) {
        return producto.getPrecioBase() * producto.getCantidadCompra();
    };

    
    public double calcularMontoDescuento(double subtotal, double porcentajeDescuento) {
        return (subtotal * porcentajeDescuento) / 100;
    }

    
    public double calcularMontoImpuesto(double subtotal, double montoDescuento, double porcentajeImpuesto) {
        double precioConDescuento = subtotal - montoDescuento;
        return (precioConDescuento * porcentajeImpuesto) / 100;
    }

    
    public double calcularTotalFinal(double subtotal, double montoDescuento, double impuesto) {
        return (subtotal - montoDescuento) + impuesto;
    }
}
}
