package proyectobd.Clases.Vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;

import proyectobd.Clases.Modelos.Clientesbd;
import proyectobd.Clases.Modelos.MateriasPrimasbd;
import proyectobd.Estetica.Botontransparente;
import proyectobd.Estetica.Campotextotransparente;
import proyectobd.Estetica.Labeltransparente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaAgregarMateriasPrimas extends javax.swing.JFrame implements ActionListener {
    private MateriasPrimasbd modeloClientes;
    private String Modo;
    private String usuarioActual;
    private ArrayList<String> DatosActuales;

    public VentanaAgregarMateriasPrimas(MateriasPrimasbd ventanaClientes, String modo, String usuarioActual) {
        this.usuarioActual = usuarioActual;
        this.Modo = modo;
        this.modeloClientes = ventanaClientes;
        initComponents();
        this.setSize(675, 675); // NUEVO TAMAÑO
        this.setResizable(false); // Igual que el login
        this.setLocationRelativeTo(null); // Centrar ventana
    }

    public void setDatosActuales(ArrayList<String> datosActuales) {
        DatosActuales = datosActuales;
        ModoEditar();
    }

    public void ModoEditar() {
        if (Modo == "Editar"){
        Cambio1.setText(DatosActuales.get(0));
        Cambio2.setText(DatosActuales.get(1));
        Cambio3.setText(DatosActuales.get(2));
        Cambio4.setText(DatosActuales.get(3));
        Cambio5.setText(DatosActuales.get(4));
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        Cambio1 = new Campotextotransparente(1);
        Cambio2 = new Campotextotransparente(1);
        Cambio3 = new Campotextotransparente(1);
        Cambio4 = new Campotextotransparente(1);
        Cambio5 = new Campotextotransparente(1);
        Cambio6 = new Campotextotransparente(1);
        Cambio7 = new Campotextotransparente(1);
        Boton_guardar = new Botontransparente("Guardar");
        Boton_cancelar = new Botontransparente("Cancelar");
        Nombre_ventana = new Labeltransparente("Materias Primas");
        Label_cambio1 = new Labeltransparente("codigo");
        Label_cambio2 = new Labeltransparente("tipo");
        Label_cambio3 = new Labeltransparente("descripcion");
        Label_cambio4 = new Labeltransparente("cantidad");
        Label_cambio5 = new Labeltransparente("unidad_medida");
        Label_cambio6 = new Labeltransparente("Proveedor");
        Label_cambio7 = new Labeltransparente("terminado");
        
        jLabel6 = new javax.swing.JLabel();




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

        Cambio1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Cambio1.setForeground(Color.BLACK);
        Cambio1.setBounds(340, 90, 190, 50);
        jPanel1.add(Cambio1);

        Cambio2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Cambio2.setForeground(Color.BLACK);
        Cambio2.setBounds(340, 150, 190, 50);
        jPanel1.add(Cambio2);

        Cambio3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Cambio3.setForeground(Color.BLACK);
        Cambio3.setBounds(340, 210, 190, 50);
        jPanel1.add(Cambio3);

        Cambio4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Cambio4.setForeground(Color.BLACK);
        Cambio4.setBounds(340, 270, 190, 50);
        jPanel1.add(Cambio4);

        Cambio5.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Cambio5.setForeground(Color.BLACK);
        Cambio5.setBounds(340, 330, 190, 50);
        jPanel1.add(Cambio5);

        Cambio6.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Cambio6.setForeground(Color.BLACK);
        Cambio6.setBounds(340, 390, 190, 50);
        jPanel1.add(Cambio6);

        Cambio7.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Cambio7.setForeground(Color.BLACK);
        Cambio7.setBounds(340, 450, 190, 50);
        jPanel1.add(Cambio7);

        


        Boton_guardar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        Boton_guardar.setBounds(20, 570, 200, 50);
        Boton_guardar.addActionListener(this);
        jPanel1.add(Boton_guardar);

        Boton_cancelar.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        Boton_cancelar.setBounds(450, 570, 200, 50);
        Boton_cancelar.addActionListener(this);
        jPanel1.add(Boton_cancelar);

        



        // jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        // jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/Imagenes/Contraseña.png")));
        // jPanel1.add(jLabel5);
        // jLabel5.setBounds(120, 260, 50, 50);

        Nombre_ventana.setFont(new Font("Segoe UI", Font.BOLD, 26));
        Nombre_ventana.setForeground(Color.BLACK);
        jPanel1.add(Nombre_ventana);
        Nombre_ventana.setBounds(70, 20, 200, 40);
        Nombre_ventana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Label_cambio1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Label_cambio1.setForeground(Color.BLACK);
        jPanel1.add(Label_cambio1);
        Label_cambio1.setBounds(140, 90, 190, 50);
        Label_cambio1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Label_cambio2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Label_cambio2.setForeground(Color.BLACK);
        jPanel1.add(Label_cambio2);
        Label_cambio2.setBounds(140, 150, 190, 50);
        Label_cambio2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Label_cambio3.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Label_cambio3.setForeground(Color.BLACK);
        jPanel1.add(Label_cambio3);
        Label_cambio3.setBounds(140, 210, 190, 50);
        Label_cambio3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Label_cambio4.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Label_cambio4.setForeground(Color.BLACK);
        jPanel1.add(Label_cambio4);
        Label_cambio4.setBounds(140, 270, 190, 50);
        Label_cambio4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Label_cambio5.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Label_cambio5.setForeground(Color.BLACK);
        jPanel1.add(Label_cambio5);
        Label_cambio5.setBounds(140, 330, 190, 50);
        Label_cambio5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Label_cambio6.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Label_cambio6.setForeground(Color.BLACK);
        jPanel1.add(Label_cambio6);
        Label_cambio6.setBounds(140, 390, 190, 50);
        Label_cambio6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Label_cambio7.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        Label_cambio7.setForeground(Color.BLACK);
        jPanel1.add(Label_cambio7);
        Label_cambio7.setBounds(140, 450, 190, 50);
        Label_cambio7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        
        
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
    //             new VentanaAgregarMateriasPrimas().setVisible(true);
    //         }
    //     });
    // }

    // Variables declaration
    private javax.swing.JButton Boton_guardar;
    private javax.swing.JButton Boton_cancelar;
    private javax.swing.JLabel Nombre_ventana;
    private javax.swing.JLabel Label_cambio1;
    private javax.swing.JLabel Label_cambio2;
    private javax.swing.JLabel Label_cambio3;
    private javax.swing.JLabel Label_cambio4;
    private javax.swing.JLabel Label_cambio5;
    private javax.swing.JLabel Label_cambio6;
    private javax.swing.JLabel Label_cambio7;
    
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField Cambio1;
    private javax.swing.JTextField Cambio2;
    private javax.swing.JTextField Cambio3;
    private javax.swing.JTextField Cambio4;
    private javax.swing.JTextField Cambio5;
    private javax.swing.JTextField Cambio6;
    private javax.swing.JTextField Cambio7;
    
    // End of variables declaration


    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if (e.getSource() == Boton_guardar) {
            if (Modo == "Editar"){
                int Codigo = Integer.parseInt(Cambio1.getText());
                String Tipo = Cambio2.getText();
                String descripcion = Cambio3.getText();
                int cantidad = Integer.parseInt(Cambio4.getText());
                String unidadmedida = Cambio5.getText();
                modeloClientes.editarMateriasPrimas(Codigo, Tipo, descripcion, cantidad, unidadmedida);
                VentanaGestionMateriasprimas va = new VentanaGestionMateriasprimas(modeloClientes, usuarioActual);
                this.dispose();
                va.setVisible(true);
            }
            else if (Modo == "Nuevo"){
                int Codigo = Integer.parseInt(Cambio1.getText());
                String Tipo = Cambio2.getText();
                String descripcion = Cambio3.getText();
                int cantidad = Integer.parseInt(Cambio4.getText());
                String unidadmedida = Cambio5.getText();
                String proveedores = Cambio6.getText();
                String [] proveedores2 = proveedores.split(",");
                String Terminados = Cambio7.getText();
                String [] Terminados2 = Terminados.split(",");
                modeloClientes.agregarMateriasPrimas(Codigo, Tipo, descripcion, cantidad, unidadmedida);
                modeloClientes.Suministra(proveedores2, Codigo);
                modeloClientes.Es_hecho(Codigo, Terminados2);
                VentanaGestionMateriasprimas va = new VentanaGestionMateriasprimas(modeloClientes, usuarioActual);
                this.dispose();
                va.setVisible(true);
            }
        }
        else if (e.getSource() == Boton_cancelar) {
            VentanaGestionMateriasprimas va = new VentanaGestionMateriasprimas(modeloClientes, usuarioActual);
            this.dispose();
            va.setVisible(true);
        }
        
        
    }
    
}

