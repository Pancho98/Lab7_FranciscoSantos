/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {

    
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_persona = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf_nombrep = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_edad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tf_altura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tf_profecion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_lugar = new javax.swing.JTextField();
        jb_cargar = new javax.swing.JButton();
        jb_guardar = new javax.swing.JButton();
        Titulo_Lugar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_clima = new javax.swing.JTextField();
        tf_extencion = new javax.swing.JTextField();
        tf_habitantes = new javax.swing.JTextField();
        tf_zona = new javax.swing.JTextField();
        tf_fundacion = new javax.swing.JTextField();
        jb_crear = new javax.swing.JButton();
        jb_registrar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Persona");

        jLabel8.setText("Nombre");

        jLabel9.setText("Id");

        jLabel10.setText("Edad");

        jLabel11.setText("Altura");

        jLabel12.setText("Profeción");

        jLabel13.setText("Lugar");

        jb_cargar.setText("Crear");
        jb_cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_cargarMouseClicked(evt);
            }
        });

        jb_guardar.setText("Guardar");
        jb_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_personaLayout = new javax.swing.GroupLayout(jd_persona.getContentPane());
        jd_persona.getContentPane().setLayout(jd_personaLayout);
        jd_personaLayout.setHorizontalGroup(
            jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_personaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(jd_personaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(37, 37, 37)
                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_nombrep)
                    .addComponent(tf_id)
                    .addComponent(tf_edad)
                    .addComponent(tf_altura)
                    .addComponent(tf_profecion)
                    .addComponent(tf_lugar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jd_personaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jb_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jb_guardar)
                .addGap(92, 92, 92))
        );
        jd_personaLayout.setVerticalGroup(
            jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_personaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_nombrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_profecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jd_personaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cargar)
                    .addComponent(jb_guardar))
                .addGap(47, 47, 47))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo_Lugar.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Titulo_Lugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo_Lugar.setText("Crear Lugar");

        jLabel2.setText("Nombre");

        jLabel3.setText("Clima");

        jLabel4.setText("Extención");

        jLabel5.setText("Habitantes");

        jLabel6.setText("Zona");

        jLabel7.setText("Fundación");

        jb_crear.setText("Crear");
        jb_crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearMouseClicked(evt);
            }
        });

        jb_registrar.setText("Registrar");
        jb_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo_Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addComponent(tf_clima)
                                .addComponent(tf_extencion)
                                .addComponent(tf_habitantes)
                                .addComponent(tf_zona)
                                .addComponent(tf_fundacion))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jb_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jb_registrar)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo_Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_clima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_extencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_habitantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_fundacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_crear)
                    .addComponent(jb_registrar))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearMouseClicked
        String nombre,clima,zona;
        int extencion,habitantes, fundacion;
        
        nombre=tf_nombre.getText().toLowerCase();
        clima=tf_clima.getText();
        extencion=Integer.parseInt(tf_extencion.getText());
        habitantes=Integer.parseInt(tf_habitantes.getText());
        zona=tf_zona.getText();
        fundacion=Integer.parseInt(tf_fundacion.getText());
        l.start();
        
    }//GEN-LAST:event_jb_crearMouseClicked

    private void jb_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registrarMouseClicked
        jd_persona.pack();
        jd_persona.setModal(true);
        jd_persona.setVisible(true);
        jd_persona.setLocationRelativeTo(this);
    }//GEN-LAST:event_jb_registrarMouseClicked

    private void jb_cargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_cargarMouseClicked
        Persona p = new Persona(tf_nombrep.getText(),Integer.parseInt(tf_id.getText()),Integer.parseInt(tf_edad.getText()),Integer.parseInt(tf_altura.getText()),tf_profecion.getText(),tf_lugar.getText().toLowerCase());
        AdminPersonas ap = new AdminPersonas("./per.bin");
        ap.cargarArchivo();
        ap.setPersona(p);
        ap.escribirArchivo();
        JOptionPane.showMessageDialog(this, "se guardo la persona exitosamente");
        tf_nombrep.setText("");
        tf_id.setText("");
        tf_edad.setText("");
        tf_altura.setText("");
        tf_profecion.setText("");
        tf_lugar.setText("");
        
    }//GEN-LAST:event_jb_cargarMouseClicked

    private void jb_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarMouseClicked
        
    }//GEN-LAST:event_jb_guardarMouseClicked

    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo_Lugar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jb_cargar;
    private javax.swing.JButton jb_crear;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_registrar;
    private javax.swing.JDialog jd_persona;
    private javax.swing.JTextField tf_altura;
    private javax.swing.JTextField tf_clima;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_extencion;
    private javax.swing.JTextField tf_fundacion;
    private javax.swing.JTextField tf_habitantes;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_lugar;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombrep;
    private javax.swing.JTextField tf_profecion;
    private javax.swing.JTextField tf_zona;
    // End of variables declaration//GEN-END:variables

Lugar l = new Lugar();
}
