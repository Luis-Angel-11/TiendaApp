/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.tiendaapp.Vista;

import com.mycompany.tiendaapp.App;
import com.mycompany.tiendaapp.Carrito;
import com.mycompany.tiendaapp.Interfaces.FabricaMuebles;
import com.mycompany.tiendaapp.clases.FabricaKali;
import com.mycompany.tiendaapp.clases.FabricaLondon;
import com.mycompany.tiendaapp.clases.Producto;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author ASUS
 */
public class Muebles extends javax.swing.JPanel {
    //private CarritoLista infoCarrito = new CarritoLista();
    //private CarritoLista carrito;
    //private DefaultListModel<Producto> carritoModel;
     
    public Muebles() {
        initComponents();
        MostrarImagenes();
        //carritoModel = new DefaultListModel<>();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Silla1 = new javax.swing.JLabel();
        Sofa1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Mesa1 = new javax.swing.JLabel();
        txtSillaL = new javax.swing.JTextField();
        Silla2 = new javax.swing.JLabel();
        Sofa2 = new javax.swing.JLabel();
        Mesa2 = new javax.swing.JLabel();
        txtMesaL = new javax.swing.JTextField();
        txtSofaL = new javax.swing.JTextField();
        txtSofaK = new javax.swing.JTextField();
        txtMesaK = new javax.swing.JTextField();
        txtSillaK = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCarrito = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("Principal"); // NOI18N

        Silla1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Sofa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(21, 145, 155));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Juego de Muebles");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("London");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Kali");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Mesa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Silla2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Sofa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Mesa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnAgregar.setBackground(new java.awt.Color(9, 209, 199));
        btnAgregar.setText("agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(12, 100, 120));
        btnLimpiar.setText("limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCarrito.setBackground(new java.awt.Color(21, 145, 155));
        btnCarrito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnCarrito.setText("Carrito");
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnCarrito)
                        .addGap(37, 37, 37)
                        .addComponent(btnAgregar)
                        .addGap(41, 41, 41)
                        .addComponent(btnLimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Silla2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(txtSillaL, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(txtSillaK, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Sofa2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(txtSofaK, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtSofaL, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Silla1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(Sofa1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMesaK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMesaL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Silla1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sofa1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSillaL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSofaL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMesaL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sofa2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Silla2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSillaK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSofaK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMesaK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCarrito))
                .addContainerGap(42, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void MostrarImagenes() {
        // Agregar un listener al panel para ajustar las imágenes cuando cambie el tamaño
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                
                setImageLabel(Silla1, "src/main/resources/Imagenes1/silla1.jpg");
                setImageLabel(Sofa1, "src/main/resources/Imagenes1/sofa1.jpg");
                setImageLabel(Mesa1, "src/main/resources/Imagenes1/mesa1.jpg");
                //setImageLabel(Sofa2, "src/main/java/Imagenes/sofa2.jpg");
                setImageLabel(Silla2, "src/main/resources/Imagenes1/silla2.jpg");
                setImageLabel(Sofa2, "src/main/resources/Imagenes1/sofa2.jpg");
                setImageLabel(Mesa2, "src/main/resources/Imagenes1/mesa2.jpg");
            }
        });
    }
    private void setImageLabel(JLabel labelName, String root){
        SwingUtilities.invokeLater(() -> {
            ImageIcon imagen = new ImageIcon(root);
                if (labelName.getWidth() <= 0 || labelName.getHeight() <= 0) {
                    System.err.println("Error: Dimensiones del JLabel son inválidas (ancho o alto igual a 0).");
                    return;
                }
            Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_SMOOTH));
            labelName.setIcon(icon);
            this.repaint();
        });
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        FabricaMuebles fabrica = new FabricaLondon();
        Producto mesa = fabrica.crearMesa();
        Producto silla = fabrica.crearSilla();
        Producto sofa = fabrica.crearSofa();
        FabricaMuebles fabrica2 = new FabricaKali();
        Producto mesa2 = fabrica2.crearMesa();
        Producto silla2 = fabrica2.crearSilla();
        Producto sofa2 = fabrica2.crearSofa();
        
        String aux1 = txtMesaK.getText();
        String aux2 = txtMesaL.getText();
        String aux3 = txtSillaK.getText();
        String aux4 = txtSillaL.getText();
        String aux5 = txtSofaK.getText();
        String aux6 = txtSofaL.getText();
        
        if(aux1.isBlank()){aux1="0";txtMesaK.setText("0");}
        if(aux2.isBlank()){aux2="0";txtMesaL.setText("0");}
        if(aux3.isBlank()){aux3="0";txtSillaK.setText("0");}
        if(aux4.isBlank()){aux4="0";txtSillaL.setText("0");}
        if(aux5.isBlank()){aux5="0";txtSofaK.setText("0");}
        if(aux6.isBlank()){aux6="0";txtSofaL.setText("0");}
        
        if(aux1.matches("[0-9]+") && aux2.matches("[0-9]+")&& aux3.matches("[0-9]+")&& aux4.matches("[0-9]+")&& aux5.matches("[0-9]+")&& aux6.matches("[0-9]+")){
            int cantMesa = Integer.parseInt(txtMesaK.getText());
            int cantMesa1 = Integer.parseInt(txtMesaL.getText());
            int cantSilla = Integer.parseInt(txtSillaK.getText());
            int cantSilla1 = Integer.parseInt(txtSillaL.getText());
            int cantSofa = Integer.parseInt(txtSofaK.getText());
            int cantSofa1 = Integer.parseInt(txtSofaL.getText());
            //App.carritoModel.addElement(mesa);
            //App.carritoModel.addElement(silla);
            //App.carritoModel.addElement(sofa);
            for (int i = 0; i < cantSilla1; i++) {App.lista.add(silla);}
            for (int i = 0; i < cantSofa1; i++) {App.lista.add(sofa);}
            for (int i = 0; i < cantMesa1; i++) {App.lista.add(mesa);}
            for (int i = 0; i < cantSilla; i++) {App.lista.add(silla2);}
            for (int i = 0; i < cantSofa; i++) {App.lista.add(sofa2);}
            for (int i = 0; i < cantMesa; i++) {App.lista.add(mesa2);}
            limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un numero correcto");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        
        JFrame principal = (JFrame) SwingUtilities.getWindowAncestor(this);  // Obtener el JFrame contenedor
        principal.dispose();
        var aplicativo = new Carrito();
        aplicativo.setVisible(true);
        aplicativo.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCarritoActionPerformed
    void limpiar(){
        txtMesaK.setText("");
        txtSillaK.setText("");
        txtSofaK.setText("");
        txtSillaL.setText("");
        txtSofaL.setText("");
        txtMesaL.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mesa1;
    private javax.swing.JLabel Mesa2;
    private javax.swing.JLabel Silla1;
    private javax.swing.JLabel Silla2;
    private javax.swing.JLabel Sofa1;
    private javax.swing.JLabel Sofa2;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMesaK;
    private javax.swing.JTextField txtMesaL;
    private javax.swing.JTextField txtSillaK;
    private javax.swing.JTextField txtSillaL;
    private javax.swing.JTextField txtSofaK;
    private javax.swing.JTextField txtSofaL;
    // End of variables declaration//GEN-END:variables
}
