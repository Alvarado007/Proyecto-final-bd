/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectobd.Clases.Vistas;

import proyectobd.Clases.Modelos.Reportesbd;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Equipo Hogar
 */
public class VentanaReportes extends javax.swing.JFrame {
    
    public Reportesbd modeloReportes = new Reportesbd();

    // Declaramos los modelos aquí para poder usarlos en las consultas SQL
    DefaultTableModel modelPendientes;
    DefaultTableModel modelClientes;
    DefaultTableModel modelInventario;
    DefaultTableModel modelColegios;
    DefaultTableModel modelUniformes;
    DefaultTableModel modelProductosColegio;
    DefaultTableModel modelDeudores;
    DefaultTableModel modelAtrasados;

    /**
     * Creates new form VentanaReportes
     */
    public VentanaReportes() {
        initComponents(); // Carga la interfaz gráfica
        initTabListener(); // Carga el detector de cambio de pestaña
        
        // Opcional: Cargar la primera pestaña al abrir la ventana
        cargarDatosPendientes(); 
    }

    /**
     * MÉTODO CLAVE: Aquí detectamos cuando el usuario cambia de tab.
     */
    private void initTabListener() {
        jTabbedPane1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int index = jTabbedPane1.getSelectedIndex();
                
                // Switch para determinar qué pestaña se seleccionó
                switch (index) {
                    case 0: // Pestaña: Productos Pendientes
                        cargarDatosPendientes();
                        break;
                    case 1: // Pestaña: Pedidos por Cliente
                        cargarDatosClientes();
                        break;
                    case 2: // Pestaña: Inventario
                        cargarDatosInventario();
                        break;
                    case 3: // Pestaña: Colegios
                        cargarDatosColegios();
                        break;
                    case 4: // Pestaña: Uniformes por Colegio
                        cargarDatosUniformes();
                        break;
                    case 5: // Pestaña: Productos por Colegio
                        cargarDatosProdPorColegio();
                        break;
                    case 6: // Pestaña: Total Ventas
                        cargarDatosTotalVentas();
                        break;
                    case 7: // Pestaña: Listado Deudores
                        cargarDatosDeudores();
                        break;
                    case 8: // Pestaña: Pedidos Atrasados
                        cargarDatosAtrasados();
                        break;
                    default:
                        break;
                }
            }
        });
    }

    // -------------------------------------------------------------------------
    // --- ZONA DE MÉTODOS PARA TUS CONSULTAS SQL ---
    // -------------------------------------------------------------------------

    private void cargarDatosPendientes() {
        // Limpiar tabla antes de cargar
        modelPendientes.setRowCount(0); 
        for (Object[] fila : modeloReportes.Reporte1()) {
            modelPendientes.addRow(fila);
        }
        // TODO: AQUÍ VA TU CÓDIGO SQL PARA LLENAR jTable1 / modelPendientes
    }

    private void cargarDatosClientes() {
        modelClientes.setRowCount(0);
        for (Object[] fila : modeloReportes.Reporte2()) {
            modelClientes.addRow(fila);
        }
        // TODO: AQUÍ VA TU CÓDIGO SQL PARA LLENAR jTable2 / modelClientes
    }

    private void cargarDatosInventario() {
        modelInventario.setRowCount(0);
        for (Object[] fila : modeloReportes.Reporte3()) {
            modelInventario.addRow(fila);
        }
        // TODO: AQUÍ VA TU CÓDIGO SQL PARA LLENAR jTable3 / modelInventario
    }

    private void cargarDatosColegios() {
        modelColegios.setRowCount(0);
        System.out.println("Cargando SQL para Colegios...");
        // TODO: AQUÍ VA TU CÓDIGO SQL PARA LLENAR jTable4 / modelColegios
    }

    private void cargarDatosUniformes() {
        modelUniformes.setRowCount(0);
        System.out.println("Cargando SQL para Uniformes...");
        // TODO: AQUÍ VA TU CÓDIGO SQL PARA LLENAR jTable5 / modelUniformes
    }

    private void cargarDatosProdPorColegio() {
        modelProductosColegio.setRowCount(0);
        System.out.println("Cargando SQL para Productos por Colegio...");
        // TODO: AQUÍ VA TU CÓDIGO SQL PARA LLENAR jTable6 / modelProductosColegio
    }

    private void cargarDatosTotalVentas() {
        System.out.println("Calculando Total Ventas...");
        // TODO: AQUÍ TU LOGICA PARA CALCULAR EL TOTAL Y PONERLO EN EL JLABEL
        // jLabel2.setText("$$$");
    }

    private void cargarDatosDeudores() {
        modelDeudores.setRowCount(0);
        System.out.println("Cargando SQL para Deudores...");
        // TODO: AQUÍ VA TU CÓDIGO SQL PARA LLENAR jTable7 / modelDeudores
    }

    private void cargarDatosAtrasados() {
        modelAtrasados.setRowCount(0);
        System.out.println("Cargando SQL para Atrasados...");
        // TODO: AQUÍ VA TU CÓDIGO SQL PARA LLENAR jTable8 / modelAtrasados
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        PanelFondoMenuPrincipalAdmin = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelPedidosPendientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        panelPedidosCliente = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        panelinventarioProductos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        panelColegios = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        panelUniformesColegio = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        panelProductosPorColegio = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        panelTotalVentas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelListadoDeudores = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        panelPedidosAtrasados = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        ButtonRefrescar = new javax.swing.JButton();
        ButtonRegresar = new javax.swing.JButton();
        LabelFondoMenuAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(675, 675));
        setMinimumSize(new java.awt.Dimension(675, 675));
        setResizable(false);

        PanelFondoMenuPrincipalAdmin.setMaximumSize(new java.awt.Dimension(675, 675));
        PanelFondoMenuPrincipalAdmin.setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setOpaque(true);

        panelPedidosPendientes.setBackground(new java.awt.Color(153, 153, 153));

        jTable1.setBackground(new java.awt.Color(153, 255, 255));
        // CORRECCION: Inicialización con 0 filas para datos dinámicos
        modelPendientes = new DefaultTableModel(
            new Object [][] {}, // Empieza vacío
            new String [] { "Código", "Descripción", "Fecha de Encargo" }
        );
        jTable1.setModel(modelPendientes);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panelPedidosPendientesLayout = new javax.swing.GroupLayout(panelPedidosPendientes);
        panelPedidosPendientes.setLayout(panelPedidosPendientesLayout);
        panelPedidosPendientesLayout.setHorizontalGroup(
            panelPedidosPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidosPendientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPedidosPendientesLayout.setVerticalGroup(
            panelPedidosPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidosPendientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Productos Pendientes", panelPedidosPendientes);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setBackground(new java.awt.Color(153, 255, 255));
        // CORRECCION: Inicialización con 0 filas
        modelClientes = new DefaultTableModel(
            new Object [][] {},
            new String [] { "Nombre", "Código", "Descripción", "Fecha de Encargo" }
        );
        jTable2.setModel(modelClientes);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout panelPedidosClienteLayout = new javax.swing.GroupLayout(panelPedidosCliente);
        panelPedidosCliente.setLayout(panelPedidosClienteLayout);
        panelPedidosClienteLayout.setHorizontalGroup(
            panelPedidosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPedidosClienteLayout.setVerticalGroup(
            panelPedidosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pedidos por Cliente", panelPedidosCliente);

        jTable3.setBackground(new java.awt.Color(153, 255, 255));
        // CORRECCION: Inicialización con 0 filas
        modelInventario = new DefaultTableModel(
            new Object [][] {},
            new String [] { "Descripción", "Cantidad" }
        );
        jTable3.setModel(modelInventario);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout panelinventarioProductosLayout = new javax.swing.GroupLayout(panelinventarioProductos);
        panelinventarioProductos.setLayout(panelinventarioProductosLayout);
        panelinventarioProductosLayout.setHorizontalGroup(
            panelinventarioProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinventarioProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelinventarioProductosLayout.setVerticalGroup(
            panelinventarioProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinventarioProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inventario de Productos", panelinventarioProductos);

        jTable4.setBackground(new java.awt.Color(153, 255, 255));
        // CORRECCION: Inicialización con 0 filas
        modelColegios = new DefaultTableModel(
            new Object [][] {},
            new String [] { "Nombre" }
        );
        jTable4.setModel(modelColegios);
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout panelColegiosLayout = new javax.swing.GroupLayout(panelColegios);
        panelColegios.setLayout(panelColegiosLayout);
        panelColegiosLayout.setHorizontalGroup(
            panelColegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColegiosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelColegiosLayout.setVerticalGroup(
            panelColegiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelColegiosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Colegios", panelColegios);

        jTable5.setBackground(new java.awt.Color(153, 255, 255));
        // CORRECCION: Inicialización con 0 filas
        modelUniformes = new DefaultTableModel(
            new Object [][] {},
            new String [] { "Nombre", "Tipo", "Color", "Tipo Tela", "Bordado Nombre", "Escudo" }
        );
        jTable5.setModel(modelUniformes);
        jScrollPane5.setViewportView(jTable5);

        jTextField1.setBackground(new java.awt.Color(102, 255, 255));
        jTextField1.setText("jTextField1");

        jButton2.setBackground(new java.awt.Color(102, 255, 255));
        jButton2.setText("Buscar");

        javax.swing.GroupLayout panelUniformesColegioLayout = new javax.swing.GroupLayout(panelUniformesColegio);
        panelUniformesColegio.setLayout(panelUniformesColegioLayout);
        panelUniformesColegioLayout.setHorizontalGroup(
            panelUniformesColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUniformesColegioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUniformesColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(panelUniformesColegioLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelUniformesColegioLayout.setVerticalGroup(
            panelUniformesColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUniformesColegioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelUniformesColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Uniformes por Colegio", panelUniformesColegio);

        jTable6.setBackground(new java.awt.Color(153, 255, 255));
        // CORRECCION: Inicialización con 0 filas
        modelProductosColegio = new DefaultTableModel(
            new Object [][] {},
            new String [] { "Nombre", "Cantidad" }
        );
        jTable6.setModel(modelProductosColegio);
        jScrollPane6.setViewportView(jTable6);

        javax.swing.GroupLayout panelProductosPorColegioLayout = new javax.swing.GroupLayout(panelProductosPorColegio);
        panelProductosPorColegio.setLayout(panelProductosPorColegioLayout);
        panelProductosPorColegioLayout.setHorizontalGroup(
            panelProductosPorColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosPorColegioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelProductosPorColegioLayout.setVerticalGroup(
            panelProductosPorColegioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosPorColegioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Productos por Colegio", panelProductosPorColegio);

        jLabel1.setBackground(new java.awt.Color(153, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Total de Ventas");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(153, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Resultado");
        jLabel2.setOpaque(true);

        javax.swing.GroupLayout panelTotalVentasLayout = new javax.swing.GroupLayout(panelTotalVentas);
        panelTotalVentas.setLayout(panelTotalVentasLayout);
        panelTotalVentasLayout.setHorizontalGroup(
            panelTotalVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTotalVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTotalVentasLayout.setVerticalGroup(
            panelTotalVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(387, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Total de Ventas", panelTotalVentas);

        jTable7.setBackground(new java.awt.Color(153, 255, 255));
        // CORRECCION: Inicialización con 0 filas
        modelDeudores = new DefaultTableModel(
            new Object [][] {},
            new String [] { "Nombre", "Num Pedido", "Total", "Abono", "Saldo Pendiente" }
        );
        jTable7.setModel(modelDeudores);
        jScrollPane7.setViewportView(jTable7);

        javax.swing.GroupLayout panelListadoDeudoresLayout = new javax.swing.GroupLayout(panelListadoDeudores);
        panelListadoDeudores.setLayout(panelListadoDeudoresLayout);
        panelListadoDeudoresLayout.setHorizontalGroup(
            panelListadoDeudoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListadoDeudoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelListadoDeudoresLayout.setVerticalGroup(
            panelListadoDeudoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListadoDeudoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listado Deudores", panelListadoDeudores);

        jTable8.setBackground(new java.awt.Color(153, 255, 255));
        // CORRECCION: Inicialización con 0 filas
        modelAtrasados = new DefaultTableModel(
            new Object [][] {},
            new String [] { "Nombre", "Num Pedido", "Fecha Encargo", "Dias Transcurridos", "Fecha Actual" }
        );
        jTable8.setModel(modelAtrasados);
        jScrollPane8.setViewportView(jTable8);

        javax.swing.GroupLayout panelPedidosAtrasadosLayout = new javax.swing.GroupLayout(panelPedidosAtrasados);
        panelPedidosAtrasados.setLayout(panelPedidosAtrasadosLayout);
        panelPedidosAtrasadosLayout.setHorizontalGroup(
            panelPedidosAtrasadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidosAtrasadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPedidosAtrasadosLayout.setVerticalGroup(
            panelPedidosAtrasadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidosAtrasadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pedidos Atrasados", panelPedidosAtrasados);

        PanelFondoMenuPrincipalAdmin.add(jTabbedPane1);
        jTabbedPane1.setBounds(20, 20, 630, 570);

        ButtonRefrescar.setText("Refrescar");
        PanelFondoMenuPrincipalAdmin.add(ButtonRefrescar);
        ButtonRefrescar.setBounds(460, 610, 200, 50);

        ButtonRegresar.setText("Regresar");
        PanelFondoMenuPrincipalAdmin.add(ButtonRegresar);
        ButtonRegresar.setBounds(240, 610, 200, 50);

        LabelFondoMenuAdmin.setBackground(new java.awt.Color(102, 102, 102));
        LabelFondoMenuAdmin.setOpaque(true);
        PanelFondoMenuPrincipalAdmin.add(LabelFondoMenuAdmin);
        LabelFondoMenuAdmin.setBounds(0, 0, 675, 675);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondoMenuPrincipalAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondoMenuPrincipalAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaReportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton ButtonRefrescar;
    private javax.swing.JButton ButtonRegresar;
    private javax.swing.JLabel LabelFondoMenuAdmin;
    private javax.swing.JPanel PanelFondoMenuPrincipalAdmin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel panelColegios;
    private javax.swing.JPanel panelListadoDeudores;
    private javax.swing.JPanel panelPedidosAtrasados;
    private javax.swing.JPanel panelPedidosCliente;
    private javax.swing.JPanel panelPedidosPendientes;
    private javax.swing.JPanel panelProductosPorColegio;
    private javax.swing.JPanel panelTotalVentas;
    private javax.swing.JPanel panelUniformesColegio;
    private javax.swing.JPanel panelinventarioProductos;
    // End of variables declaration                   
}