import Model.InvetarioModel;
import services.InventarioServices;
import View.ProductoView;

public class ProductoMain {
    public static void main(String[] args) {
        
        
        InvetarioModel prod = new InvetarioModel();
        
        
        prod.setDescripcion("Laptop");
        prod.setcodigo("L123");
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
