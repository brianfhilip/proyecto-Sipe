
import com.mxrck.autocompleter.TextAutoCompleter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fernando parrado
 */

public class Actualizar extends javax.swing.JInternalFrame {

    /**
     * Creates new form Actualizar
     */
    Actualizar actualiza;
    mostrarClientes cliente;
    
    public Actualizar() {
        initComponents();
        autocompletar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cajaId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cajaIdentificacion = new javax.swing.JTextField();
        cajaNombre = new javax.swing.JTextField();
        cajaApellido = new javax.swing.JTextField();
        cajaTelefono = new javax.swing.JTextField();
        cajaDireccion = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnRegresar5 = new javax.swing.JButton();

        jLabel1.setText("Ingresa la identificacion de el cliente al que le quieres hacer cambios ");

        jLabel2.setText("Identificacion: ");

        cajaId.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cajaIdMouseMoved(evt);
            }
        });
        cajaId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cajaIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cajaIdFocusLost(evt);
            }
        });
        cajaId.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                cajaIdMouseWheelMoved(evt);
            }
        });
        cajaId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cajaIdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cajaIdMouseEntered(evt);
            }
        });
        cajaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIdActionPerformed(evt);
            }
        });
        cajaId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaIdKeyTyped(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Identificacion", "Nombre", "Apellido", "Telefono", "Direccion"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Datos  a Modificar");

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido");

        jLabel6.setText("Telefono");

        jLabel7.setText("Direccion");

        jLabel8.setText("Identificacion");

        cajaIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaIdentificacionKeyTyped(evt);
            }
        });

        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });
        cajaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaNombreKeyTyped(evt);
            }
        });

        cajaApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaApellidoKeyTyped(evt);
            }
        });

        cajaTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaTelefonoKeyTyped(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/add_user.png"))); // NOI18N
        btnGuardar.setText("GUARDAR CAMBIOS");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnRegresar5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRegresar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/BACK2.png"))); // NOI18N
        btnRegresar5.setBorderPainted(false);
        btnRegresar5.setContentAreaFilled(false);
        btnRegresar5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/BACK3.png"))); // NOI18N
        btnRegresar5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/BACK.png"))); // NOI18N
        btnRegresar5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRegresar5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegresar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresar5MouseClicked(evt);
            }
        });
        btnRegresar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(cajaId, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Buscar)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(btnRegresar5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cajaIdentificacion)
                                    .addComponent(cajaApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cajaTelefono))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(cajaDireccion))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(cajaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Buscar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cajaIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cajaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnRegresar5))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void autocompletar() {
    
    
    TextAutoCompleter auto = new TextAutoCompleter(cajaId);
    
  
    try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sipe", "root", "");
            System.out.println("conexion establecidad");
            PreparedStatement miSentencia = miConexion.prepareStatement("{CALL autoCompletar()}");

         
            Statement st;
            st=miConexion.createStatement();
            ResultSet rs = miSentencia.executeQuery();
            
            String a="";
            while(rs.next()){
            
                auto.addItem(rs.getString(1));
                
                
                
                    
            }
            
            
            //cajaId.selectAll();
            
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    
    }
    
    
    
     
 
    
    
    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sipe", "root", "");
            System.out.println("conexion establecidad");
            PreparedStatement miSentencia = miConexion.prepareStatement("{CALL buscarCliente(?)}");

         miSentencia.setString(1,cajaId.getText());
            Statement st;
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("identificacion");
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("Telefono");
            model.addColumn("Direccion");
            
            jTable1.setModel(model);
            
            
            String[] dato = new String[5];
            
            st=miConexion.createStatement();
            
            ResultSet rs = miSentencia.executeQuery();
            
            while(rs.next()){
            
                if(rs.getString(1).equals("0")){
                
                    
                    JOptionPane.showMessageDialog(rootPane,"El usuario no existe");
                    cajaIdentificacion.setText("");
                    cajaNombre.setText("");
                    cajaApellido.setText("");
                    cajaTelefono.setText("");
                    cajaDireccion.setText("");
                    
                    
                    
                }
                
                else{
                
                System.out.println(rs.getString(1));
                dato[0]=rs.getString(1);
                cajaIdentificacion.setText(rs.getString(1));
                dato[1]=rs.getString(2);
                cajaNombre.setText(rs.getString(2));
                dato[2]=rs.getString(3);
                cajaApellido.setText(rs.getString(3));
                dato[3]=rs.getString(4);
                cajaTelefono.setText(rs.getString(4));
                dato[4]=rs.getString(5);
                cajaDireccion.setText(rs.getString(5));
                model.addRow(dato);
                
                }
            }

        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch (SQLException ex) {
            Logger.getLogger(Actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
                actualizarCliente();
                
                JOptionPane.showMessageDialog(rootPane, "Registro Exitoso");

                if (cliente== null || cliente.isClosed()) {

                    cliente = new mostrarClientes();
                    Principal.Escritorio.add(cliente);
                    cliente.show();

                }
                //dispose();
            
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresar5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegresar5MouseClicked

    private void btnRegresar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar5ActionPerformed
        // TODO add your handling code here:

        this.dispose();
    }//GEN-LAST:event_btnRegresar5ActionPerformed

    private void cajaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIdActionPerformed
        // TODO add your handling code here:
          
        
        
        
        
        
    }//GEN-LAST:event_cajaIdActionPerformed

    private void cajaIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaIdFocusGained
        // TODO add your handling code here:
        
        
        
        
        
        
        
    }//GEN-LAST:event_cajaIdFocusGained

    private void cajaIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaIdMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaIdMouseEntered

    private void cajaIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaIdMouseClicked

        // TODO add your handling code here:
        
    }//GEN-LAST:event_cajaIdMouseClicked

    private void cajaIdMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cajaIdMouseMoved
        // TODO add your handling code here:
        
      cajaId.getSelectedText();
    }//GEN-LAST:event_cajaIdMouseMoved

    private void cajaIdMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_cajaIdMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaIdMouseWheelMoved

    private void cajaIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cajaIdFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cajaIdFocusLost

    private void cajaIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaIdKeyTyped
        // TODO add your handling code here:
        
        char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
               
          } 
    }//GEN-LAST:event_cajaIdKeyTyped

    private void cajaIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaIdentificacionKeyTyped
        // TODO add your handling code here:
             
        char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
               
          }
        
        
    }//GEN-LAST:event_cajaIdentificacionKeyTyped

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNombreKeyTyped
        // TODO add your handling code here:
        
            
             char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
               
          } 
    }//GEN-LAST:event_cajaNombreKeyTyped

    private void cajaApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaApellidoKeyTyped
        // TODO add your handling code here:
            
             char c=evt.getKeyChar(); 
             
         
          if(Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(rootPane,"Ingrese solo letras");
               
          } 
        
    }//GEN-LAST:event_cajaApellidoKeyTyped

    private void cajaTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaTelefonoKeyTyped
        // TODO add your handling code here:
        
        char c=evt.getKeyChar(); 
             
         
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
               
              evt.consume(); 
               
              JOptionPane.showMessageDialog(rootPane,"Ingrese solo numeros");
               
          } 
    }//GEN-LAST:event_cajaTelefonoKeyTyped

    public void actualizarCliente(){
    try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sipe", "root", "");
            System.out.println("conexion establecidad");
            PreparedStatement miSentencia = miConexion.prepareStatement("{CALL modificarDatos(?,?,?,?,?)}");

            miSentencia.setString(1,cajaIdentificacion.getText());
            miSentencia.setString(2,cajaNombre.getText());
            miSentencia.setString(3,cajaApellido.getText());
            miSentencia.setString(4,cajaTelefono.getText());
            miSentencia.setString(5,cajaDireccion.getText());
            
            miSentencia.executeUpdate();

        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    public static javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar5;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JTextField cajaDireccion;
    private javax.swing.JTextField cajaId;
    private javax.swing.JTextField cajaIdentificacion;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JTextField cajaTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
