package clases;

/**
 *
 * @author ociel
 */
public class HistorialCompras {

    int cantidadCompras, numCompra, codigoArticulo;
    String fechaCompra;
    double total;

    public HistorialCompras(int cantidadCompras, int numCompra, int codigoArticulo, String fechaCompra, double total) {
        this.cantidadCompras = cantidadCompras;
        this.numCompra = numCompra;
        this.codigoArticulo = codigoArticulo;
        this.fechaCompra = fechaCompra;
        this.total = total;
    }

    public int getCantidadCompras() {
        return cantidadCompras;
    }

    public void setCantidadCompras(int cantidadCompras) {
        this.cantidadCompras = cantidadCompras;
    }

    public int getNumCompra() {
        return numCompra;
    }

    public void setNumCompra(int numCompra) {
        this.numCompra = numCompra;
    }

    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
