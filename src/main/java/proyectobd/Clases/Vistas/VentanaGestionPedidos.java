package proyectobd.Clases.Vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;

import proyectobd.Clases.Modelos.Pedidosbd;
import proyectobd.Estetica.Botontransparente;
import proyectobd.Estetica.Campotextotransparente;
import proyectobd.Estetica.Labeltransparente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaGestionPedidos extends javax.swing.JFrame implements ActionListener {
    private Pedidosbd modeloPedidos;

    public VentanaGestionPedidos(Pedidosbd ventanaClientes) {
        this.modeloPedidos = ventanaClientes;
        initComponents();
        this.setSize(675, 675); // NUEVO TAMAÑO
        this.setResizable(false); // Igual que el login
        this.setLocationRelativeTo(null); // Centrar ventana
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        String[] columnas = {"Num_pedido", "encargo", "entrega", "Abono", "Anotacion", "Dni_cliente"};
        jPanel1 = new javax.swing.JPanel();
        Texto_buscar = new Campotextotransparente(1);
        Boton_buscar = new Botontransparente("Buscar");
        Boton_editar = new Botontransparente("Editar");
        Boton_nuevo = new Botontransparente("Nuevo");
        Boton_refrescar = new Botontransparente("Refrescar");
        Nombre_ventana = new Labeltransparente("Clientes");
        jLabel6 = new javax.swing.JLabel();
        modelo = new javax.swing.table.DefaultTableModel(null, columnas){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable1 = new javax.swing.JTable(modelo);
        scroll = new javax.swing.JScrollPane(jTable1);




        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(675, 675));
        setSize(new java.awt.Dimension(675, 675));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(675, 675));
        jPanel1.setMinimumSize(new java.awt.Dimension(675, 675));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(675, 675));
        jPanel1.setLayout(null);

        // jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        // jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/Imagenes/Usuario.png")));
        // jLabel4.setText("Contraseña:");
        // jPanel1.add(jLabel4);
        // jLabel4.setBounds(120, 200, 50, 50);

        Texto_buscar.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Texto_buscar.setForeground(Color.BLACK);
        Texto_buscar.setBounds(255, 20, 190, 50);
        jPanel1.add(Texto_buscar);

        Boton_buscar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        Boton_buscar.setBounds(450, 20, 200, 50);
        Boton_buscar.addActionListener(this);
        jPanel1.add(Boton_buscar);

        Boton_editar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        Boton_editar.setBounds(235, 580, 200, 50);
        Boton_editar.addActionListener(this);
        jPanel1.add(Boton_editar);

        Boton_nuevo.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        Boton_nuevo.setBounds(20, 580, 200, 50);
        Boton_nuevo.addActionListener(this);
        jPanel1.add(Boton_nuevo);

        Boton_refrescar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        Boton_refrescar.setBounds(450, 580, 200, 50);
        Boton_refrescar.addActionListener(this);
        jPanel1.add(Boton_refrescar);

        // jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        // jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/Imagenes/Contraseña.png")));
        // jPanel1.add(jLabel5);
        // jLabel5.setBounds(120, 260, 50, 50);

        Nombre_ventana.setFont(new Font("Segoe UI", Font.BOLD, 26));
        Nombre_ventana.setForeground(Color.BLACK);
        jPanel1.add(Nombre_ventana);
        Nombre_ventana.setBounds(70, 20, 120, 40);
        Nombre_ventana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        for (Object[] fila : modeloPedidos.obtenerPedidos()) {
            modelo.addRow(fila);
        }

        scroll.setBounds(20, 80, 630, 490);
        scroll.setBorder(BorderFactory.createEmptyBorder());
        scroll.getViewport().setOpaque(false);
        scroll.setOpaque(false);
        jTable1.setOpaque(false);
        jTable1.setBackground(new Color(255, 255, 255, 180)); // blanco semi-transparente
        jTable1.setForeground(Color.BLACK);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setBackground(new Color(30, 60, 120));
        jTable1.getTableHeader().setForeground(Color.WHITE);
        jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        jTable1.setSelectionBackground(new Color(30, 60, 120, 180));
        jTable1.setSelectionForeground(Color.WHITE);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(150); // Para la columna 0 (Dni)
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(150);

        jPanel1.add(scroll);
        

        
        
        jLabel6.setMaximumSize(new java.awt.Dimension(675, 675));
        jLabel6.setMinimumSize(new java.awt.Dimension(675, 675));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 675, 675);
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/proyectobd/Imagenes/Fondo4.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    // public static void main(String args[]) {
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new VentanaGestionClientes().setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration
    private javax.swing.JButton Boton_buscar;
    private javax.swing.JButton Boton_editar;
    private javax.swing.JButton Boton_nuevo;
    private javax.swing.JButton Boton_refrescar;
    private javax.swing.JLabel Nombre_ventana;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField Texto_buscar;
    private javax.swing.table.DefaultTableModel modelo;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane scroll;

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == Boton_buscar) {
            int pedido_buscar = Integer.parseInt(Texto_buscar.getText());
            modelo.setRowCount(0);
            for (Object[] fila : modeloPedidos.BuscarPedido(pedido_buscar)) {
                modelo.addRow(fila);
            }
        }

        // else if (e.getSource() == Boton_nuevo) {
        //     VentanaAgregarPedidos va = new VentanaAgregarPedidos(modeloPedidos, this);
        //     va.setVisible(true);
        // }
        else if (e.getSource() == Boton_refrescar) {
            modelo.setRowCount(0);
            for (Object[] fila : modeloPedidos.obtenerPedidos()) {
                modelo.addRow(fila);
            }
        }
        
    }
    
}
