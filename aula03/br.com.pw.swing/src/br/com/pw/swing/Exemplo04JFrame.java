/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pw.swing;

import javax.swing.JOptionPane;

/**
 *
 * @author 51977
 */
public class Exemplo04JFrame extends javax.swing.JFrame {

    /**
     * Creates new form Exemplo04JFrame
     */
    public Exemplo04JFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jCheckBoxVestimenta = new javax.swing.JCheckBox();
        jCheckBoxMoradia = new javax.swing.JCheckBox();
        jCheckBoxViagem = new javax.swing.JCheckBox();
        jCheckBoxPasse = new javax.swing.JCheckBox();
        jRadioButtonAposentadoSim = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonAposentadoNao = new javax.swing.JRadioButton();
        jButtonSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaEmpregados = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Auxilios");

        jCheckBoxVestimenta.setText("Veistimenta");
        jCheckBoxVestimenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxVestimentaActionPerformed(evt);
            }
        });

        jCheckBoxMoradia.setText("Moradia");
        jCheckBoxMoradia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMoradiaActionPerformed(evt);
            }
        });

        jCheckBoxViagem.setText("viagem");

        jCheckBoxPasse.setText("Passe");

        buttonGroup1.add(jRadioButtonAposentadoSim);
        jRadioButtonAposentadoSim.setText("sim");
        jRadioButtonAposentadoSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAposentadoSimActionPerformed(evt);
            }
        });

        jLabel3.setText("Aposentado");

        buttonGroup1.add(jRadioButtonAposentadoNao);
        jRadioButtonAposentadoNao.setText("não");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Empregados");

        jTextAreaEmpregados.setColumns(20);
        jTextAreaEmpregados.setRows(5);
        jScrollPane3.setViewportView(jTextAreaEmpregados);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(115, 115, 115)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextFieldNome)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBoxPasse)
                                .addComponent(jCheckBoxViagem)
                                .addComponent(jCheckBoxMoradia)
                                .addComponent(jLabel2)
                                .addComponent(jCheckBoxVestimenta))
                            .addGap(90, 90, 90)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRadioButtonAposentadoSim)
                                .addComponent(jRadioButtonAposentadoNao)
                                .addComponent(jLabel3)))))
                .addGap(33, 33, 33)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxVestimenta)
                            .addComponent(jRadioButtonAposentadoSim))
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBoxMoradia)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxViagem)
                            .addComponent(jRadioButtonAposentadoNao))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jButtonSalvar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxPasse)))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonAposentadoSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAposentadoSimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAposentadoSimActionPerformed

    private void jCheckBoxVestimentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxVestimentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxVestimentaActionPerformed

    private void jCheckBoxMoradiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMoradiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMoradiaActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        String nome = jTextFieldNome.getText();
        double salario = 15000.00;

        if (nome.trim().length() < 3) {
            JOptionPane.showMessageDialog(null, "Nome deve conter no minimo 3 caracteris");
            jTextFieldNome.requestFocus();
            return;
        }
        if (jRadioButtonAposentadoNao.isSelected() == false
                && jRadioButtonAposentadoSim.isSelected() == false) {
            JOptionPane.showMessageDialog(this, "Selecione a opção da aposentadoria");
            return;
        }

        if (jRadioButtonAposentadoSim.isSelected() == true) {
            salario = salario + 3000;
        }

        if (jCheckBoxMoradia.isSelected() == true) {
            salario = salario + 1500;
        }

        if (jCheckBoxPasse.isSelected() == true) {

            salario = salario + 10000;
        }
        if (jCheckBoxVestimenta.isSelected() == true) {
            salario = salario + 5000;
        }
        if (jCheckBoxViagem.isSelected() == true) {
            salario = salario + 2000;
        }
        jTextAreaEmpregados.append(nome + " ganha R$" + salario + "\n");

        limparCampos();


    }//GEN-LAST:event_jButtonSalvarActionPerformed
    private void limparCampos() {
        jTextFieldNome.setText("");
        buttonGroup1.clearSelection();
        jCheckBoxMoradia.setSelected(false);
        jCheckBoxPasse.setSelected(false);
        jCheckBoxVestimenta.setSelected(false);
        jCheckBoxViagem.setSelected(false);

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
            java.util.logging.Logger.getLogger(Exemplo04JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo04JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo04JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo04JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo04JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxMoradia;
    private javax.swing.JCheckBox jCheckBoxPasse;
    private javax.swing.JCheckBox jCheckBoxVestimenta;
    private javax.swing.JCheckBox jCheckBoxViagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButtonAposentadoNao;
    private javax.swing.JRadioButton jRadioButtonAposentadoSim;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextAreaEmpregados;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}