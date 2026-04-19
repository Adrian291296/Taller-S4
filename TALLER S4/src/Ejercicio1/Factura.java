package Ejercicio1;

public class Factura {
    private String numeroPieza;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura(String numeroPieza, String descripcion, int cantidad, double precio) {
        this.numeroPieza = numeroPieza;
        this.descripcion = descripcion;
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public void setNumeroPieza(String numeroPieza) {
        this.numeroPieza = numeroPieza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = (cantidad > 0) ? cantidad : 0;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = (precio > 0) ? precio : 0.0;
    }

    public double obtenerMontoFactura() {
        return cantidad * precio;
    }
}