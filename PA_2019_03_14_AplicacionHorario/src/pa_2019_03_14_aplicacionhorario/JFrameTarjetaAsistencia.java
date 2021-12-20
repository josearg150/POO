/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_14_aplicacionhorario;

import Utilerias.JTable.ColorCeldas;
import java.awt.Color;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aa534
 */
public class JFrameTarjetaAsistencia extends javax.swing.JFrame {

    /**
     * Creates new form JFrameTarjetaAsistencia
     */
    DefaultTableModel modelo;
    public JFrameTarjetaAsistencia() {
        initComponents();
        modelo = (DefaultTableModel)jTableEmpleados.getModel();
        jTableEmpleados.setShowGrid(true);
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
        jTableEmpleados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSpinEmpleados = new javax.swing.JSpinner();
        jButAleatoriios = new javax.swing.JButton();
        jButCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabTotal = new javax.swing.JLabel();
        jButArregloFrame = new javax.swing.JButton();
        jButArregloEncapsulado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButArregloParalelo = new javax.swing.JButton();
        jButColor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empleado", "Horas", "Min", "Seg", "Horas", "Min", "Seg", "TiempoTrab"
            }
        ));
        jScrollPane1.setViewportView(jTableEmpleados);
        if (jTableEmpleados.getColumnModel().getColumnCount() > 0) {
            jTableEmpleados.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTableEmpleados.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        jLabel1.setText("No.Empleados");

        jSpinEmpleados.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinEmpleados.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinEmpleadosStateChanged(evt);
            }
        });

        jButAleatoriios.setText("Aleatorios");
        jButAleatoriios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriiosActionPerformed(evt);
            }
        });

        jButCalcular.setText("Calcular");
        jButCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCalcularActionPerformed(evt);
            }
        });

        jLabel2.setText("Total");

        jLabTotal.setBackground(new java.awt.Color(153, 255, 255));
        jLabTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabTotal.setOpaque(true);

        jButArregloFrame.setText("Arreglo en frame");
        jButArregloFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButArregloFrameActionPerformed(evt);
            }
        });

        jButArregloEncapsulado.setText("Arreglo encapsulado");
        jButArregloEncapsulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButArregloEncapsuladoActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(153, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Salida");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(153, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Entrada");
        jLabel4.setOpaque(true);

        jButArregloParalelo.setText("Arreglo paralelo");
        jButArregloParalelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButArregloParaleloActionPerformed(evt);
            }
        });

        jButColor.setText("Color");
        jButColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButAleatoriios)
                        .addGap(28, 28, 28)
                        .addComponent(jButCalcular)
                        .addGap(37, 37, 37)
                        .addComponent(jButArregloFrame)
                        .addGap(18, 18, 18)
                        .addComponent(jButArregloEncapsulado)
                        .addGap(18, 18, 18)
                        .addComponent(jButArregloParalelo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButColor, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jSpinEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButAleatoriios)
                        .addComponent(jButCalcular)
                        .addComponent(jButArregloFrame)
                        .addComponent(jButArregloEncapsulado)
                        .addComponent(jButArregloParalelo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButColor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinEmpleadosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinEmpleadosStateChanged
        modelo.setRowCount((int)jSpinEmpleados.getValue() );
    }//GEN-LAST:event_jSpinEmpleadosStateChanged

    private void jButAleatoriiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriiosActionPerformed
        Random azar = new Random();
        for (int r = 0; r < modelo.getRowCount(); r++) {
            jTableEmpleados.setValueAt(Nombre.nextNombreCompleto(), r, 0);
            //hora de entrada
            jTableEmpleados.setValueAt(7+azar.nextInt(3), r, 1);//hora de entrada
            jTableEmpleados.setValueAt(azar.nextInt(60), r, 2);//minutos
            jTableEmpleados.setValueAt(azar.nextInt(60), r, 3);//segundos
            
            //hora de salida
            jTableEmpleados.setValueAt(15+azar.nextInt(4), r, 4);//hora de entrada
            jTableEmpleados.setValueAt(azar.nextInt(60), r, 5);//minutos
            jTableEmpleados.setValueAt(azar.nextInt(60), r, 6);//segundos
        }
    }//GEN-LAST:event_jButAleatoriiosActionPerformed

    private void jButCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCalcularActionPerformed
        Horario entrada = new Horario(),  salida = new Horario();
        Horario tiempoTrabajado;
        Horario totalTiempo = new Horario();
        for(int r = 0 ; r < modelo.getRowCount(); r++){
            entrada.setHoras(Integer.parseInt(jTableEmpleados.getValueAt(r, 1)+""));
            entrada.setMinutos(Integer.parseInt(jTableEmpleados.getValueAt(r, 2)+"") );
            entrada.setSegundos(Integer.parseInt(jTableEmpleados.getValueAt(r, 3)+"") );
            
            salida.setHoras(Integer.parseInt(jTableEmpleados.getValueAt(r, 4)+""));
            salida.setMinutos(Integer.parseInt(jTableEmpleados.getValueAt(r, 5)+"") );
            salida.setSegundos(Integer.parseInt(jTableEmpleados.getValueAt(r, 6)+"") );
            
            tiempoTrabajado = salida.resta(entrada);
            jTableEmpleados.setValueAt(tiempoTrabajado, r, 7);
            
            totalTiempo = totalTiempo.suma(tiempoTrabajado);
        }
        jLabTotal.setText(totalTiempo.toString());
    }//GEN-LAST:event_jButCalcularActionPerformed

    private void jButArregloFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButArregloFrameActionPerformed
        Empleado []asistencia = new Empleado[modelo.getRowCount()];

        Horario ent = new Horario();
        Horario sal = new Horario();
        for(int r = 0; r < asistencia.length; r++){

            ent.setHoras(Integer.parseInt(modelo.getValueAt(r, 1)+"") );
            ent.setMinutos(Integer.parseInt(modelo.getValueAt(r, 2)+"") );
            ent.setSegundos(Integer.parseInt(modelo.getValueAt(r, 3)+"") );
            
            sal.setHoras(Integer.parseInt(modelo.getValueAt(r, 4)+"") );
            sal.setMinutos(Integer.parseInt(modelo.getValueAt(r, 5)+"") );
            sal.setSegundos(Integer.parseInt(modelo.getValueAt(r, 6)+"") );
            
            asistencia[r] = new Empleado(modelo.getValueAt(r, 0)+"", ent, sal);
        }
        
        //Ordenamiento horas trabajadas
        for (int i = 0; i < asistencia.length-1; i++) 
            for (int j = i+1; j < asistencia.length; j++) 
                //Arreglo ascendente
                if(asistencia[i].tiempoTrabajado().segundosTotales() > asistencia[j].tiempoTrabajado().segundosTotales() ){
                    Empleado aux = asistencia[i];
                    asistencia[i] = asistencia[j];
                    asistencia[j] = aux;
                }
        //Mostramos el arreglo
        for(int r = 0; r < modelo.getRowCount(); r++){
            modelo.setValueAt(asistencia[r].getNombre(), r, 0);
            modelo.setValueAt(asistencia[r].getEntrada().getHoras(), r, 1);
            modelo.setValueAt(asistencia[r].getEntrada().getMinutos(), r, 2);
            modelo.setValueAt(asistencia[r].getEntrada().getSegundos(), r, 3);
            
            modelo.setValueAt(asistencia[r].getSalida().getHoras(), r, 4);
            modelo.setValueAt(asistencia[r].getSalida().getMinutos(), r, 5);
            modelo.setValueAt(asistencia[r].getSalida().getSegundos(), r, 6);
            
            modelo.setValueAt(asistencia[r].tiempoTrabajado(), r, 7);          
        }
        
    }//GEN-LAST:event_jButArregloFrameActionPerformed

    private void jButArregloEncapsuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButArregloEncapsuladoActionPerformed
        Empresa soriana =  new Empresa(modelo.getRowCount());
        
        for(int r = 0; r< modelo.getRowCount(); r++){
            Horario ent = new Horario((int)modelo.getValueAt(r, 1), (int)modelo.getValueAt(r, 2), (int)modelo.getValueAt(r, 3));
            Horario sal = new Horario((int)modelo.getValueAt(r, 4), (int)modelo.getValueAt(r, 5), (int)modelo.getValueAt(r, 6));
            
            Empleado x = new Empleado(modelo.getValueAt(r, 0)+"", ent, sal);
            
            soriana.setEmpleado(x, r);
        }
        soriana.ordenar();
        
        for(int r = 0; r< modelo.getRowCount(); r++){
            modelo.setValueAt(soriana.getEmpleado(r).getNombre(), r, 0);
            modelo.setValueAt(soriana.getEmpleado(r).getEntrada().getHoras(), r, 1);
            modelo.setValueAt(soriana.getEmpleado(r).getEntrada().getMinutos(), r, 2);
            modelo.setValueAt(soriana.getEmpleado(r).getEntrada().getSegundos(), r, 3);
            
            modelo.setValueAt(soriana.getEmpleado(r).getSalida().getHoras(), r, 4);
            modelo.setValueAt(soriana.getEmpleado(r).getSalida().getMinutos(), r, 5);
            modelo.setValueAt(soriana.getEmpleado(r).getSalida().getSegundos(), r, 6);
           
            modelo.setValueAt(soriana.getEmpleado(r).tiempoTrabajado(), r, 7);
        }
    }//GEN-LAST:event_jButArregloEncapsuladoActionPerformed

    private void jButArregloParaleloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButArregloParaleloActionPerformed
        String []nombres = new String[modelo.getRowCount()];
        Horario []entradas = new Horario[nombres.length];
        Horario []salidas = new Horario[nombres.length];
        Horario []tiempos = new Horario[nombres.length];
        
        for(int r = 0; r< modelo.getRowCount(); r++){
            Horario ent = new Horario((int)modelo.getValueAt(r, 1), (int)modelo.getValueAt(r, 2), (int)modelo.getValueAt(r, 3));
            Horario sal = new Horario((int)modelo.getValueAt(r, 4), (int)modelo.getValueAt(r, 5), (int)modelo.getValueAt(r, 6));
            nombres[r] = modelo.getValueAt(r, 0)+"";
            entradas[r] = ent;
            salidas[r] = sal;
            
            tiempos[r] = sal.resta(ent);
        }
          
        for(int i = 0; i< tiempos.length-1; i++)
            for(int j= i+1; j< tiempos.length; j++)
                if(tiempos[i].segundosTotales() > tiempos[j].segundosTotales()){
                    Horario aux = tiempos[i];
                    tiempos[i] = tiempos[j];
                    tiempos[j] = aux;
                    
                    aux = entradas[i];
                    entradas[i] = entradas[j];
                    entradas[j] = aux;
                    
                    aux = salidas[i];
                    salidas[i] = salidas[j];
                    salidas[j] = aux;
                    
                    String auxn = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] =auxn;
                } 
        
        for(int r = 0; r < modelo.getRowCount(); r++){
            modelo.setValueAt(nombres[r], r, 0);
            modelo.setValueAt(entradas[r].getHoras(), r, 1);
            modelo.setValueAt(entradas[r].getMinutos(), r, 2);
            modelo.setValueAt(entradas[r].getSegundos(), r, 3);
            modelo.setValueAt(salidas[r].getHoras(), r, 4);
            modelo.setValueAt(salidas[r].getMinutos(), r, 5);
            modelo.setValueAt(salidas[r].getSegundos(), r, 6);
            
            modelo.setValueAt(tiempos[r], r, 7);
            }
    }//GEN-LAST:event_jButArregloParaleloActionPerformed

    private void jButColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButColorActionPerformed
        ColorCeldas celdas = new ColorCeldas(jTableEmpleados);
        
        celdas.addCelda(0, 0, Color.yellow);
        celdas.addCelda(modelo.getRowCount()-1, modelo.getColumnCount()-1, Color.pink);
        
        celdas.repaint();
        
    }//GEN-LAST:event_jButColorActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameTarjetaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTarjetaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTarjetaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTarjetaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTarjetaAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatoriios;
    private javax.swing.JButton jButArregloEncapsulado;
    private javax.swing.JButton jButArregloFrame;
    private javax.swing.JButton jButArregloParalelo;
    private javax.swing.JButton jButCalcular;
    private javax.swing.JButton jButColor;
    private javax.swing.JLabel jLabTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinEmpleados;
    private javax.swing.JTable jTableEmpleados;
    // End of variables declaration//GEN-END:variables
}
