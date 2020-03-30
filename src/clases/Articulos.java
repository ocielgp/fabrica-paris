package clases;

import java.util.Comparator;

/**
 *
 * @author ociel
 */
public class Articulos {

    String nombre, marca, descripcion, categoria;
    int codigo, existencia;
    private double precioVenta;

    public Articulos(String nombre, String marca, String descripcion, String categoria, int codigo, int existencia, double precioVenta) {
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.codigo = codigo;
        this.existencia = existencia;
        this.precioVenta = precioVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public static Comparator<Articulos> compareCodigo = new Comparator<Articulos>() {
        @Override
        public int compare(Articulos a1, Articulos a2) {
            Integer num1 = (Integer) a1.getCodigo();
            Integer num2 = (Integer) a2.getCodigo();
            return (int) num1.compareTo(num2);
        }
    };

    public static Comparator<Articulos> compareNombre = new Comparator<Articulos>() {
        @Override
        public int compare(Articulos a1, Articulos a2) {
            return (int) (a1.getNombre().compareToIgnoreCase(a2.getNombre()));
        }
    };

    public static Comparator<Articulos> nameComparator2 = new Comparator<Articulos>() {
        @Override
        public int compare(Articulos a1, Articulos a2) {
            return (int) (a1.getNombre().compareTo(a2.getNombre()));
        }
    };

    public static Comparator<Articulos> ageComparator = new Comparator<Articulos>() {
        @Override
        public int compare(Articulos a1, Articulos a2) {
            return (a2.getCodigo() < a1.getCodigo() ? -1
                    : (a2.getCodigo() == a1.getCodigo() ? 0 : 1));
        }
    };

}
