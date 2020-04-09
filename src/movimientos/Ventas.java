package movimientos;

import clases.ControlFabrica;
import clases.HistorialCompras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author ociel
 */
public class Ventas extends javax.swing.JInternalFrame {

    // Recoger fecha del sistema
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDateTime now = LocalDateTime.now();

    ControlFabrica controlFabrica;
    //Cuenta los componentes de Texto
    private int contadorField = 0;
    //Define el número de JTextField
    int cantidadArticulos = 20;
    JTextField[] codigosField;
    JTextField[] cantidadField;
    JTextField[] fechasField;
    JLabel[] textos;
    JButton[] botones;
    JTable tabla;
    JTextField rfc;

    //Forma de pago
    String[] formasPago = {"Efectivo", "Crédito", "Débito"};
    JList listarPagos;

    public Ventas(ControlFabrica controlFabrica) {
        this.controlFabrica = controlFabrica;
        initComponents();
        JPanel panel = new JPanel();
        panel.setLayout(null); //Posición libre
        panel.setBounds(0, 0, (int) this.getWidth() + /* Agregar */ 25, 1000); //Coordenadas
        getContentPane().add(panel);

        // Crear componentes
        /* Button */
        botones = new JButton[3];
        botones[0] = new JButton();
        botones[1] = new JButton();
        botones[2] = new JButton();
        botones[0].setText("Comprar");
        botones[1].setText("Agregar");
        botones[2].setText("Quitar");
        botones[0].setBounds(425, 25, 100, 20);
        botones[1].setBounds(425, 50, 100, 20);
        botones[2].setBounds(540, 50, 100, 20);
        botones[2].setEnabled(false); //desactivar Quitar
        panel.add(botones[0]);
        panel.add(botones[1]);
        panel.add(botones[2]);
        /* Label */
        textos = new JLabel[5];
        textos[0] = new JLabel();
        textos[1] = new JLabel();
        textos[2] = new JLabel();
        textos[3] = new JLabel();
        textos[4] = new JLabel();
        textos[0].setText("Código de producto");
        textos[1].setText("Cantidad");
        textos[2].setText("Fecha");
        textos[3].setText("RFC del Cliente");
        textos[4].setText("Forma de pago");
        textos[0].setBounds(25, 5, 125, 20);
        textos[1].setBounds(200, 5, 50, 20);
        textos[2].setBounds(325, 5, 50, 20);
        textos[3].setBounds(540, 5, 125, 20);
        textos[4].setBounds(645, 5, 100, 20);
        panel.add(textos[0]);
        panel.add(textos[1]);
        panel.add(textos[2]);
        panel.add(textos[3]);
        panel.add(textos[4]);

        /* Field */
        rfc = new JTextField();
        rfc.setBounds(540, 25, 100, 20);
        panel.add(rfc);
        codigosField = new JTextField[cantidadArticulos];
        cantidadField = new JTextField[cantidadArticulos];
        fechasField = new JTextField[cantidadArticulos];

        for (int i = 0; i < cantidadArticulos; i++) {
            codigosField[i] = new JTextField();
            cantidadField[i] = new JTextField();
            fechasField[i] = new JTextField();
            codigosField[i].setBounds(25, 25 * (i + 1), 125, 20);
            cantidadField[i].setBounds(175, 25 * (i + 1), 100, 20);
            fechasField[i].setBounds(300, 25 * (i + 1), 100, 20);
            fechasField[i].setText(dtf.format(now));
            panel.add(codigosField[i]);
            panel.add(cantidadField[i]);
            panel.add(fechasField[i]);
            codigosField[i].setVisible(false);
            cantidadField[i].setVisible(false);
            fechasField[i].setVisible(false);
        }

        //Forma de pago
        listarPagos = new JList(formasPago);
        listarPagos.setBounds(645, 25, 100, 55);
        panel.add(listarPagos);

        /* Empezar programa */
        codigosField[0].setVisible(true);
        cantidadField[0].setVisible(true);
        fechasField[0].setVisible(true);
        /* Tabla */
        tabla = new JTable();
        tabla.setModel(controlFabrica.tablaModelo(2, -1));
        tabla.setBounds(0, (int) codigosField[0].getBounds().getY() + 60, this.getWidth(), this.getHeight());
        tabla.setEnabled(false);
        panel.add(tabla);

        /* Escuchadores */
        for (int i = 0; i < botones.length; i++) {
            botones[i].addActionListener(new Escuchadores());
        }
    }

    private class Escuchadores implements ActionListener {

        String error;
        int validaciones;
        int index;
        double total;
        String venta;

        /* [0] Compras | [1] Agregar | [2] Quitar */
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == botones[0]) {
                error = "";
                validaciones = 0;
                for (int i = 0; i <= contadorField; i++) {
                    if (rfc.getText().isBlank()) {
                        error = "Debe llenar el RFC.";
                    }
                    if (listarPagos.getSelectedIndex() == -1) {
                        error = "Debe seleccionar una forma de pago";
                    }
                    if (codigosField[i].getText().isBlank() | cantidadField[i].getText().isBlank() | fechasField[i].getText().isBlank()) {
                        error += "\nDebe llenar todos los campos. [Fila " + (i + 1) + "]";
                        validaciones++;
                    } else {
                        try {
                            if (Integer.parseInt(cantidadField[i].getText()) <= 0) {
                                error += "\nCantidad debe ser mayor a cero. [Fila " + (i + 1) + "]";
                            }
                        } catch (Exception ex) {
                            error += "\nCantidad debe ser numérico entero. [Fila " + (i + 1) + "]";
                            validaciones++;
                        }
                    }
                    if (validaciones > 0) {
                        break;
                    }
                }
                if (error.equals("")) {
                    //0 = Cero errores
                    int validaciones = 0;
                    if (controlFabrica.buscar(1, rfc.getText()) < 0) {
                        error = "RFC no registrado";
                        validaciones++;
                    }
                    for (int i = 0; i <= contadorField; i++) {
                        index = controlFabrica.buscar(2, Integer.parseInt(codigosField[i].getText()));
                        if (index < 0) {
                            error += "\nProducto no encontrado";
                            validaciones++;
                        } else {
                            if (controlFabrica.diferenciaCantidad(index, Integer.parseInt(cantidadField[i].getText()), false)) {
                                error += "\nNo hay tanta cantidad en almacén.";
                                validaciones++;
                            }
                        }
                    }
                    //0 = Cero errores, > 0 hay validaciones fallidas
                    if (validaciones > 0) {
                        JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        //Todo lo anterior es válido, entonces proceder a hacer las cuentas
                        total = 0;
                        int cantidad;
                        for (int i = 0; i <= contadorField; i++) {
                            index = controlFabrica.buscar(2, Integer.parseInt(codigosField[i].getText()));
                            cantidad = Integer.parseInt(cantidadField[i].getText());
                            total += controlFabrica.calcularVenta(index, cantidad);
                        }
                        double descuento = controlFabrica.calcularDescuentos(controlFabrica.buscar(1, rfc.getText()));
                        venta = "Precio sin descuento: " + total + "\nDescuento: " + descuento + "\nPrecio descontado: " + total * descuento + "\nTotal a pagar: " + (total - (total * descuento));
                        int confirmar = JOptionPane.showConfirmDialog(null, venta, "Confirmar compra", JOptionPane.YES_NO_OPTION);
                        // confirmar 0 = Sí
                        if (confirmar == 0) {
                            for (int i = 0; i <= contadorField; i++) {
                                //buscar indice de producto
                                index = controlFabrica.buscar(2, Integer.parseInt(codigosField[i].getText()));
                                //cantidad del producto
                                cantidad = Integer.parseInt(cantidadField[i].getText());
                                //Agregar compra al historial
                                controlFabrica.agregarVenta(controlFabrica.buscar(1, rfc.getText()), new HistorialCompras(cantidad, controlFabrica.getContadorDeCompras(), Integer.parseInt(codigosField[i].getText()), fechasField[i].getText(), listarPagos.getSelectedValue().toString(), controlFabrica.calcularVenta(index, cantidad)));
                                //Aumentar contador de compras
                                controlFabrica.setContadorDeCompras(controlFabrica.getContadorDeCompras() + 1);
                                //Restar cantidad
                                controlFabrica.diferenciaCantidad(index, Integer.parseInt(cantidadField[i].getText()), true);
                                //Aumentar saldo
                                controlFabrica.agregarSaldo(index, controlFabrica.returnSaldo(index) + total - (total * descuento));
                            }
                            JOptionPane.showMessageDialog(null, "Compra realizada con éxito.", "Compra finalizada", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Compra cancelada con éxito.", "Compra finalizada", JOptionPane.ERROR_MESSAGE);
                        }
                        System.out.println(confirmar);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else if (e.getSource() == botones[1]) {
                contadorField++;
                botones[2].setEnabled(true);
                codigosField[contadorField].setVisible(true);
                cantidadField[contadorField].setVisible(true);
                fechasField[contadorField].setVisible(true);
                if (contadorField == cantidadArticulos - 1) {
                    botones[1].setEnabled(false);
                }

                /* Ajustar tabla */
                tabla.setBounds(0, (int) codigosField[contadorField].getBounds().getY() + 60, tabla.getWidth(), tabla.getHeight());
            } else if (e.getSource() == botones[2]) {
                botones[1].setEnabled(true);
                codigosField[contadorField].setVisible(false);
                codigosField[contadorField].setText("");
                cantidadField[contadorField].setVisible(false);
                cantidadField[contadorField].setText("");
                fechasField[contadorField].setVisible(false);
                fechasField[contadorField].setText(dtf.format(now));
                contadorField--;
                if (contadorField == 0) {
                    botones[2].setEnabled(false);
                }
                /* Ajustar tabla */
                tabla.setBounds(0, (int) codigosField[contadorField].getBounds().getY() + 60, tabla.getWidth(), tabla.getHeight());
            }
        }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setTitle("Ventas");
        setPreferredSize(new java.awt.Dimension(1000, 768));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 984, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
