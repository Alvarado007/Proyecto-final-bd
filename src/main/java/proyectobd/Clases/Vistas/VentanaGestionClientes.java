package proyectobd.Clases.Vistas;

import java.awt.Image;

import javax.swing.ImageIcon;

public class VentanaGestionClientes extends javax.swing.JFrame {
    public VentanaGestionClientes() {
        initComponents();
        this.setSize(775, 775); // NUEVO TAMAÑO
        this.setResizable(false); // Igual que el login
        this.setLocationRelativeTo(null); // Centrar ventana
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(775, 775));
        setSize(new java.awt.Dimension(775, 775));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(775, 775));
        jPanel1.setMinimumSize(new java.awt.Dimension(775, 775));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(775, 775));
        jPanel1.setLayout(null);

        // jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        // jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/Imagenes/Usuario.png")));
        // jLabel4.setText("Contraseña:");
        // jPanel1.add(jLabel4);
        // jLabel4.setBounds(120, 200, 50, 50);

        jTextField1.setBackground(new java.awt.Color(74, 74, 74));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("jTextField1");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(220, 210, 90, 18);

        jTextField2.setBackground(new java.awt.Color(74, 74, 74));
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("jTextField2");
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(220, 280, 90, 16);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setContentAreaFilled(false);
        jPanel1.add(jButton1);
        jButton1.setBounds(150, 140, 80, 40);

        // jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        // jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/Imagenes/Contraseña.png")));
        // jPanel1.add(jLabel5);
        // jLabel5.setBounds(120, 260, 50, 50);

        // jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        // jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectobd/Imagenes/Logo.png")));
        // jLabel1.setMaximumSize(new java.awt.Dimension(80, 80));
        // jLabel1.setPreferredSize(new java.awt.Dimension(80, 80));
        // jPanel1.add(jLabel1);
        // jLabel1.setBounds(120, 30, 140, 120);

        
        
        jLabel6.setMaximumSize(new java.awt.Dimension(775, 775));
        jLabel6.setMinimumSize(new java.awt.Dimension(775, 775));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 775, 775);
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/proyectobd/Imagenes/Fondo4.png")));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaGestionClientes().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
}
