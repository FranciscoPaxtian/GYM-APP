/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Color;
import Conexion.ConexionGYM;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Francisco Paxtian
 */
public class Rutinas extends javax.swing.JFrame {
    private final ConexionGYM CON;
    Statement ps;
    private ResultSet rs;
    /**
     * Creates new form Rutinas
     */
    public Rutinas() {
        initComponents();
        setLocationRelativeTo(null);
        CON = ConexionGYM.getInstacia();
        transparenciaButton();
        MostrarRut();
    }

    String [] botones = {"Gris oscuro","Gris","Rojo","Naranja","Amarillo","Celeste"};
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtAyuda = new javax.swing.JButton();
        BtColor = new javax.swing.JButton();
        BtVolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        IdRut = new javax.swing.JTextField();
        IdEmp = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Dias = new javax.swing.JTextField();
        Horario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRut = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        Barra.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO DEL GYM BLANCO 50x50.png"))); // NOI18N

        BtAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AYUDA 40x40.png"))); // NOI18N
        BtAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAyudaActionPerformed(evt);
            }
        });

        BtColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/COLOR 40x40.png"))); // NOI18N
        BtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtColorActionPerformed(evt);
            }
        });

        BtVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VOLVER 40x40.png"))); // NOI18N
        BtVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVolverActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rutinas");

        javax.swing.GroupLayout BarraLayout = new javax.swing.GroupLayout(Barra);
        Barra.setLayout(BarraLayout);
        BarraLayout.setHorizontalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(314, 314, 314)
                .addComponent(BtAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BarraLayout.setVerticalGroup(
            BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarraLayout.createSequentialGroup()
                .addGroup(BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtVolver)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtAyuda)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID RUTINA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID EMPLEADO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NOMBRE DE LA RUTINA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DIAS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HORARIO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        IdRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdRutActionPerformed(evt);
            }
        });
        getContentPane().add(IdRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 200, 30));
        getContentPane().add(IdEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 200, 30));
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 280, 30));
        getContentPane().add(Dias, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 200, 30));
        getContentPane().add(Horario, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 200, 30));

        jButton1.setBackground(new java.awt.Color(200, 147, 145));
        jButton1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton1.setText("GUARDAR RUTINA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jButton2.setBackground(new java.awt.Color(198, 144, 143));
        jButton2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton2.setText("MODIFICAR RUTINA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jButton3.setBackground(new java.awt.Color(198, 144, 143));
        jButton3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        jButton3.setText("ELIMINAR RUTINA");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, -1, -1));

        TablaRut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID RUTINA", "ID EMPLEADO", "NOMBRE DE LA RUTINA", "DIAS DE RUTINA", "HORARIO DE RUTINA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaRut);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 980, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/RUTINAS VENTANA.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void transparenciaButton(){
        BtAyuda.setOpaque(false);
        BtAyuda.setContentAreaFilled(false);
        BtAyuda.setBorderPainted(false);
        BtVolver.setOpaque(false);
        BtVolver.setContentAreaFilled(false);
        BtVolver.setBorderPainted(false);
        BtColor.setOpaque(false);
        BtColor.setContentAreaFilled(false);
        BtColor.setBorderPainted(false);
    }
    private void BtAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAyudaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "★Seccion de rutinas★ \n ☛ Primero llena las casillas con los datos que se pide "
        + "\n ☛ Despues seleccione la accion a realizar \n ☛ Los datos registrados apareceran en la parte inferior \n ⇩ Para dar baja solo ingrese el id de rutina");
        JOptionPane.showMessageDialog(rootPane, "Para mas ayuda y asistencia tecnica contactenos \n ✉ Correo: fpaxtian@hotmail.com \n "
        + "☎ Telefono: 9621848035");
        JOptionPane.showMessageDialog(rootPane, "Programa desarrollado por: \n♛ Francisco Javier Paxtian Gordillo ");
    }//GEN-LAST:event_BtAyudaActionPerformed

    private void BtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtColorActionPerformed
        int x = JOptionPane.showOptionDialog(this,"Elige un color","Color de la barra superior",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,botones,botones[0]);
        if(x==0){
            Barra.setBackground(Color.darkGray);
            JOptionPane.showMessageDialog(this,"Color aplicado!");
        }else if(x==1){
            Barra.setBackground(Color.gray);
            JOptionPane.showMessageDialog(this,"Color aplicado!");
        }else if(x==2){
            Barra.setBackground(Color.red);
            JOptionPane.showMessageDialog(this,"Color aplicado!");
        }else if(x==3){
            Color colorNaranja=new Color(255, 108, 3);
            Barra.setBackground(colorNaranja);
            JOptionPane.showMessageDialog(this,"Color aplicado!");   
        }else if(x==4){
            Color colorAmarillo=new Color(255, 203, 34);
            Barra.setBackground(colorAmarillo);
            JOptionPane.showMessageDialog(this,"Color aplicado!");            
        }else if(x==5){
            Color colorCeleste=new Color(0, 179, 207);
            Barra.setBackground(colorCeleste);
            JOptionPane.showMessageDialog(this,"Color aplicado!");              
        }
    }//GEN-LAST:event_BtColorActionPerformed

    private void BtVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVolverActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_BtVolverActionPerformed

    private void IdRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdRutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        insertarRut();
        MostrarRut();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        modificarRut();
        MostrarRut();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        eliminarRut();
        MostrarRut();
    }//GEN-LAST:event_jButton3ActionPerformed

        public void insertarRut(){
        String id_rutina=IdRut.getText();
        String id_empleado=IdEmp.getText();
        String nombre=Nombre.getText();
        String dias=Dias.getText();
        String horarios=Horario.getText();
      try{
            if(id_rutina.equals("") || id_empleado.equals("") || nombre.equals("") || dias.equals("") || horarios.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos.");
            }else{
                Connection ConexionGYM = CON.conectar();
                java.sql.Statement ps=ConexionGYM.createStatement();
                String sql = "insert into rutina values('"+id_rutina+"','"+id_empleado+"','"+nombre+"','"+dias+"','"+horarios+"')";
                ps.execute(sql);
                ConexionGYM.close();
                JOptionPane.showMessageDialog(null, "Rutina registrada");
                limpiarRut();
            }
        }catch(Exception e){
            System.out.println("Error al registrar");
        }
    }
        
    void limpiarRut(){
        for (int i =0 ; i<=TablaRut.getRowCount(); i++){
            ModelodP.removeRow(i);
            i = i-1;
        }
    }
    DefaultTableModel ModelodP;
    
    public void MostrarRut(){
        String sql= "select * from rutina";
        try {
            Connection ConexionGYM = CON.conectar();
            ps=CON.conectar().createStatement();
            rs = ps.executeQuery(sql);
            Object [] inv = new Object[5];
            ModelodP = (DefaultTableModel) TablaRut.getModel();
            while(rs.next()){
                inv [0] = rs.getString("id_rutina");
                inv [1] = rs.getString("id_empleado");
                inv [2] = rs.getString("nom");
                inv [3] = rs.getString("dias");
                inv [4] = rs.getString("horarios");
                ModelodP.addRow(inv);
            }
            TablaRut.setModel(ModelodP);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error...");
        }
    }
    void modificarRut(){
        String id_rutina=IdRut.getText();
        String id_empleado=IdEmp.getText();
        String nombre=Nombre.getText();
        String dias=Dias.getText();
        String horarios=Horario.getText();
        try{
            if(id_rutina.equals("") || id_empleado.equals("") || nombre.equals("") || dias.equals("") || horarios.equals("")){
                JOptionPane.showMessageDialog(null, "Faltan datos.");
            }else{
                Connection ConexionGYM = CON.conectar();
                java.sql.Statement ps=ConexionGYM.createStatement();
                String sql = "update rutina set id_empleado='" + id_empleado + "',nom='" + nombre + "',dias='" + dias + "',horarios='" + horarios + "' where id_rutina='" +id_rutina+ "'; ";
                ps.executeUpdate(sql);
                ConexionGYM.close();
                JOptionPane.showMessageDialog(null, "Registro de rutina actualizado.");
                limpiarRut();
            }
            
        }catch(Exception e){
            //System.out.println("Error al modificar");
        }
        
    }
    void eliminarRut(){
        String id_rutina=IdRut.getText();
        //int fila = TablaA.getSelectedRow();
        try{
            if(id_rutina.equals("")){
               JOptionPane.showMessageDialog(null, "Rutina no seleccionada");
               limpiarRut();
            }else{
                Connection ConexionGYM = CON.conectar();
                java.sql.Statement ps=ConexionGYM.createStatement();
                String sql="delete from rutina where id_rutina='"+id_rutina+"'; ";
                ps.executeUpdate(sql);
                ConexionGYM.close();
                JOptionPane.showMessageDialog(null, "Rutina eliminado!.");
                limpiarRut();
            }
             
        }catch(Exception e){
         
        }
    
    }
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
            java.util.logging.Logger.getLogger(Rutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rutinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rutinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JButton BtAyuda;
    private javax.swing.JButton BtColor;
    private javax.swing.JButton BtVolver;
    private javax.swing.JTextField Dias;
    private javax.swing.JTextField Horario;
    private javax.swing.JTextField IdEmp;
    private javax.swing.JTextField IdRut;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTable TablaRut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
