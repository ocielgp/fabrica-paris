package clases;

/**
 *
 * @author ociel
 */
public class HistorialCompras {

    private int cantidadCompras, numCompra, codigoArticulo;
    private String fechaCompra, formaPago;
    private double total;

    public HistorialCompras(int cantidadCompras, int numCompra, int codigoArticulo, String fechaCompra, String formaPago, double total) {
        this.cantidadCompras = cantidadCompras;
        this.numCompra = numCompra;
        this.codigoArticulo = codigoArticulo;
        this.fechaCompra = fechaCompra;
        this.formaPago = formaPago;
        this.total = total;
    }

    public int getCantidadCompras() {
        return cantidadCompras;
    }

    public int getNumCompra() {
        return numCompra;
    }

    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public double getTotal() {
        return total;
    }
    
    

}
