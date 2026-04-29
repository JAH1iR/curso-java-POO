package View;


public class IventarioView {

    public void viewProducto(Producto p, double sub, double desc, double imp, double total)
    public void mostrarDetalles(Producto p, double sub, double desc, double imp, double total)
     {
        System.out.println("Producto: " + p.getNombreProducto());
        System.out.println("Codigo: " + p.getCodigoProducto());
        
        System.out.println("Subtotal: " + sub);
        System.out.println("Descuento: " + desc);
        System.out.println("Impuesto: " + imp);
        System.out.println("Total: " + total);
    }
}
