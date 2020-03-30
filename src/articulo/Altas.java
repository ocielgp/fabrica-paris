package articulo;

import clases.ControlFabrica;
import javax.swing.JOptionPane;

/**
 *
 * @author ociel
 */
public class Altas extends javax.swing.JInternalFrame {

    private ControlFabrica controlFabrica;
    private String[] categorias = {"Muebles", "Electrónica", "Ropa", "Juguetes", "Accesorios", "Perfumeria"};

    public Altas(ControlFabrica controlFabrica) {
        this.controlFabrica = controlFabrica;
        initComponents();

        /* Definir componentes */
        categoriaLista.setListData(this.categorias);
    }

    public String validarCampos() {
        String error = "";
        if (nombreTexto.getText().equals("") | marcaTexto.getText().equals("") | descripcionTexto.getText().equals("") | existenciasTexto.getText().equals("") | categoriaLista.getSelectedValue() == null | codigoTexto.getText().equals("") | precioVentaTexto.getText().equals("")) {
            error += "* Completa todos los campos.";
        } else {
            try {
                int valor = Integer.parseInt(existenciasTexto.getText());
                if (valor < 0) {
                    error += "\n* Existencias no puede ser negativo.";
                }

            } catch (Exception ex) {
                error += "\n* Existencias debe ser un valor numérico.";
            }

            try {
                int valor = Integer.parseInt(codigoTexto.getText());
                if (valor < 0) {
                    error += "\n* Código no puede ser negativo.";
                }
            } catch (Exception ex) {
                error += "\n* El código debe ser numérico.";
            }
            try {
                double valor = Double.parseDouble(precioVentaTexto.getText());
                if (valor < 0) {
                    error += "\n* El precio de venta no puede ser negativo.";
                }
            } catch (Exception ex) {
                error += "\n* El precio de venta debe ser numérico.";
            }
        }
        return error;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        nombreLabel = new javax.swing.JLabel();
        nombreTexto = new javax.swing.JTextField();
        marcaLabel = new javax.swing.JLabel();
        marcaTexto = new javax.swing.JTextField();
        descripcionLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcionTexto = new javax.swing.JTextArea();
        existenciasLabel = new javax.swing.JLabel();
        existenciasTexto = new javax.swing.JTextField();
        categoriaLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        categoriaLista = new javax.swing.JList<>();
        codigoLabel = new javax.swing.JLabel();
        codigoTexto = new javax.swing.JTextField();
        precioVentaLabel = new javax.swing.JLabel();
        precioVentaTexto = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        cerrar = new javax.swing.JMenu();

        setTitle("Articulos - Altas");

        nombreLabel.setText("Nombre");

        marcaLabel.setText("Marca");

        descripcionLabel.setText("Descripción");

        descripcionTexto.setColumns(20);
        descripcionTexto.setLineWrap(true);
        descripcionTexto.setRows(5);
        jScrollPane2.setViewportView(descripcionTexto);

        existenciasLabel.setText("Existencias");

        categoriaLabel.setText("Categoria");

        categoriaLista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(categoriaLista);

        codigoLabel.setText("Código");

        precioVentaLabel.setText("Precio de Venta");

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nombreLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombreTexto, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(marcaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(marcaTexto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                        .addComponent(descripcionLabel, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(existenciasLabel)
                    .addComponent(existenciasTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoriaLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(codigoLabel)
                            .addComponent(codigoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precioVentaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(precioVentaLabel)))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(agregar)))
                .addGap(53, 53, 53))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(categoriaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(nombreTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marcaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(marcaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descripcionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(existenciasLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(existenciasTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigoTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precioVentaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precioVentaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(agregar)))
                .addGap(29, 29, 29))
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
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        String comprobar = validarCampos();
        if (comprobar.equals("")) {
            if (controlFabrica.altas(2, new clases.Articulos(nombreTexto.getText(), marcaTexto.getText(), descripcionTexto.getText(), categoriaLista.getSelectedValue(), Integer.parseInt(codigoTexto.getText()), Integer.parseInt(existenciasTexto.getText()), Double.parseDouble(precioVentaTexto.getText())))) {
                JOptionPane.showMessageDialog(panel, "Datos agregados correctamente.", "Datos agregados", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(panel, comprobar, "Error al agregar datos", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_cerrarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JList<String> categoriaLista;
    private javax.swing.JMenu cerrar;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField codigoTexto;
    private javax.swing.JLabel descripcionLabel;
    private javax.swing.JTextArea descripcionTexto;
    private javax.swing.JLabel existenciasLabel;
    private javax.swing.JTextField existenciasTexto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel marcaLabel;
    private javax.swing.JTextField marcaTexto;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreTexto;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel precioVentaLabel;
    private javax.swing.JTextField precioVentaTexto;
    // End of variables declaration//GEN-END:variables
}
