/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Geral
 */
public class Exemplo4 extends javax.swing.JFrame {

    /**
     * Creates new form Exemplo4
     */
    public Exemplo4() {
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

        jCkbInformática = new javax.swing.JCheckBox();
        jCkbIngles = new javax.swing.JCheckBox();
        jBtnVerificar = new javax.swing.JButton();
        jBtnDesmarcar = new javax.swing.JButton();
        jBtnMarcar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCkbInformática.setText("Informática");
        jCkbInformática.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCkbInformáticaActionPerformed(evt);
            }
        });

        jCkbIngles.setText("Inglês");
        jCkbIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCkbInglesActionPerformed(evt);
            }
        });

        jBtnVerificar.setText("Verificar");
        jBtnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerificarActionPerformed(evt);
            }
        });

        jBtnDesmarcar.setText("Desmarcar");
        jBtnDesmarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDesmarcarActionPerformed(evt);
            }
        });

        jBtnMarcar.setText("Marcar");
        jBtnMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnMarcarActionPerformed(evt);
            }
        });

        jMenu2.setMnemonic('s');
        jMenu2.setText("Sair");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnDesmarcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCkbIngles, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCkbInformática, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnMarcar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jCkbInformática)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCkbIngles)
                .addGap(18, 18, 18)
                .addComponent(jBtnVerificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnDesmarcar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnMarcar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCkbInformáticaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCkbInformáticaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCkbInformáticaActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jCkbInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCkbInglesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCkbInglesActionPerformed

    private void jBtnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerificarActionPerformed
        if(!jCkbIngles.isSelected() && !jCkbInformática.isSelected()){
            JOptionPane.showMessageDialog(null, "Nenhum Curso Selecionado!");
        }
        else{
            String selecao="Selecionados: ";
            if(jCkbInformática.isSelected()){
                selecao+="\n"+jCkbInformática.getText();
            }
            if(jCkbIngles.isSelected()){
                selecao+="\n"+jCkbIngles.getText();
            }      
            if(!jCkbIngles.isSelected() && !jCkbInformática.isSelected()){
                JOptionPane.showMessageDialog(null, "Nenhum Curso Selecionado!");
            }
            JOptionPane.showMessageDialog(null, selecao);
        }
        
    }//GEN-LAST:event_jBtnVerificarActionPerformed

    private void jBtnDesmarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDesmarcarActionPerformed
        jCkbInformática.setSelected(false);
        jCkbIngles.setSelected(false);
    }//GEN-LAST:event_jBtnDesmarcarActionPerformed

    private void jBtnMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnMarcarActionPerformed
        jCkbInformática.setSelected(true);
        jCkbIngles.setSelected(true);
    }//GEN-LAST:event_jBtnMarcarActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenu2ActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDesmarcar;
    private javax.swing.JButton jBtnMarcar;
    private javax.swing.JButton jBtnVerificar;
    private javax.swing.JCheckBox jCkbInformática;
    private javax.swing.JCheckBox jCkbIngles;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
