
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fernando
 */
public class compra extends javax.swing.JInternalFrame {

    /**
     * Creates new form compra
     */
    int m=0,n=0,h=0,j=0,t=0,o=0;
    Crear_Producto producto;
    public compra() {
        initComponents();
        pago.removeAllItems();
        //ubicacion.removeAllItems();
        tipo.removeAllItems();
        proveedor.removeAllItems();
        nombreproducto.removeAllItems();
        cantidad.removeAllItems();
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        proveedor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        caja1 = new javax.swing.JTextField();
        pago = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        caja2 = new javax.swing.JTextField();
        tipo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        caja4 = new javax.swing.JTextField();
        agregar1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nombreproducto = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        cantidad = new javax.swing.JComboBox<>();
        NuevoProducto = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Facturas Compras");

        jLabel2.setText("Numero Factura: ");

        proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo de pago: ");

        jLabel4.setText("Id Proveedor: ");

        caja1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                caja1FocusGained(evt);
            }
        });
        caja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja1ActionPerformed(evt);
            }
        });

        pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagoActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor Compra:");

        caja2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        caja2.setSelectionColor(new java.awt.Color(204, 153, 0));
        caja2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja2ActionPerformed(evt);
            }
        });
        caja2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja2KeyTyped(evt);
            }
        });

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        jLabel8.setText("tipo de compra:");

        jLabel9.setText("Cantidad de producto:");

        caja4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja4KeyTyped(evt);
            }
        });

        agregar1.setText("Agregar Compra");
        agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre Producto:");

        nombreproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nombreproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreproductoActionPerformed(evt);
            }
        });

        jLabel10.setText("Cantidad compra:");

        cantidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });

        NuevoProducto.setText("Nuevo Producto");
        NuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoProductoActionPerformed(evt);
            }
        });

        btnRegresar.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/BACK2.png"))); // NOI18N
        btnRegresar.setBorderPainted(false);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/BACK3.png"))); // NOI18N
        btnRegresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/BACK.png"))); // NOI18N
        btnRegresar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRegresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(28, 28, 28)
                                    .addComponent(caja1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6))
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(pago, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nombreproducto, javax.swing.GroupLayout.Alignment.LEADING, 0, 157, Short.MAX_VALUE))))
                            .addComponent(NuevoProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(agregar1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(caja4))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel5))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cantidad, 0, 112, Short.MAX_VALUE)
                                        .addComponent(caja2, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                        .addComponent(proveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(nombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(caja2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(caja4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(caja1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NuevoProducto)
                    .addComponent(agregar1))
                .addGap(49, 49, 49)
                .addComponent(btnRegresar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagoActionPerformed
        // TODO add your handling code here:
        try {
//lista2.removeAllItems();
            Class.forName("com.mysql.jdbc.Driver");
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sipe", "root", "");
            System.out.println("conexion establecidad");
            PreparedStatement miSentencia = miConexion.prepareStatement("{CALL seleccionarPago()}");
            //PreparedStatement Sentencia = miConexion.prepareStatement("{CALL llamarUbicacion(?)}");

        //Sentencia.setString(1,(String)pago.getSelectedItem());
        
         ResultSet rs =  miSentencia.executeQuery();
         //ResultSet llamar=Sentencia.executeQuery();
         
         if(m==0){
         
         this.pago.addItem("Selecciona una Opcion");
         
         }
         
         while(rs.next() && m==0){
             
             
             this.pago.addItem(rs.getString(1));
         
             
         
         }
         m=1;
         
        
         

        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_pagoActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
        // TODO add your handling code here:
        try {
//lista2.removeAllItems();
            Class.forName("com.mysql.jdbc.Driver");
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sipe", "root", "");
            System.out.println("conexion establecidad");
            PreparedStatement miSentencia = miConexion.prepareStatement("{CALL llamarTipo()}");
            //PreparedStatement Sentencia = miConexion.prepareStatement("{CALL llamarUbicacion(?)}");

        //Sentencia.setString(1,(String)pago.getSelectedItem());
        
         ResultSet rs =  miSentencia.executeQuery();
         //ResultSet llamar=Sentencia.executeQuery();
         
         if(h==0){
         
         this.tipo.addItem("Selecciona una Opcion");
         
         }
         
         while(rs.next() && h==0){
             
             
             this.tipo.addItem(rs.getString(1));
         
             
         
         }
         h=1;
         
        
         

        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    }//GEN-LAST:event_tipoActionPerformed

    private void proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorActionPerformed
        // TODO add your handling code here:
        
        try {
//lista2.removeAllItems();
            Class.forName("com.mysql.jdbc.Driver");
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sipe", "root", "");
            System.out.println("conexion establecidad");
            PreparedStatement miSentencia = miConexion.prepareStatement("{CALL mostrarproveedor()}");
            //PreparedStatement Sentencia = miConexion.prepareStatement("{CALL llamarUbicacion(?)}");

        //Sentencia.setString(1,(String)pago.getSelectedItem());
        
         ResultSet rs =  miSentencia.executeQuery();
         //ResultSet llamar=Sentencia.executeQuery();
         
         if(j==0){
         
         this.proveedor.addItem("Selecciona una Opcion");
         
         }
         
         while(rs.next() && j==0){
             
             
             this.proveedor.addItem(rs.getString(1));
         
             
         
         }
         j=1;
         
        
         

        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_proveedorActionPerformed

    private void agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar1ActionPerformed
        // TODO add your handling code here:
        
        try {
//lista2.removeAllItems();
            Class.forName("com.mysql.jdbc.Driver");
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sipe", "root", "");
            System.out.println("conexion establecidad");
            PreparedStatement miSentencia = miConexion.prepareStatement("{CALL agregarcompra(?,?,?,?,?,?,?)}");
            //PreparedStatement Sentencia = miConexion.prepareStatement("{CALL llamarUbicacion(?)}");

            
            
            if(proveedor.getSelectedItem().equals("Selecciona una Opcion")){
            
                JOptionPane.showMessageDialog(rootPane,"Elija un valor diferente");
                nombreproducto.requestFocus();
            
                
            
            }
            /*else if (caja1.getText().equals("")) {
                
                JOptionPane.showMessageDialog(rootPane, "ingrese un valor");
                caja1.requestFocus();
                
            }*/
            
            else if (pago.getSelectedItem().equals("Selecciona una Opcion"))
            {
                 JOptionPane.showMessageDialog(rootPane,"Elija un valor diferente");
                 pago.requestFocus();
            }
            
            else if (tipo.getSelectedItem().equals("Selecciona una Opcion"))
            {
                 JOptionPane.showMessageDialog(rootPane,"Elija un valor diferente");
                 tipo.requestFocus();
            }
             
            else if (proveedor.getSelectedItem().equals("Selecciona una Opcion"))
            {
                 JOptionPane.showMessageDialog(rootPane,"Elija un valor diferente");
                 proveedor.requestFocus();
            }
              
            else if (caja2.getText().equals("")) {
                
                JOptionPane.showMessageDialog(rootPane, "ingrese un valor");
                caja2.requestFocus();
                
            }
            else if (cantidad.getSelectedItem().equals("Selecciona una Opcion"))
            {
                 JOptionPane.showMessageDialog(rootPane,"Elija un valor diferente");
                 cantidad.requestFocus();
            }
            else if (caja4.getText().equals("")) {
                
                JOptionPane.showMessageDialog(rootPane, "ingrese un valor");
                caja4.requestFocus();
                agregar1.setEnabled(true);
            } 
            else
            {
                
                //miSentencia.setString(1,caja1.getText());
        miSentencia.setString(1,(String)proveedor.getSelectedItem());
        //miSentencia.setString(2,(String)pago.getSelectedItem());
        //miSentencia.setString(2,(String)ubicacion.getSelectedItem());
        miSentencia.setString(2,(String)tipo.getSelectedItem());
        miSentencia.setString(3, caja2.getText());
        miSentencia.setString(4, caja1.getText());
        miSentencia.setString(5,(String)nombreproducto.getSelectedItem());
        //miSentencia.setString(5,caja3.getText());
        miSentencia.setString(6,(String)cantidad.getSelectedItem());
        miSentencia.setString(7, (String)caja4.getText());
        
        
        miSentencia.executeUpdate();
                
        
        JOptionPane.showConfirmDialog(rootPane, "Registro Exitoso");
                
            }
        //miSentencia.setString(1,caja1.getText());
        miSentencia.setString(1,(String)proveedor.getSelectedItem());
        //miSentencia.setString(2,(String)pago.getSelectedItem());
        //miSentencia.setString(2,(String)ubicacion.getSelectedItem());
        miSentencia.setString(2,(String)tipo.getSelectedItem());
        miSentencia.setString(3, caja2.getText());
        miSentencia.setString(4, caja1.getText());
        miSentencia.setString(5,(String)nombreproducto.getSelectedItem());
        //miSentencia.setString(5,caja3.getText());
        miSentencia.setString(6,(String)cantidad.getSelectedItem());
        miSentencia.setString(7, (String)caja4.getText());
        
        
        miSentencia.executeUpdate();
        
        
         //ResultSet rs =  miSentencia.executeQuery();
         //ResultSet llamar=Sentencia.executeQuery();
         
         
         
       
         
         
        
         

        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_agregar1ActionPerformed

    private void caja1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_caja1FocusGained
        // TODO add your handling code here:
        try {
//lista2.removeAllItems();
            Class.forName("com.mysql.jdbc.Driver");
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sipe", "root", "");
            System.out.println("conexion establecidad");
            PreparedStatement miSentencia = miConexion.prepareStatement("{CALL llamar_numero_factura_compra()}");
            //PreparedStatement Sentencia = miConexion.prepareStatement("{CALL llamarUbicacion(?)}");

            ResultSet rs =  miSentencia.executeQuery();
            if(caja1.getText().equals("")){
            
            while(rs.next()){
            
                
                caja1.setText(rs.getString(1));
                
            
            
            }}
        
        proveedor.requestFocus();
        
         //ResultSet rs =  miSentencia.executeQuery();
         //ResultSet llamar=Sentencia.executeQuery();
         
         
         
       
         
         
        
         

        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
        //llamar_numero_factura_compra
    }//GEN-LAST:event_caja1FocusGained

    private void caja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja1ActionPerformed
        // TODO add your handling code here:
        caja1.requestFocus();
    }//GEN-LAST:event_caja1ActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:llamartipocantidad
        
        try {
//lista2.removeAllItems();
            Class.forName("com.mysql.jdbc.Driver");
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sipe", "root", "");
            System.out.println("conexion establecidad");
            PreparedStatement miSentencia = miConexion.prepareStatement("{CALL llamarTipo()}");
            //PreparedStatement Sentencia = miConexion.prepareStatement("{CALL llamarUbicacion(?)}");

        //Sentencia.setString(1,(String)pago.getSelectedItem());
        
         ResultSet rs =  miSentencia.executeQuery();
         //ResultSet llamar=Sentencia.executeQuery();
         
         if(o==0){
         
         this.cantidad.addItem("Selecciona una Opcion");
         
         }
         
         while(rs.next() && o==0){
             
             
             this.cantidad.addItem(rs.getString(1));
         
             
         
         }
         o=1;
         
        
         

        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_cantidadActionPerformed

    private void nombreproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreproductoActionPerformed
        // TODO add your handling code here:
        
        
        
        try {
//lista2.removeAllItems();
            this.requestFocus();
            Class.forName("com.mysql.jdbc.Driver");
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sipe", "root", "");
            System.out.println("conexion establecidad");
            PreparedStatement miSentencia = miConexion.prepareStatement("{CALL mostrarProducto()}");
            //PreparedStatement Sentencia = miConexion.prepareStatement("{CALL llamarUbicacion(?)}");

        //Sentencia.setString(1,(String)pago.getSelectedItem());
        
         ResultSet rs =  miSentencia.executeQuery();
         //ResultSet llamar=Sentencia.executeQuery();
         
         if(t==0){
             
         
         this.nombreproducto.addItem("Selecciona una Opcion");
         
         }
         
         while(rs.next() && t==0){
             
             
             this.nombreproducto.addItem(rs.getString(1));
         
             
         
         }
         t=1;
         
        
         

        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nombreproductoActionPerformed

    private void NuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoProductoActionPerformed
        // TODO add your handling code here:
        
        if(producto==null || producto.isClosed()){
        
            producto=new Crear_Producto();
            Principal.Escritorio.add(producto);
            producto.show();
        
        
        }
        
        
    }//GEN-LAST:event_NuevoProductoActionPerformed

    private void caja2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja2ActionPerformed

    private void caja2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja2KeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
               
          } 
    }//GEN-LAST:event_caja2KeyTyped

    private void caja4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja4KeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
               
          } 
    }//GEN-LAST:event_caja4KeyTyped

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NuevoProducto;
    private javax.swing.JButton agregar1;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JTextField caja1;
    private javax.swing.JTextField caja2;
    private javax.swing.JTextField caja4;
    private javax.swing.JComboBox<String> cantidad;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> nombreproducto;
    private javax.swing.JComboBox<String> pago;
    private javax.swing.JComboBox<String> proveedor;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}