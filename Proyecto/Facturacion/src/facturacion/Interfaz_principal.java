/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Interfaz_principal extends javax.swing.JFrame {
control_existencias ctrl = new control_existencias();
    
    /**
     * Creates new form Interfaz_principal
     */
    public Interfaz_principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Buscararticulos = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        item_venta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jDesktopPane1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/Logo.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(410, 80, 480, 470);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("𝓣𝓝𝓣𝓡𝓘𝓐𝓖𝓞 𝓕𝓡𝓐𝓝𝓒𝓞 𝓦𝓐𝓢𝓗𝓘𝓝𝓖𝓣𝓞𝓝\n𝓗𝓔𝓝𝓡𝓨 𝓓𝓐𝓝𝓘𝓔𝓛 𝓒𝓐𝓝𝓣𝓞𝓢\n𝓔𝓨𝓢𝓞𝓝𝓗𝓞𝓥𝓔𝓡 𝓑𝓐𝓢𝓤𝓡𝓣𝓞 𝓛𝓞𝓞𝓡");
        jScrollPane1.setViewportView(jTextArea1);

        jDesktopPane1.add(jScrollPane1);
        jScrollPane1.setBounds(140, 470, 300, 86);

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));

        jMenu1.setBackground(new java.awt.Color(204, 204, 255));
        jMenu1.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu1.setText("Registrar");
        jMenu1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jMenu1.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem4.setBackground(new java.awt.Color(255, 204, 204));
        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem4.setText("Registrar cliente");
        jMenuItem4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem3.setText("Registar articulo");
        jMenuItem3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu2.setText("Artículos");
        jMenu2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jMenu2.setPreferredSize(new java.awt.Dimension(200, 50));

        Buscararticulos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buscararticulos.setText("Lista de articulos");
        Buscararticulos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Buscararticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscararticulosActionPerformed(evt);
            }
        });
        jMenu2.add(Buscararticulos);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem6.setText("Actualizar stock");
        jMenuItem6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem8.setText("Devoluciones");
        jMenuItem8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu3.setText("Facturación");
        jMenu3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(200, 50));

        item_venta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        item_venta.setText("Nueva Factura");
        item_venta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_ventaActionPerformed(evt);
            }
        });
        jMenu3.add(item_venta);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu4.setText("Cliente");
        jMenu4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem7.setText("Consulta facturas clientes");
        jMenuItem7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem1.setBackground(new java.awt.Color(204, 204, 255));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem1.setText("Buscar clientes");
        jMenuItem1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       Interfaz_buscarclientes buscar = new Interfaz_buscarclientes();
        jDesktopPane1.add(buscar);
        buscar.show(); 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       
        Interfaz_articulo art = new Interfaz_articulo();
        jDesktopPane1.add(art);
        art.show();       
            
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
            
               
          Interfaz_Clientes cli = new Interfaz_Clientes();       
          jDesktopPane1.add(cli);
          cli.show();          
            
    
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void BuscararticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscararticulosActionPerformed
        interfaz_buscararticulos bus = new interfaz_buscararticulos();
        jDesktopPane1.add(bus);
        bus.show(); 
    }//GEN-LAST:event_BuscararticulosActionPerformed

    private void item_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_ventaActionPerformed
     String venta = JOptionPane.showInputDialog(this,"Ingrese el documento del cliente: ",JOptionPane.OK_OPTION);
       if(ctrl.existe_cliente(venta))
       {
        Interfaz_factura fact = new Interfaz_factura(ctrl);
        jDesktopPane1.add(fact);
        fact.show(); 
       }
       else
       {
              
          JOptionPane.showMessageDialog(null,"El cliente no existe, debe registrarlo","Mensaje",JOptionPane.QUESTION_MESSAGE);  
       }
    }//GEN-LAST:event_item_ventaActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    Interfaz_actualizarstock stock = new Interfaz_actualizarstock();
    jDesktopPane1.add(stock);
    stock.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    interfaz_consultas consulta = new interfaz_consultas();
    jDesktopPane1.add(consulta);
    consulta.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
    Interfaz_devoluciones dev = new Interfaz_devoluciones();
    jDesktopPane1.add(dev);
    dev.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Buscararticulos;
    private javax.swing.JMenuItem item_venta;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
