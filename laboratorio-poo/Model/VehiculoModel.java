package Model;

public class VehiculoModel {
 //: placa (String), marca (String), modelo (String) y añoFabricacion (int).
    private String placa;
    private String marca;
    private String modelo;
    private int añoFabricacion;
    //constructor lleno
public VehiculoModel(String placa, String marca, String modelo, int añoFabricacion) {
    this.placa = placa;
    this.marca = marca;
    this.modelo = modelo;
    this.añoFabricacion = añoFabricacion;
}
//constructor vacio
public VehiculoModel() {}
//getters y setters
public String getPlaca() {
    return placa;
}
public void setPlaca(String placa) {
    this.placa = placa;
}
public String getMarca() {
    return marca;
}
public void setMarca(String marca) {
    this.marca = marca;
}
public String getModelo() {
    return modelo;
}
public void setModelo(String modelo) {
    this.modelo = modelo;
}
public int getAñoFabricacion() {
    return añoFabricacion;
}
public void setAñoFabricacion(int añoFabricacion) {
    this.añoFabricacion = añoFabricacion;
}

}

