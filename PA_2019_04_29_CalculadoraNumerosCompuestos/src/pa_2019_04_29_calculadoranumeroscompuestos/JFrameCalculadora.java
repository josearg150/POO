package pa_2019_04_29_calculadoranumeroscompuestos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aa525
 */
public class JFrameCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCalculadora
     */
    IOperacionesBasicas objetoA, objetoB;
    NumeroCompuesto ncA, ncB;
    
    public JFrameCalculadora() {
        initComponents();
    }
    
    public void crearObjetos(){
        int valor1A = Integer.parseInt(jTextValor1A.getText());
        int valor2A = Integer.parseInt(jTextValor2A.getText());
        int valor1B = Integer.parseInt(jTextValor1B.getText());
        int valor2B = Integer.parseInt(jTextValor2B.getText());
        
        if(jRBPunto.isSelected()){
            objetoA = new Punto(valor1A,valor2A);
            objetoB = new Punto(valor1B,valor2B);
        }
   
        if(jRBFraccion.isSelected()){
            objetoA = new Fraccion(valor1A,valor2A);
            objetoB = new Fraccion(valor1B,valor2B);
        }

        if(jRBComplejo.isSelected()){
            objetoA = new Complejo(valor1A,valor2A);
            objetoB = new Complejo(valor1B,valor2B);
        }
        
        ncA = (NumeroCompuesto)objetoA;
        ncB = (NumeroCompuesto)objetoB;
        
        jLabObjetoA.setText(ncA.mostrar());
        jLabObjetoB.setText(ncB.mostrar());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextValor1A = new javax.swing.JTextField();
        jTextValor2A = new javax.swing.JTextField();
        jTextValor2B = new javax.swing.JTextField();
        jTextValor1B = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButResta = new javax.swing.JButton();
        jButSuma = new javax.swing.JButton();
        jLabResultado = new javax.swing.JLabel();
        jRBPunto = new javax.swing.JRadioButton();
        jRBFraccion = new javax.swing.JRadioButton();
        jRBComplejo = new javax.swing.JRadioButton();
        jLabObjetoA = new javax.swing.JLabel();
        jLabObjetoB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor1");

        jLabel2.setText("Valor2");

        jLabel3.setText("A");

        jLabel4.setText("B");

        jButResta.setText("-");
        jButResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRestaActionPerformed(evt);
            }
        });

        jButSuma.setText("+");
        jButSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSumaActionPerformed(evt);
            }
        });

        jLabResultado.setBackground(new java.awt.Color(153, 255, 255));
        jLabResultado.setOpaque(true);

        buttonGroup1.add(jRBPunto);
        jRBPunto.setText("Punto");

        buttonGroup1.add(jRBFraccion);
        jRBFraccion.setText("Fraccion");

        buttonGroup1.add(jRBComplejo);
        jRBComplejo.setText("Complejo");

        jLabObjetoA.setBackground(new java.awt.Color(204, 255, 204));
        jLabObjetoA.setOpaque(true);

        jLabObjetoB.setBackground(new java.awt.Color(204, 255, 204));
        jLabObjetoB.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextValor1B)
                                    .addComponent(jTextValor1A, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextValor2A)
                                    .addComponent(jTextValor2B, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabObjetoA, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabObjetoB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jButSuma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButResta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBPunto)
                                .addGap(18, 18, 18)
                                .addComponent(jRBFraccion)
                                .addGap(18, 18, 18)
                                .addComponent(jRBComplejo)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBPunto)
                    .addComponent(jRBFraccion)
                    .addComponent(jRBComplejo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextValor1A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextValor2A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabObjetoA, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButResta)
                    .addComponent(jButSuma))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextValor1B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextValor2B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jLabObjetoB, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSumaActionPerformed
        crearObjetos();
        
        jLabResultado.setText(objetoA.suma(objetoB));
        jLabObjetoA.setText(ncA.mostrar());
        jLabObjetoB.setText(ncB.mostrar());
    }//GEN-LAST:event_jButSumaActionPerformed

    private void jButRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRestaActionPerformed
        crearObjetos();
        
        jLabResultado.setText(objetoA.resta(objetoB));
    }//GEN-LAST:event_jButRestaActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButResta;
    private javax.swing.JButton jButSuma;
    private javax.swing.JLabel jLabObjetoA;
    private javax.swing.JLabel jLabObjetoB;
    private javax.swing.JLabel jLabResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRBComplejo;
    private javax.swing.JRadioButton jRBFraccion;
    private javax.swing.JRadioButton jRBPunto;
    private javax.swing.JTextField jTextValor1A;
    private javax.swing.JTextField jTextValor1B;
    private javax.swing.JTextField jTextValor2A;
    private javax.swing.JTextField jTextValor2B;
    // End of variables declaration//GEN-END:variables
}