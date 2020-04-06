package articulo;

import clases.ControlFabrica;
import javax.swing.JOptionPane;

/**
 *
 * @author ociel
 */
public class Buscar extends javax.swing.JInternalFrame {

    private ControlFabrica controlFabrica;

    public Buscar(ControlFabrica controlFabrica) {
        this.controlFabrica = controlFabrica;
        initComponents();

        /* Definir componentes */
        grupo.add(codigoButton);
        grupo.add(nombreButton);
        codigoButton.setSelected(true);
        tabla.setModel(controlFabrica.tablaModelo(2, -2));
    }

    public String validarCampos() {
        String error = "";
        if (codigoTexto.getText().isBlank() & nombreTexto.getText().isBlank()) {
            error += "* Completa todos los campos.";
        } else {
            if (codigoButton.isSelected()) {
                try {
                    int valor = Integer.parseInt(codigoTexto.getText());
                } catch (Exception ex) {
                    error += "\n* Código debe ser un valor numérico.";
                }
            }
        }
        return error;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        panel1 = new javax.swing.JPanel();
        codigoLabel = new javax.swing.JLabel();
        codigoTexto = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        codigoButton = new javax.swing.JRadioButton();
        nombreButton = new javax.swing.JRadioButton();
        nombreLabel = new javax.swing.JLabel();
        nombreTexto = new javax.swing.JTextField();
        panel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        cerrar = new javax.swing.JMenu();

        setTitle("Articulos - Buscar");
        setToolTipText("");

        codigoLabel.setText("Código");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        codigoButton.setText("Código");
        codigoButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                codigoButtonItemStateChanged(evt);
            }
        });

        nombreButton.setText("Nombre");
        nombreButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nombreButtonItemStateChanged(evt);
            }
        });

        nombreLabel.setText("Nombre");

        nombreTexto.setEnabled(false);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(codigoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscar))
                    .addComponent(codigoLabel))
                .addGap(11, 11, 11)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoButton)
                    .addComponent(nombreButton))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLabel)
                    .addComponent(nombreTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(nombreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoLabel)
                            .addComponent(codigoButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscar)
                            .addComponent(nombreButton))))
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        cerrar.setText("Cerrar");
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cerrarMousePressed(evt);
            }
        });
        jMenuBar1.add(cerrar);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        String comprobar = validarCampos();
        if (comprobar.isEmpty()) {
            int indice = 0;
            if (codigoButton.isSelected()) {
                int codigo = Integer.parseInt(codigoTexto.getText());
                indice = controlFabrica.buscar(2, codigo);
                if (indice >= 0) {
                    tabla.setModel(controlFabrica.tablaModelo(2, indice));
                } else {
                    tabla.setModel(controlFabrica.tablaModelo(2, -2));
                    JOptionPane.showMessageDialog(panel1, "Articulo no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else if (nombreButton.isSelected()) {
                String nombre = nombreTexto.getText();
                indice = controlFabrica.buscar(3, nombre);
                if (indice >= 0) {
                    tabla.setModel(controlFabrica.tablaModelo(2, indice));
                } else {
                    tabla.setModel(controlFabrica.tablaModelo(2, -2));
                    JOptionPane.showMessageDialog(panel1, "Articulo no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(panel1, comprobar, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_cerrarMousePressed

    private void codigoButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_codigoButtonItemStateChanged
        nombreTexto.setText("");
        nombreTexto.setEnabled(false);
        codigoTexto.setEnabled(true);
    }//GEN-LAST:event_codigoButtonItemStateChanged

    private void nombreButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nombreButtonItemStateChanged
        codigoTexto.setText("");
        codigoTexto.setEnabled(false);
        nombreTexto.setEnabled(true);
    }//GEN-LAST:event_nombreButtonItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JMenu cerrar;
    private javax.swing.JRadioButton codigoButton;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTexto;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton nombreButton;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTexto;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
