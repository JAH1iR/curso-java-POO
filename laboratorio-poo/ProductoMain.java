import Model.Producto;
import Services.ProductoServices;
import services.InventarioServices;
import view.ProductoView;

public class ProductoMain {
    public static void main(String[] args) {
        
        
        Producto prod = new Producto();
        
        
        prod.setNombreProducto("Laptop");
        prod.setCodigoProducto("L123");
        prod.setPrecioBase(500.0);
        prod.setCantidadCompra(2);
        prod.setDescuento(10.0);
        prod.setImpuesto(7.0);

        
        InventarioServices ps = new InventarioServices();

      
         pv = new IventarioView();
        
       
        pv.ProductoView(
            prod, 
            ps.calcularSubtotal(prod), 
            ps.calcularMontoDescuento(ps.calcularSubtotal(prod), prod.getDescuento()), 
            ps.calcularMontoImpuesto(ps.calcularSubtotal(prod), ps.calcularMontoDescuento(ps.calcularSubtotal(prod), prod.getDescuento()), prod.getImpuesto()),
            ps.calcularTotalFinal(ps.calcularSubtotal(prod), ps.calcularMontoDescuento(ps.calcularSubtotal(prod), prod.getDescuento()), 7.0) 
        );
    }
}
