/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Samyra
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
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

        BarraMenu = new javax.swing.JMenuBar();
        MenuCadastro = new javax.swing.JMenu();
        MenuPessoa = new javax.swing.JMenuItem();
        MenuCidades = new javax.swing.JMenuItem();
        MenuAjuda = new javax.swing.JMenu();
        MenuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Cadastros");

        MenuCadastro.setText("Cadastros");

        MenuPessoa.setText("Pessoas");
        MenuPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPessoaActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuPessoa);

        MenuCidades.setText("Cidades");
        MenuCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCidadesActionPerformed(evt);
            }
        });
        MenuCadastro.add(MenuCidades);

        BarraMenu.add(MenuCadastro);

        MenuAjuda.setText("Ajuda");

        MenuSobre.setText("Sobre");
        MenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSobreActionPerformed(evt);
            }
        });
        MenuAjuda.add(MenuSobre);

        BarraMenu.add(MenuAjuda);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCidadesActionPerformed
        FormCidade fc = new FormCidade();
        fc.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        fc.setTitle("Manutencao de Cidades.");
        fc.setLocationRelativeTo(null);
        fc.setResizable(false);
        fc.setVisible(true);
    }//GEN-LAST:event_MenuCidadesActionPerformed

    private void MenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSobreActionPerformed
        JOptionPane.showMessageDialog(null, "Sistema de Cadastros \n Direitos reservados.");
    }//GEN-LAST:event_MenuSobreActionPerformed

    private void MenuPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPessoaActionPerformed
        FormPessoa fp = new FormPessoa();
        fp.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        fp.setTitle("Manutencao de Pessoas.");
        fp.setLocationRelativeTo(null);
        fp.setResizable(false);
        fp.setVisible(true);
    }//GEN-LAST:event_MenuPessoaActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenu MenuCadastro;
    private javax.swing.JMenuItem MenuCidades;
    private javax.swing.JMenuItem MenuPessoa;
    private javax.swing.JMenuItem MenuSobre;
    // End of variables declaration//GEN-END:variables
}
