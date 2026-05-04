package Model;

public class ClienteModel {
    private int id;
    private String nombre;
    private String correo;
    private double montoAcumuladoCompras;

    public ClienteModel() {}

    public ClienteModel(int id, String nombre, String correo, double montoAcumuladoCompras) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.montoAcumuladoCompras = montoAcumuladoCompras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getMontoAcumuladoCompras() {
        return montoAcumuladoCompras;
    }

    public void setMontoAcumuladoCompras(double montoAcumuladoCompras) {
        this.montoAcumuladoCompras = montoAcumuladoCompras;
    }

}
