package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author ociel
 */
public class Programa extends javax.swing.JFrame {

    ControlFabrica controlFabrica;

    public Programa() {
        this.controlFabrica = new ControlFabrica();
        initComponents();
        setVisible(true);

        /* Valores */
        controlFabrica.altas(1, new Clientes("Ociel", "Cd. del Sol Andadador 4 Casa 2B", "GAPO001206HGTRDCA7", "Tarjeta Dorada", 5000));
        controlFabrica.altas(1, new Clientes("Axel", "Cd. del Sol Andadador 4 Casa 2B", "GAPO001206HGTRDCA8", "Tarjeta Dorada", 5000));
        controlFabrica.altas(2, new Articulos("Calzon", "CR7", "Dorado", "Freemium", 280, 2, 1));
        controlFabrica.altas(2, new Articulos("Aczino", "CR7", "Dorado", "Freemium", 281, 2, 1));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        clientes = new javax.swing.JMenu();
        clientesAltas = new javax.swing.JMenuItem();
        clientesBajas = new javax.swing.JMenuItem();
        clientesCambios = new javax.swing.JMenuItem();
        clientesBuscar = new javax.swing.JMenuItem();
        clientesAbonos = new javax.swing.JMenuItem();
        clientesHistorialCompras = new javax.swing.JMenuItem();
        clientesCatalogoProductos = new javax.swing.JMenuItem();
        articulos = new javax.swing.JMenu();
        articulosAltas = new javax.swing.JMenuItem();
        articulosBajas = new javax.swing.JMenuItem();
        articulosCambios = new javax.swing.JMenuItem();
        articulosBuscar = new javax.swing.JMenuItem();
        articulosCatalogoArticulos = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        movimientosCompras = new javax.swing.JMenuItem();
        movimientosVentas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        movimientosReporteGeneral = new javax.swing.JMenuItem();
        movimientosReporteAlfabetico = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 378, Short.MAX_VALUE)
        );

        clientes.setText("Clientes");

        clientesAltas.setText("Altas");
        clientesAltas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesAltasMousePressed(evt);
            }
        });
        clientes.add(clientesAltas);

        clientesBajas.setText("Bajas");
        clientesBajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesBajasMousePressed(evt);
            }
        });
        clientes.add(clientesBajas);

        clientesCambios.setText("Cambios");
        clientesCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesCambiosMousePressed(evt);
            }
        });
        clientes.add(clientesCambios);

        clientesBuscar.setText("Buscar");
        clientesBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesBuscarMousePressed(evt);
            }
        });
        clientes.add(clientesBuscar);

        clientesAbonos.setText("Abonos");
        clientes.add(clientesAbonos);

        clientesHistorialCompras.setText("Historial de compras");
        clientesHistorialCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesHistorialComprasMousePressed(evt);
            }
        });
        clientes.add(clientesHistorialCompras);

        clientesCatalogoProductos.setText("Catalogo de Clientes");
        clientesCatalogoProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesCatalogoProductosMousePressed(evt);
            }
        });
        clientes.add(clientesCatalogoProductos);

        jMenuBar1.add(clientes);

        articulos.setText("Articulos");

        articulosAltas.setText("Altas");
        articulosAltas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                articulosAltasMousePressed(evt);
            }
        });
        articulos.add(articulosAltas);

        articulosBajas.setText("Bajas");
        articulosBajas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                articulosBajasMousePressed(evt);
            }
        });
        articulos.add(articulosBajas);

        articulosCambios.setText("Cambios");
        articulosCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                articulosCambiosMousePressed(evt);
            }
        });
        articulos.add(articulosCambios);

        articulosBuscar.setText("Buscar");
        articulosBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                articulosBuscarMousePressed(evt);
            }
        });
        articulos.add(articulosBuscar);

        articulosCatalogoArticulos.setText("Catalogo de articulos");
        articulosCatalogoArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                articulosCatalogoArticulosMousePressed(evt);
            }
        });
        articulos.add(articulosCatalogoArticulos);

        jMenuBar1.add(articulos);

        jMenu1.setText("Movimientos");

        movimientosCompras.setText("Compras");
        movimientosCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movimientosComprasMousePressed(evt);
            }
        });
        jMenu1.add(movimientosCompras);

        movimientosVentas.setText("Ventas");
        jMenu1.add(movimientosVentas);

        jMenu2.setText("Reportes");

        movimientosReporteGeneral.setText("General");
        jMenu2.add(movimientosReporteGeneral);

        movimientosReporteAlfabetico.setText("Alfabetico");
        jMenu2.add(movimientosReporteAlfabetico);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        salir.setText("Salir");
        jMenuBar1.add(salir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientesAltasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesAltasMousePressed
        cliente.Altas altas = new cliente.Altas(controlFabrica);
        escritorio.add(altas);
        altas.setVisible(true);
    }//GEN-LAST:event_clientesAltasMousePressed

    private void articulosAltasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articulosAltasMousePressed
        articulo.Altas altas = new articulo.Altas(controlFabrica);
        escritorio.add(altas);
        altas.setVisible(true);
    }//GEN-LAST:event_articulosAltasMousePressed

    private void articulosBajasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articulosBajasMousePressed
        if (controlFabrica.contarElementos(2) != 0) {
            articulo.Bajas bajas = new articulo.Bajas(controlFabrica);
            escritorio.add(bajas);
            bajas.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(escritorio, "No hay articulos registrados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_articulosBajasMousePressed

    private void clientesBajasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesBajasMousePressed
        if (controlFabrica.contarElementos(1) != 0) {
            cliente.Bajas bajas = new cliente.Bajas(controlFabrica);
            escritorio.add(bajas);
            bajas.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(escritorio, "No hay clientes registrados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_clientesBajasMousePressed

    private void clientesCambiosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesCambiosMousePressed
        if (controlFabrica.contarElementos(1) != 0) {
            cliente.Cambios cambios = new cliente.Cambios(controlFabrica);
            escritorio.add(cambios);
            cambios.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(escritorio, "No hay clientes registrados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_clientesCambiosMousePressed

    private void articulosCambiosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articulosCambiosMousePressed
        if (controlFabrica.contarElementos(2) != 0) {
            articulo.Cambios cambios = new articulo.Cambios(controlFabrica);
            escritorio.add(cambios);
            cambios.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(escritorio, "No hay articulos registrados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_articulosCambiosMousePressed

    private void clientesBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesBuscarMousePressed
        if (controlFabrica.contarElementos(1) != 0) {
            cliente.Buscar buscar = new cliente.Buscar(controlFabrica);
            escritorio.add(buscar);
            buscar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(escritorio, "No hay clientes registrados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_clientesBuscarMousePressed

    private void articulosBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articulosBuscarMousePressed
        if (controlFabrica.contarElementos(2) != 0) {
            articulo.Buscar buscar = new articulo.Buscar(controlFabrica);
            escritorio.add(buscar);
            buscar.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(escritorio, "No hay articulos registrados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_articulosBuscarMousePressed

    private void articulosCatalogoArticulosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articulosCatalogoArticulosMousePressed
        if (controlFabrica.contarElementos(2) != 0) {
            articulo.catalogoArticulos catalogo = new articulo.catalogoArticulos(controlFabrica);
            escritorio.add(catalogo);
            catalogo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(escritorio, "No hay articulos registrados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_articulosCatalogoArticulosMousePressed

    private void clientesCatalogoProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesCatalogoProductosMousePressed
        if (controlFabrica.contarElementos(1) != 0) {
            cliente.catalogoClientes catalogo = new cliente.catalogoClientes(controlFabrica);
            escritorio.add(catalogo);
            catalogo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(escritorio, "No hay clientes registrados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_clientesCatalogoProductosMousePressed

    private void clientesHistorialComprasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesHistorialComprasMousePressed
        if (controlFabrica.contarElementos(1) != 0) {
            cliente.HistorialCompra historialCompra = new cliente.HistorialCompra(controlFabrica);
            escritorio.add(historialCompra);
            historialCompra.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(escritorio, "No hay clientes registrados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_clientesHistorialComprasMousePressed

    private void movimientosComprasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movimientosComprasMousePressed
        if (controlFabrica.contarElementos(2) != 0) {
            movimientos.Compras compras = new movimientos.Compras(controlFabrica);
            escritorio.add(compras);
            compras.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(escritorio, "No hay articulos registrados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_movimientosComprasMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu articulos;
    private javax.swing.JMenuItem articulosAltas;
    private javax.swing.JMenuItem articulosBajas;
    private javax.swing.JMenuItem articulosBuscar;
    private javax.swing.JMenuItem articulosCambios;
    private javax.swing.JMenuItem articulosCatalogoArticulos;
    private javax.swing.JMenu clientes;
    private javax.swing.JMenuItem clientesAbonos;
    private javax.swing.JMenuItem clientesAltas;
    private javax.swing.JMenuItem clientesBajas;
    private javax.swing.JMenuItem clientesBuscar;
    private javax.swing.JMenuItem clientesCambios;
    private javax.swing.JMenuItem clientesCatalogoProductos;
    private javax.swing.JMenuItem clientesHistorialCompras;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem movimientosCompras;
    private javax.swing.JMenuItem movimientosReporteAlfabetico;
    private javax.swing.JMenuItem movimientosReporteGeneral;
    private javax.swing.JMenuItem movimientosVentas;
    private javax.swing.JMenu salir;
    // End of variables declaration//GEN-END:variables
}
