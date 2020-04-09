package movimientos;

import clases.ControlFabrica;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ociel
 */
public class Compras extends javax.swing.JInternalFrame {

    private ControlFabrica controlFabrica;
    String error;
    int index = -1;

    public Compras(ControlFabrica controlFabrica) {
        this.controlFabrica = controlFabrica;
        initComponents();

        /* Agrupar */
        grupo.add(nombre);
        grupo.add(codigo);

        /* Ocultar componentes */
        cantidadLabel.setVisible(false);
        cantidad.setVisible(false);
        comprar.setVisible(false);
        cambiarProd.setVisible(false);

        /* Escuchadores */
        nombre.addItemListener(new Escuchador());
        codigo.addItemListener(new Escuchador());
        nombre.setSelected(true);

        /* Cargar columnas de la tabla */
        tabla.setModel(controlFabrica.tablaModelo(2, -2));
    }

    private class Escuchador implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if (e.getItem() == nombre) {
                textoLabel.setText("Nombre del producto");
            } else {
                textoLabel.setText("Código del producto");
            }
        }
    }

    public String comprobar() {
        error = "";
        if (texto.getText().isBlank()) {
            error += "No deben haber campos vacíos.";
        }
        if (codigo.isSelected()) {
            try {
                Integer.parseInt(texto.getText());
            } catch (Exception ex) {
                error += "\nEl código debe ser numérico.";
            }
        }
        return error;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        panel1 = new javax.swing.JPanel();
        textoLabel = new javax.swing.JLabel();
        texto = new javax.swing.JTextField();
        nombre = new javax.swing.JRadioButton();
        codigo = new javax.swing.JRadioButton();
        buscar = new javax.swing.JButton();
        cantidadLabel = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        comprar = new javax.swing.JButton();
        cambiarProd = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        salir = new javax.swing.JMenu();

        setTitle("Compras");

        textoLabel.setText("Texto");

        nombre.setText("Nombre");

        codigo.setText("Código");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        cantidadLabel.setText("Cantidad");

        comprar.setText("Comprar");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });

        cambiarProd.setText("Cambiar producto");
        cambiarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoLabel)
                            .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre)
                            .addComponent(codigo))
                        .addGap(18, 18, 18)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadLabel)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comprar))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(buscar)
                        .addGap(28, 28, 28)
                        .addComponent(cambiarProd)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre)
                            .addComponent(cantidadLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigo)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comprar)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(textoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscar)
                    .addComponent(cambiarProd))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setEnabled(false);
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        salir.setText("Salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirMousePressed(evt);
            }
        });
        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String comprobar = comprobar();
        int index = -1;
        if (comprobar.equals("")) {
            if (nombre.isSelected()) {
                index = controlFabrica.buscar(2, texto.getText());
            } else if (codigo.isSelected()) {
                int codigo = Integer.parseInt(texto.getText());
                index = controlFabrica.buscar(2, codigo);
            }
            if (index >= 0) {
                tabla.setModel(controlFabrica.tablaModelo(2, index));
                cantidadLabel.setVisible(true);
                cantidad.setVisible(true);
                comprar.setVisible(true);
                cambiarProd.setVisible(true);
                texto.setEnabled(false);
                buscar.setEnabled(false);
                nombre.setEnabled(false);
                codigo.setEnabled(false);
                this.index = index;

            } else {
                if (nombre.isSelected()) {
                    JOptionPane.showMessageDialog(panel1, "No hay productos registrados con ese nombre.", "Error", JOptionPane.INFORMATION_MESSAGE);
                } else if (codigo.isSelected()) {
                    JOptionPane.showMessageDialog(panel1, "No hay productos registrados con ese código.", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(panel1, comprobar, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_buscarActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        String error = "";
        if (cantidad.getText().isBlank()) {
            error += "La cantidad no puede estar vacía.";
        } else {
            try {
                int existencias = Integer.parseInt(cantidad.getText());
                if (existencias > 0) {
                    controlFabrica.comprar(index, existencias);
                    tabla.setModel(controlFabrica.tablaModelo(2, index));
                    cantidad.setText("");
                } else {
                    error += "La cantidad debe ser positiva.";
                }
            } catch (Exception ex) {
                error += "La cantidad debe ser numérica.";
            }
        }
    }//GEN-LAST:event_comprarActionPerformed

    private void cambiarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarProdActionPerformed
        cantidadLabel.setVisible(false);
        cantidad.setText("");
        cantidad.setVisible(false);
        comprar.setVisible(false);
        cambiarProd.setVisible(false);
        texto.setEnabled(true);
        buscar.setEnabled(true);
        nombre.setEnabled(true);
        codigo.setEnabled(true);
        tabla.setModel(controlFabrica.tablaModelo(2, -2));
    }//GEN-LAST:event_cambiarProdActionPerformed

    private void salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_salirMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton cambiarProd;
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel cantidadLabel;
    private javax.swing.JRadioButton codigo;
    private javax.swing.JButton comprar;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton nombre;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JMenu salir;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField texto;
    private javax.swing.JLabel textoLabel;
    // End of variables declaration//GEN-END:variables
}
