/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_06_aplicacionmatriz;

import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aa525
 */
public class JFrameCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCalculadora
     */
    private DefaultTableModel modeloA, modeloB, modeloC;
    Matriz A, B, C;
    public JFrameCalculadora() {
        initComponents();
        modeloA = (DefaultTableModel)jTableA.getModel();
        modeloB = (DefaultTableModel)jTableB.getModel();
        modeloC = (DefaultTableModel)jTableC.getModel(); 
        
        jTableA.setShowGrid(true);
        jTableB.setShowGrid(true);
        jTableC.setShowGrid(true);
        
        jSpinRenA.setValue(1);
        jSpinColA.setValue(1);
        
        jSpinRenB.setValue(1);
        jSpinColB.setValue(1);        
    }
    
    public void crearA(){
        A = new Matriz(modeloA.getRowCount(),modeloA.getColumnCount());
        
        int r,c;
        for(r = 0; r< A.getRenglones(); r++)
            for(c = 0; c< A.getColumnas(); c++)
                A.setValor(Double.parseDouble(modeloA.getValueAt(r, c)+""), r, c);
 
    }
    public void crearB(){
        B = new Matriz(modeloB.getRowCount(), modeloB.getColumnCount());
        
        int r,c;
        for(r = 0; r< B.getRenglones(); r++)
            for(c = 0; c< B.getColumnas(); c++)
                B.setValor(Double.parseDouble(modeloB.getValueAt(r, c)+""), r, c);
    }
    
    public void mostrarC(){
        int r,c;
        modeloC.setRowCount(C.getRenglones());
        modeloC.setColumnCount(C.getColumnas());
        
        jLabRenC.setText(C.getRenglones()+"");
        jLabColC.setText(C.getColumnas()+"");
        for(r = 0; r <C.getColumnas(); r++)
            for(c = 0; c<C.getColumnas(); c++)
                modeloC.setValueAt(C.getValor(r, c), r, c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTableB = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableA = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableC = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButMas = new javax.swing.JButton();
        jButPor = new javax.swing.JButton();
        jButMenos = new javax.swing.JButton();
        jTextEscalar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinRenA = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinColA = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinColB = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSpinRenB = new javax.swing.JSpinner();
        jLabRenC = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabColC = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jCheckSincronizar = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTableB);

        jTableA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(jTableA);

        jTableC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jTableC);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("=");

        jButMas.setText("+");
        jButMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButMasActionPerformed(evt);
            }
        });

        jButPor.setText("x");
        jButPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButPorActionPerformed(evt);
            }
        });

        jButMenos.setText("-");

        jLabel2.setText("Escalar");

        jLabel3.setText("Renglones");

        jSpinRenA.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinRenA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinRenAStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("x");

        jLabel5.setText("Columnas");

        jSpinColA.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinColA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinColAStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("x");

        jLabel7.setText("Columnas");

        jSpinColB.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinColB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinColBStateChanged(evt);
            }
        });

        jLabel8.setText("Renglones");

        jSpinRenB.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinRenB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinRenBStateChanged(evt);
            }
        });

        jLabRenC.setBackground(new java.awt.Color(153, 255, 255));
        jLabRenC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabRenC.setOpaque(true);

        jLabel10.setText("Renglones");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("x");

        jLabel12.setText("Columnas");

        jLabColC.setBackground(new java.awt.Color(153, 255, 255));
        jLabColC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabColC.setOpaque(true);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 204));
        jLabel14.setText("Matriz B");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 204));
        jLabel15.setText("Matriz A");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 0, 204));
        jLabel16.setText("Matriz C");

        jCheckSincronizar.setText("Sincronizar");

        jButton1.setText("Aleatorios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(jLabel15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButMas)
                                            .addComponent(jButMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButPor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel2))
                                            .addComponent(jCheckSincronizar)
                                            .addComponent(jButton1))))))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel16)))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinRenA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinColA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinRenB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinColB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabRenC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabColC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinRenA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jLabel5)
                    .addComponent(jSpinColA)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinRenB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabRenC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinColB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11)
                    .addComponent(jLabColC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jCheckSincronizar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jButMas)
                                .addGap(18, 18, 18)
                                .addComponent(jButMenos)
                                .addGap(18, 18, 18)
                                .addComponent(jButPor)
                                .addGap(18, 18, 18)
                                .addComponent(jTextEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinRenAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinRenAStateChanged
       int ren = (int)jSpinRenA.getValue();
       
       modeloA.setRowCount(ren);
       
       if(jCheckSincronizar.isSelected())
           jSpinRenB.setValue(ren);
           
    }//GEN-LAST:event_jSpinRenAStateChanged

    private void jSpinColAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinColAStateChanged
       int col = (int)jSpinColA.getValue();
       
       modeloA.setColumnCount(col);
       
       if(jCheckSincronizar.isSelected())
        jSpinColB.setValue(col);
           
    }//GEN-LAST:event_jSpinColAStateChanged

    private void jSpinRenBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinRenBStateChanged
       int ren = (int)jSpinRenB.getValue();
       
       modeloB.setRowCount(ren);
      
       if(jCheckSincronizar.isSelected())
           jSpinRenA.setValue(ren);
                  
    }//GEN-LAST:event_jSpinRenBStateChanged

    private void jSpinColBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinColBStateChanged
       int col = (int)jSpinColB.getValue();
       
       modeloB.setColumnCount(col);
       if(jCheckSincronizar.isSelected())
           jSpinColA.setValue(col);
                  
    }//GEN-LAST:event_jSpinColBStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Random azar = new Random();
        int r,c;
        for( r=0; r < modeloA.getRowCount(); r++)
            for( c = 0; c < modeloA.getColumnCount(); c++)
                modeloA.setValueAt(azar.nextInt(100), r, c);
        
        for( r=0; r < modeloB.getRowCount(); r++)
            for( c = 0; c < modeloB.getColumnCount(); c++)
                modeloB.setValueAt(azar.nextInt(100), r, c);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButMasActionPerformed
        crearA();
        crearB();
        
        C = A.suma(B);
        
        mostrarC();
                        
    }//GEN-LAST:event_jButMasActionPerformed

    private void jButPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButPorActionPerformed
        crearA();
        if(jTextEscalar.getText().equals("")){
            crearB();
            C = A.multiplicacion(B);
        }
        else{
            C = A.multiplicacion(Double.parseDouble(jTextEscalar.getText()));
        }
        mostrarC();
    }//GEN-LAST:event_jButPorActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButMas;
    private javax.swing.JButton jButMenos;
    private javax.swing.JButton jButPor;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckSincronizar;
    private javax.swing.JLabel jLabColC;
    private javax.swing.JLabel jLabRenC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSpinner jSpinColA;
    private javax.swing.JSpinner jSpinColB;
    private javax.swing.JSpinner jSpinRenA;
    private javax.swing.JSpinner jSpinRenB;
    private javax.swing.JTable jTableA;
    private javax.swing.JTable jTableB;
    private javax.swing.JTable jTableC;
    private javax.swing.JTextField jTextEscalar;
    // End of variables declaration//GEN-END:variables
}
