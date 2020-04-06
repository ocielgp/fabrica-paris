package clases;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author ociel
 */
public class ControlFabrica {

    private ArrayList<Clientes> clientes = new ArrayList();
    private ArrayList<Articulos> articulos = new ArrayList();

    public int contarElementos(int tipoLista) {
        if (tipoLista == 1) {
            return clientes.size();
        } else {
            return articulos.size();
        }
    }

    public int contarCompras(int indice) {
        return clientes.get(indice).getHistorialCompras().size();
    }

    public boolean altas(int tipoAlta, Object objeto) {
        if (tipoAlta == 1) {
            clientes.add((Clientes) objeto);
            return true;
        } else {
            articulos.add((Articulos) objeto);
            return true;
        }
    }

    public boolean bajas(int tipoLista, Object dato) {
        int indice = 0;
        if (tipoLista == 1) {
            indice = buscar(1, dato.toString());
            if (indice != -1) {
                clientes.remove(indice);
                return true;
            }
        } else {
            indice = buscar(2, (int) dato);
            if (indice != -1) {
                articulos.remove(indice);
                return true;
            }
        }
        return false;
    }

    public boolean cambios(int tipoLista, TableModel tablaModelo) {
        int fila = 0;
        if (tipoLista == 1) {
            Iterator iterar = clientes.iterator();
            while (iterar.hasNext()) {
                Clientes cliente = (Clientes) iterar.next();
                cliente.setRFC(tablaModelo.getValueAt(fila, 0).toString());
                cliente.setNombreORS(tablaModelo.getValueAt(fila, 1).toString());
                cliente.setTipoCliente(tablaModelo.getValueAt(fila, 2).toString());
                cliente.setSaldo(Double.parseDouble(tablaModelo.getValueAt(fila, 3).toString().toString()));
                cliente.setDomicilio(tablaModelo.getValueAt(fila, 4).toString());
                fila++;
            }
        } else {
            Iterator iterar = articulos.iterator();
            while (iterar.hasNext()) {
                Articulos articulo = (Articulos) iterar.next();
                articulo.setCodigo(Integer.parseInt(tablaModelo.getValueAt(fila, 0).toString()));
                articulo.setNombre(tablaModelo.getValueAt(fila, 1).toString());
                articulo.setMarca(tablaModelo.getValueAt(fila, 2).toString());
                articulo.setCategoria(tablaModelo.getValueAt(fila, 3).toString());
                articulo.setExistencia(Integer.parseInt(tablaModelo.getValueAt(fila, 4).toString()));
                articulo.setPrecioVenta(Double.parseDouble(tablaModelo.getValueAt(fila, 5).toString()));
                articulo.setDescripcion(tablaModelo.getValueAt(fila, 6).toString());
                fila++;
            }
        }
        return false;
    }

    public int buscar(int tipoLista, Object dato) {
        int indice = 0;
        if (tipoLista == 1) {
            Collections.sort(clientes, Clientes.compareRFC);
            indice = Collections.binarySearch(clientes, new Clientes(null, null, dato.toString(), null, 0), Clientes.compareRFC);
        } else {
            if (dato instanceof String) {
                Collections.sort(articulos, Articulos.compareNombre);
                indice = Collections.binarySearch(articulos, new Articulos(dato.toString(), null, null, null, 0, 0, 0), Articulos.compareNombre);
            } else {
                Collections.sort(articulos, Articulos.compareCodigo);
                indice = Collections.binarySearch(articulos, new Articulos(null, null, null, null, (int) dato, 0, 0), Articulos.compareCodigo);
            }
        }
        return indice;
    }

    public DefaultTableModel tablaModelo(int tipoTabla, int index) {
        DefaultTableModel tablaModelo = new DefaultTableModel();
        Object[] datos;
        //tabla 1 | Clientes
        if (tipoTabla == 1) {
            Collections.sort(clientes, Clientes.compareRFC);
            tablaModelo.addColumn("RFC");
            tablaModelo.addColumn("Nombre");
            tablaModelo.addColumn("Tipo de Cliente");
            tablaModelo.addColumn("Saldo");
            tablaModelo.addColumn("Domicilio");
            datos = new Object[5];

            if (index == -1) {
                Iterator iterar = clientes.iterator();
                while (iterar.hasNext()) {
                    Clientes cliente = (Clientes) iterar.next();
                    datos[0] = cliente.getRFC();
                    datos[1] = cliente.getNombreORS();
                    datos[2] = cliente.getTipoCliente();
                    datos[3] = cliente.getSaldo();
                    datos[4] = cliente.getDomicilio();
                    tablaModelo.addRow(datos);
                }
            } else if (index >= 0) {
                datos[0] = clientes.get(index).getRFC();
                datos[1] = clientes.get(index).getNombreORS();
                datos[2] = clientes.get(index).getTipoCliente();
                datos[3] = clientes.get(index).getSaldo();
                datos[4] = clientes.get(index).getDomicilio();
                tablaModelo.addRow(datos);
            }
            //tabla 2 | Clientes
        } else if (tipoTabla == 2) {
            tablaModelo.addColumn("Código");
            tablaModelo.addColumn("Nombre");
            tablaModelo.addColumn("Marca");
            tablaModelo.addColumn("Categoria");
            tablaModelo.addColumn("Existencia");
            tablaModelo.addColumn("Precio Venta");
            tablaModelo.addColumn("Descripcion");
            datos = new Object[7];
            if (index == -1) {
                Collections.sort(articulos, Articulos.compareCodigo);
                Iterator iterar = articulos.iterator();
                while (iterar.hasNext()) {
                    Articulos articulo = (Articulos) iterar.next();
                    datos[0] = articulo.getCodigo();
                    datos[1] = articulo.getNombre();
                    datos[2] = articulo.getMarca();
                    datos[3] = articulo.getCategoria();
                    datos[4] = articulo.getExistencia();
                    datos[5] = articulo.getPrecioVenta();
                    datos[6] = articulo.getDescripcion();
                    tablaModelo.addRow(datos);
                }
            } else if (index >= 0) {
                datos[0] = articulos.get(index).getCodigo();
                datos[1] = articulos.get(index).getNombre();
                datos[2] = articulos.get(index).getMarca();
                datos[3] = articulos.get(index).getCategoria();
                datos[4] = articulos.get(index).getExistencia();
                datos[5] = articulos.get(index).getPrecioVenta();
                datos[6] = articulos.get(index).getDescripcion();
                tablaModelo.addRow(datos);
            }
            //tabla 2 | Historial Compra
        } else if (tipoTabla == 3) {

            datos = new Object[5];
            tablaModelo.addColumn("Número de compra");
            tablaModelo.addColumn("Código artículo");
            tablaModelo.addColumn("Cantidad de compra");
            tablaModelo.addColumn("Fecha de compra");
            tablaModelo.addColumn("Total");
            if (index >= 0) {
                Iterator iterar = clientes.get(index).getHistorialCompras().iterator();
                while (iterar.hasNext()) {
                    HistorialCompras historialCompras = (HistorialCompras) iterar.next();
                    datos[0] = historialCompras.getCodigoArticulo();
                    datos[1] = historialCompras.getCodigoArticulo();
                    datos[2] = historialCompras.getCantidadCompras();
                    datos[3] = historialCompras.getFechaCompra();
                    datos[4] = historialCompras.getTotal();
                    tablaModelo.addRow(datos);
                }
            }
        }
        return tablaModelo;

    }

}
