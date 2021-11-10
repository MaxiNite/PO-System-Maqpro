/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetoNegocio;

/**
 *
 * @author Daniel Holguin
 */
public class PO {
    private String numeroPO, cliente, descripcion, material, fecha;
    private int cantidad;
    
    public PO(){
    }

    public PO(String numeroPO, String cliente, String descripcion, String material, String fecha, int cantidad) {
        this.numeroPO = numeroPO;
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.material = material;
        this.fecha = fecha;
        this.cantidad = cantidad;
    }

    public String getNumeroPO() {
        return numeroPO;
    }

    public void setNumeroPO(String numeroPO) {
        this.numeroPO = numeroPO;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "PO: " + "Numero PO= " + numeroPO + ", Cliente= " + cliente + ", Descripcion= " + descripcion + ", Material= " + material + ", Fecha= " + fecha + ", Cantidad= " + cantidad;
    }
}
