/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_13_aplicacionarregloencapsulado;

import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aa514
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
        jTableDatos.setShowGrid(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jSpinDatos = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jButAleatorios = new javax.swing.JButton();
        jButCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabSuma = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabPromedio = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabMayor = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabMenor = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabRango = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabMediana = new javax.swing.JLabel();
        jButOrdenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dato", "Ordenar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDatos);

        jSpinDatos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinDatosStateChanged(evt);
            }
        });

        jLabel1.setText("Número de datos: ");

        jButAleatorios.setText("Aleatorios");
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jButCalcular.setText("Calcular");
        jButCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCalcularActionPerformed(evt);
            }
        });

        jLabel2.setText("Suma:");

        jLabSuma.setBackground(new java.awt.Color(255, 255, 204));
        jLabSuma.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabSuma.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabSuma.setOpaque(true);

        jLabel4.setText("Promedio:");

        jLabPromedio.setBackground(new java.awt.Color(255, 255, 204));
        jLabPromedio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabPromedio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabPromedio.setOpaque(true);

        jLabel6.setText("Mayor:");

        jLabMayor.setBackground(new java.awt.Color(255, 255, 204));
        jLabMayor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabMayor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabMayor.setOpaque(true);

        jLabel8.setText("Menor:");

        jLabMenor.setBackground(new java.awt.Color(255, 255, 204));
        jLabMenor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabMenor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabMenor.setOpaque(true);

        jLabel10.setText("Rango:");

        jLabRango.setBackground(new java.awt.Color(255, 255, 204));
        jLabRango.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabRango.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabRango.setOpaque(true);

        jLabel12.setText("Mediana:");

        jLabMediana.setBackground(new java.awt.Color(255, 255, 204));
        jLabMediana.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabMediana.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabMediana.setOpaque(true);

        jButOrdenar.setText("Ordenar");
        jButOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSpinDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButAleatorios)
                                .addGap(18, 18, 18)
                                .addComponent(jButCalcular))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabRango, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabMediana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButAleatorios)
                    .addComponent(jButCalcular))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButOrdenar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabRango, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabMediana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        Random azar = new Random();
        
        for(int r = 0; r<jTableDatos.getRowCount(); r++){
            jTableDatos.setValueAt(azar.nextInt(1000),r , 0);
        }
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jSpinDatosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinDatosStateChanged
        DefaultTableModel modelo = (DefaultTableModel)jTableDatos.getModel();
        
        modelo.setRowCount(Integer.parseInt(jSpinDatos.getValue()+""));
    }//GEN-LAST:event_jSpinDatosStateChanged

    private void jButCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCalcularActionPerformed
        
        Arreglo uno = new Arreglo (jTableDatos.getRowCount());
        for(int r=0 ; r< uno.getTamaño(); r++){
            uno.setValor(Double.parseDouble(jTableDatos.getValueAt(r, 0)+""), r);
            
            jLabSuma.setText(uno.suma()+"");
            jLabPromedio.setText(uno.promedio()+"");
            jLabMayor.setText(uno.mayor()+"");
            jLabMenor.setText(uno.menor()+"");
            jLabRango.setText(uno.rango()+"");
            jLabMediana.setText(uno.mediana()+"");
        }
    }//GEN-LAST:event_jButCalcularActionPerformed

    private void jButOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButOrdenarActionPerformed
        Arreglo uno = new Arreglo (jTableDatos.getRowCount());
        for(int r=0 ; r< uno.getTamaño(); r++){
            uno.setValor(Double.parseDouble(jTableDatos.getValueAt(r, 0)+""), r);
        }
        double []x = uno.arregloOrdenado();
        for(int r=0; r< x.length; r++){
            jTableDatos.setValueAt(x[r],r ,1);
        }
    }//GEN-LAST:event_jButOrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButCalcular;
    private javax.swing.JButton jButOrdenar;
    private javax.swing.JLabel jLabMayor;
    private javax.swing.JLabel jLabMediana;
    private javax.swing.JLabel jLabMenor;
    private javax.swing.JLabel jLabPromedio;
    private javax.swing.JLabel jLabRango;
    private javax.swing.JLabel jLabSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinDatos;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}