package proyectobd.Clases.Vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import proyectobd.Clases.Modelos.Clientesbd;
import proyectobd.Clases.Modelos.Colegiosbd;
import proyectobd.Clases.Modelos.Facturacionbd;
import proyectobd.Clases.Modelos.Login;
import proyectobd.Clases.Modelos.MateriasPrimasbd;
import proyectobd.Clases.Modelos.Pedidosbd;
import proyectobd.Clases.Modelos.ProductosTerminadosbd;
import proyectobd.Clases.Modelos.Proveedoresbd;
import proyectobd.Clases.Modelos.Uniformesbd;
import proyectobd.Clases.Modelos.Usuariosbd;
import proyectobd.Estetica.Botontransparente;
import proyectobd.Estetica.Labeltransparente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class VentanaMenu extends javax.swing.JFrame implements ActionListener {

    public VentanaMenu() {
        initComponents();
        this.setSize(675, 675); // NUEVO TAMAÑO
        this.setResizable(false); // Igual que el login
        this.setLocationRelativeTo(null); // Centrar ventana
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Clientes = new Botontransparente("Clientes");
        Pedidos = new Botontransparente("Pedidos");
        // jButton3 = new javax.swing.JButton();
        // jButton4 = new javax.swing.JButton();
        // jButton5 = new javax.swing.JButton()
        Titulo = new Labeltransparente("Menu Principal");
        jLabel6 = new javax.swing.JLabel();
        Cerrarsesion = new Botontransparente("Cerrar sesión");
        Colegios = new Botontransparente("Colegios");
        Facturacion = new Botontransparente("Facturacion");
        Materias_primas = new Botontransparente("Materias primas");
        Productos_terminados = new Botontransparente("Productos terminados");
        Proveedores = new Botontransparente("Proveedores");
        Reportes = new Botontransparente("Reportes");
        Uniformes = new Botontransparente("Uniformes");
        Usuarios = new Botontransparente("Usuarios");

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


        
        Cerrarsesion.setFont(new java.awt.Font("Segoe UI", 0, 16));
        Cerrarsesion.addActionListener(this);
        jPanel1.add(Cerrarsesion);
        Cerrarsesion.setBounds(450, 570, 200, 50);

        Colegios.setFont(new java.awt.Font("Segoe UI", 0, 16));
        Colegios.addActionListener(this);
        jPanel1.add(Colegios);
        Colegios.setBounds(10, 270, 200, 50);

        Facturacion.setFont(new java.awt.Font("Segoe UI", 0, 16));
        Facturacion.addActionListener(this);
        jPanel1.add(Facturacion);
        Facturacion.setBounds(450, 110, 200, 50);

        Materias_primas.setFont(new java.awt.Font("Segoe UI", 0, 16));
        Materias_primas.addActionListener(this);
        jPanel1.add(Materias_primas);
        Materias_primas.setBounds(10, 350, 200, 50);

        Productos_terminados.setFont(new java.awt.Font("Segoe UI", 0, 16));
        Productos_terminados.addActionListener(this);
        jPanel1.add(Productos_terminados);
        Productos_terminados.setBounds(230, 350, 200, 50);

        Proveedores.setFont(new java.awt.Font("Segoe UI", 0, 16));
        Proveedores.addActionListener(this);
        jPanel1.add(Proveedores);
        Proveedores.setBounds(450, 270, 200, 50);

        Reportes.setFont(new java.awt.Font("Segoe UI", 0, 16));
        Reportes.addActionListener(this);
        jPanel1.add(Reportes);
        Reportes.setBounds(10, 190, 200, 50);

        Uniformes.setFont(new java.awt.Font("Segoe UI", 0, 16));
        Uniformes.addActionListener(this);
        jPanel1.add(Uniformes);
        Uniformes.setBounds(230, 270, 200, 50);

        Usuarios.setFont(new java.awt.Font("Segoe UI", 0, 16));
        Usuarios.addActionListener(this);
        jPanel1.add(Usuarios);
        Usuarios.setBounds(450, 350, 200, 50);

        Clientes.setFont(new java.awt.Font("Segoe UI", 0, 16));
        Clientes.addActionListener(this);
        jPanel1.add(Clientes);
        Clientes.setBounds(10, 110, 200, 50);
        

        Pedidos.setFont(new java.awt.Font("Segoe UI", 0, 16));
        Pedidos.addActionListener(this);
        jPanel1.add(Pedidos);
        Pedidos.setBounds(230, 110, 200, 50);

        // jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        // jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/Imagenes/Contraseña.png")));
        // jPanel1.add(jLabel5);
        // jLabel5.setBounds(120, 260, 50, 50);

        Titulo.setFont(new Font("Segoe UI", Font.BOLD, 26));
        Titulo.setForeground(Color.BLACK);
        jPanel1.add(Titulo);
        Titulo.setBounds(120, 30, 440, 60);
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        
        
        jLabel6.setMaximumSize(new java.awt.Dimension(675, 675));
        jLabel6.setMinimumSize(new java.awt.Dimension(675, 675));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 675, 675);
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/proyectobd/Imagenes/Fondo3.png")));

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

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton Clientes;
    private javax.swing.JButton Pedidos;
    private javax.swing.JButton Cerrarsesion;
    private javax.swing.JButton Colegios;
    private javax.swing.JButton Facturacion;
    private javax.swing.JButton Materias_primas;
    private javax.swing.JButton Productos_terminados;
    private javax.swing.JButton Proveedores;
    private javax.swing.JButton Reportes;
    private javax.swing.JButton Uniformes;
    private javax.swing.JButton Usuarios;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Clientes) {
            Clientesbd clb = new Clientesbd();
            VentanaGestionClientes vl = new VentanaGestionClientes(clb);
            this.dispose();
            vl.setVisible(true);
        }
        else if (e.getSource() == Pedidos) {
            Pedidosbd modeloPedidos = new Pedidosbd();
            VentanaGestionPedidos va = new VentanaGestionPedidos(modeloPedidos);
            this.dispose();
            va.setVisible(true);
        }
        else if (e.getSource() == Cerrarsesion) {
            Login l = new Login();
            VentanaLogin_copy vl = new VentanaLogin_copy(l);
            this.dispose();
            vl.setVisible(true);
        }

        else if (e.getSource() == Facturacion) {
            Facturacionbd modeloClientes = new Facturacionbd();
            VentanaGestionFacturas va = new VentanaGestionFacturas(modeloClientes);
            this.dispose();
            va.setVisible(true);
        }

        else if (e.getSource() == Colegios) {
            Colegiosbd modeloClientes = new Colegiosbd();
            VentanaGestionColegios va = new VentanaGestionColegios(modeloClientes);
            this.dispose();
            va.setVisible(true);
        }

        else if (e.getSource() == Materias_primas) {
            MateriasPrimasbd modeloClientes = new MateriasPrimasbd();
            VentanaGestionMateriasprimas va = new VentanaGestionMateriasprimas(modeloClientes);
            this.dispose();
            va.setVisible(true);
        }

        else if (e.getSource() == Uniformes) {
            Uniformesbd modeloClientes = new Uniformesbd();
            VentanaGestionUniformes va = new VentanaGestionUniformes(modeloClientes);
            this.dispose();
            va.setVisible(true);
        }
        
        else if (e.getSource() == Proveedores) {
            Proveedoresbd modeloClientes = new Proveedoresbd();
            VentanaGestionProveedores va = new VentanaGestionProveedores(modeloClientes);
            this.dispose();
            va.setVisible(true);
        }

        else if (e.getSource() == Productos_terminados) {
            ProductosTerminadosbd modeloClientes = new ProductosTerminadosbd();
            VentanaGestionProductosTerminados va = new VentanaGestionProductosTerminados(modeloClientes);
            this.dispose();
            va.setVisible(true);
        }

        else if (e.getSource() == Usuarios) {
            Usuariosbd modeloClientes = new Usuariosbd();
            VentanaGestionUsuarios va = new VentanaGestionUsuarios(modeloClientes);
            this.dispose();
            va.setVisible(true);
        }
    }
}
