package View;

import Model.InvetarioModel;

public class IventarioView {

    public void viewProducto(InvetarioModel p, double sub, double desc, double imp, double total)
    public void mostrarDetalles(InvetarioModel p, double sub, double desc, double imp, double total)
     {
        System.out.println("Producto: " + p.getDescripcion());
        System.out.println("Codigo: " + p.getProducto());
        
        System.out.println("Subtotal: " + sub);
        System.out.println("Descuento: " + desc);
        System.out.println("Impuesto: " + imp);
        System.out.println("Total: " + total);
    }
}
