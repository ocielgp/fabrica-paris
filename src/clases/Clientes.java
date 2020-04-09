package clases;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author ociel
 */
public class Clientes implements Descuentos {

    private String nombreORS, domicilio, RFC, tipoCliente;
    private double saldo;
    private ArrayList<HistorialCompras> historialCompras = new ArrayList();

    public Clientes(String nombreORS, String domicilio, String RFC, String tipoCliente, double saldo) {
        this.nombreORS = nombreORS;
        this.domicilio = domicilio;
        this.RFC = RFC;
        this.tipoCliente = tipoCliente;
        this.saldo = saldo;
    }

    public ArrayList<HistorialCompras> getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(HistorialCompras historialCompras) {
        this.historialCompras.add(historialCompras);
    }

    @Override
    public double otrosDescuentos() {
        if (tipoCliente.equals("Dorada")) {
            if (historialCompras.size() > 20 | saldo > 50000) {
                return tDorada + 0.03;
            } else {
                return tDorada;
            }
        } else if (tipoCliente.equals("Plateada")) {
            if (saldo > 50000) {
                return tPlateada + 0.015;
            } else {
                return tPlateada;
            }
        } else if (tipoCliente.equals("Blanca")) {
            if (saldo > 30000) {
                return tBlanca + 0.01;
            } else {
                return tBlanca;
            }
        }
        return 0;
    }

    public String getNombreORS() {
        return nombreORS;
    }

    public void setNombreORS(String nombreORS) {
        this.nombreORS = nombreORS;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombreORS=" + nombreORS + ", domicilio=" + domicilio + ", RFC=" + RFC + ", tipoCliente=" + tipoCliente + ", saldo=" + saldo + ", historialCompras=" + historialCompras + '}';
    }

    public static Comparator<Clientes> compareRFC = new Comparator<Clientes>() {
        @Override
        public int compare(Clientes c1, Clientes c2) {
            return (int) c1.getRFC().compareToIgnoreCase(c2.getRFC());
        }
    };

}
