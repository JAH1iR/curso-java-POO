package Model;

public class InvetarioModel {
    private int codigo;
    private String descripcion;
    private Double precioUnitario;
    private int   cantidadStock;
    private String Producto;
public InvetarioModel (int codigo,String descripcion,Double precioUnitario,int cantidadStock , String Producto) {
this.codigo = codigo;
this.descripcion = descripcion;
this.precioUnitario = precioUnitario;
this.cantidadStock = cantidadStock;
this.Producto = Producto;
}
public InvetarioModel () {}
//getters y setters
public int getCodigo() {
    return codigo;
}
public void setCodigo(int codigo) {
    this.codigo = codigo;
}
public String getDescripcion() {
    return descripcion;
}
public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}
public Double getPrecioUnitario() {
    return precioUnitario;
}
public void setPrecioUnitario(Double precioUnitario) {
    this.precioUnitario = precioUnitario;
}
public int getCantidadStock() {
    return cantidadStock;
}
public void setCantidadStock(int cantidadStock) {
    this.cantidadStock = cantidadStock;
}
public String getProducto() {
    return Producto;
}
public void setProducto(String producto) {
    Producto = producto;
}

}