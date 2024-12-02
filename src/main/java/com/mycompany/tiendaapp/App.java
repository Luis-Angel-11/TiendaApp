/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tiendaapp;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatLightOwlIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.mycompany.tiendaapp.Vista.Abarrotes;
import com.mycompany.tiendaapp.Vista.Bebidas;
import com.mycompany.tiendaapp.Vista.Electro;
import com.mycompany.tiendaapp.Vista.Limpieza;
import com.mycompany.tiendaapp.Vista.Muebles;
import com.mycompany.tiendaapp.Vista.Tecnologia;
import com.mycompany.tiendaapp.clases.Producto;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ASUS
 */
public class App extends javax.swing.JFrame {
    private Component[] contenidoOriginal;
    private LayoutManager layoutOriginal;
   // public static DefaultListModel<Producto> carritoModel = new DefaultListModel<>();
    public static List<Producto> lista = new ArrayList<>();
    
    public App() {
        InitStyle();
        initComponents();
        SubirImagenes();
    }
    
    void SubirImagenes(){
        contenidoOriginal = Principal.getComponents();
        layoutOriginal = Principal.getLayout();
        this.setLocationRelativeTo(this);
        
        setImageLabel(bebidas, "src/main/java/Imagenes/bebidas.jpg");
        setImageLabel(Tecnologia, "src/main/java/Imagenes/tecnologia.jpg");
        setImageLabel(Electro, "src/main/java/Imagenes/electro.jpg");
        setImageLabel(muebles, "src/main/java/Imagenes/muebles1.jpg");
        setImageLabel(Abarrotes, "src/main/java/Imagenes/abarrotes.jpg");
        setImageLabel(Camara, "src/main/java/Imagenes/limpieza.jpg");
        setImageButton(btnHome, "src/main/resources/Imagenes1/home1.png");
        setImageButton(btnUser, "src/main/resources/Imagenes1/user.png");
        setImageButton(btnCart, "src/main/resources/Imagenes1/cart1.png");
    }
    void InitStyle(){
        
    }
    
    private void setImageLabel(JLabel labelName, String root){
        ImageIcon imagen = new ImageIcon(root);
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        this.repaint();
    }
    
    private void setImageButton(JButton button, String root){
        ImageIcon imagen = new ImageIcon(root);
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_SMOOTH));
        button.setIcon(icon);
        this.repaint();
    }
    public void restaurarContenidoOriginal() {
        Principal.removeAll(); // Eliminar todo el contenido actual
        Principal.setLayout(layoutOriginal); // Restaurar el layout original
        for (Component comp : contenidoOriginal) {
            Principal.add(comp); // Volver a agregar cada componente original
        }
        Principal.revalidate();
        Principal.repaint();
    }
    private void vistaPanel(JPanel p){
        p.setPreferredSize(Principal.getSize());
        //p.setSize(800, 790);
        p.setLocation(0, 0);
        Principal.removeAll();
        Principal.setLayout(new BorderLayout());
        Principal.add(p, BorderLayout.CENTER);
        Principal.revalidate();
        Principal.repaint();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenido = new javax.swing.JPanel();
        Head = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnCart = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Principal = new javax.swing.JPanel();
        muebles = new javax.swing.JLabel();
        btnMuebles = new javax.swing.JButton();
        btnElectro = new javax.swing.JButton();
        Electro = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        btnLimpieza = new javax.swing.JButton();
        Camara = new javax.swing.JLabel();
        btnAbarrotes = new javax.swing.JButton();
        Abarrotes = new javax.swing.JLabel();
        Tecnologia = new javax.swing.JLabel();
        btnTecnologia = new javax.swing.JButton();
        btnBebidas = new javax.swing.JButton();
        bebidas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Contenido.setBackground(new java.awt.Color(255, 255, 255));

        Head.setBackground(new java.awt.Color(21, 145, 155));

        btnHome.setBackground(new java.awt.Color(21, 145, 155));
        btnHome.setBorderPainted(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnCart.setBackground(new java.awt.Color(21, 145, 155));
        btnCart.setBorderPainted(false);
        btnCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartActionPerformed(evt);
            }
        });

        btnUser.setBackground(new java.awt.Color(21, 145, 155));
        btnUser.setBorder(null);
        btnUser.setBorderPainted(false);
        btnUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUser.setFocusPainted(false);

        jLabel1.setText("Bienvenido User");

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnCart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addGroup(HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HeadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(HeadLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Principal.setPreferredSize(new java.awt.Dimension(770, 467));

        btnMuebles.setText("Muebles");
        btnMuebles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMueblesActionPerformed(evt);
            }
        });

        btnElectro.setText("Electro");
        btnElectro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElectro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElectroActionPerformed(evt);
            }
        });

        texto.setText("Nuestras Categorias");

        btnLimpieza.setBackground(new java.awt.Color(0, 255, 204));
        btnLimpieza.setText("Limpieza");
        btnLimpieza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiezaActionPerformed(evt);
            }
        });

        btnAbarrotes.setText("Abarrotes");
        btnAbarrotes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbarrotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbarrotesActionPerformed(evt);
            }
        });

        btnTecnologia.setText("Tecnologia");
        btnTecnologia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTecnologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecnologiaActionPerformed(evt);
            }
        });

        btnBebidas.setText("Bebidas");
        btnBebidas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBebidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(texto))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnMuebles)
                        .addGap(165, 165, 165)
                        .addComponent(btnElectro)
                        .addGap(162, 162, 162)
                        .addComponent(btnLimpieza))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnBebidas)
                        .addGap(165, 165, 165)
                        .addComponent(btnTecnologia)
                        .addGap(141, 141, 141)
                        .addComponent(btnAbarrotes))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(muebles, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(Tecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(Abarrotes, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PrincipalLayout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(Electro, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)
                                .addComponent(Camara, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(texto)
                .addGap(38, 38, 38)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(muebles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Electro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Camara, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMuebles)
                    .addComponent(btnElectro)
                    .addComponent(btnLimpieza))
                .addGap(76, 76, 76)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Abarrotes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBebidas)
                    .addComponent(btnTecnologia)
                    .addComponent(btnAbarrotes))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenidoLayout.createSequentialGroup()
                .addComponent(Head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        restaurarContenidoOriginal();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnMueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMueblesActionPerformed
        vistaPanel(new Muebles());
    }//GEN-LAST:event_btnMueblesActionPerformed

    private void btnCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartActionPerformed
        
        this.setLocationRelativeTo(null);
        this.setVisible(false);
        //Carrito carritoFrame = new Carrito(App.carritoModel);
        //carritoFrame.setVisible(true);
        var aplicativo = new Carrito();
        aplicativo.setVisible(true);
        aplicativo.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCartActionPerformed

    private void btnElectroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElectroActionPerformed
        vistaPanel(new Electro());
    }//GEN-LAST:event_btnElectroActionPerformed

    private void btnLimpiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiezaActionPerformed
        vistaPanel(new Limpieza());
    }//GEN-LAST:event_btnLimpiezaActionPerformed

    private void btnBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBebidasActionPerformed
        vistaPanel(new Bebidas());
    }//GEN-LAST:event_btnBebidasActionPerformed

    private void btnTecnologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecnologiaActionPerformed
        vistaPanel(new Tecnologia());
    }//GEN-LAST:event_btnTecnologiaActionPerformed

    private void btnAbarrotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbarrotesActionPerformed
        vistaPanel(new Abarrotes());
    }//GEN-LAST:event_btnAbarrotesActionPerformed

    public static void setLookAndFeel(){
        try {
            //FlatMaterialLighterIJTheme.setup();
            FlatLightOwlIJTheme.setup();
        } catch (Exception e) {
            System.out.println("error al aplicar el look and feel"+ e.getMessage());
        }
    }
    public static void main(String args[]) {
        
        setLookAndFeel();
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Abarrotes;
    private javax.swing.JLabel Camara;
    private javax.swing.JPanel Contenido;
    private javax.swing.JLabel Electro;
    private javax.swing.JPanel Head;
    private javax.swing.JPanel Principal;
    private javax.swing.JLabel Tecnologia;
    private javax.swing.JLabel bebidas;
    private javax.swing.JButton btnAbarrotes;
    private javax.swing.JButton btnBebidas;
    private javax.swing.JButton btnCart;
    private javax.swing.JButton btnElectro;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLimpieza;
    private javax.swing.JButton btnMuebles;
    private javax.swing.JButton btnTecnologia;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel muebles;
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
