package Telas;

import Modelo.Cidade;
import Modelo.DAOCidade;
import Modelo.DAOPessoa;
import Modelo.Pessoa;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.ListAdapter;

public class FormPessoa extends javax.swing.JFrame {

    DAOPessoa dao = new DAOPessoa();
    DAOCidade daoCidade = new DAOCidade();

    public void AtualizaTabela() {
        ListObjetos.clear();
        ListObjetos.addAll(dao.getLista());
        int linha = ListObjetos.size() - 1;
        if (linha >= 0) {
            TblObjetos.setRowSelectionInterval(linha, linha);
            TblObjetos.scrollRectToVisible(
                    TblObjetos.getCellRect(linha, linha, true));
        }
    }

    private void TrataEdicao(boolean edit) {
        BtmCancelar.setEnabled(edit);
        BtmSalvar.setEnabled(edit);
        BtmEditar.setEnabled(!edit);
        BtmExcluir.setEnabled(!edit);
        BtmNovo.setEnabled(!edit);
        BtmFechar.setEnabled(!edit);
        BtmPrimeiro.setEnabled(!edit);
        BtmProximo.setEnabled(!edit);
        BtmAnterior.setEnabled(!edit);
        BtmUltimo.setEnabled(!edit);
        jTextFieldNome.setEditable(edit);
        jComboBoxCidade.setEnabled(edit);
        txtnascimento.setEnabled(edit);
        txtsalario.setEnabled(edit);
        TblObjetos.setEnabled(!edit);
    }

    public boolean ValidaCampos() {
        if (!(jTextFieldNome.getText().length() > 0)) {
            JOptionPane.showMessageDialog(null, "Informe o nome da pessoa.");
            jTextFieldNome.requestFocus();
            return false;
        }

        if (!(jComboBoxCidade.getSelectedIndex() >= 0)) {
            JOptionPane.showMessageDialog(null, "Informe a cidade.");
            jComboBoxCidade.requestFocus();
            return false;
        }
        if ((txtnascimento.getText().length() > 0)) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            sdf.setLenient(false);
            try {
                sdf.parse(txtnascimento.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Informe a data de nascimento.");
                txtnascimento.requestFocus();
                return false;
            }
        }
            try {
                Double.parseDouble(txtsalario.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Informe o salario.");
                txtsalario.requestFocus();
                return false;
            }
        return true;
    }

    public FormPessoa() {
        initComponents();
        AtualizaTabela();
        listCidade.clear();
        listCidade.addAll(daoCidade.getLista());
        TrataEdicao(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        ListObjetos = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Pessoa>())
        ;
        listCidade = org.jdesktop.observablecollections.ObservableCollections.observableList(new ArrayList<Cidade>())
        ;
        converterData = new Modelo.ConverterData();
        PainelNavegacao = new javax.swing.JPanel();
        BtmPrimeiro = new javax.swing.JButton();
        BtmAnterior = new javax.swing.JButton();
        BtmProximo = new javax.swing.JButton();
        BtmUltimo = new javax.swing.JButton();
        BtmFechar = new javax.swing.JButton();
        Abas = new javax.swing.JTabbedPane();
        AbaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblObjetos = new javax.swing.JTable();
        AbaDados = new javax.swing.JPanel();
        PainelAcoes = new javax.swing.JPanel();
        BtmNovo = new javax.swing.JButton();
        BtmEditar = new javax.swing.JButton();
        BtmCancelar = new javax.swing.JButton();
        BtmSalvar = new javax.swing.JButton();
        BtmExcluir = new javax.swing.JButton();
        jLabelCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBoxCidade = new javax.swing.JComboBox<>();
        jLabelNascimento = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtsalario = new javax.swing.JTextField();
        javax.swing.text.MaskFormatter maskData = null;
        try{
            maskData = new javax.swing.text.MaskFormatter("##/##/####");
            maskData.setPlaceholder("_");
        }catch(Exception e){}
        txtnascimento = new javax.swing.JFormattedTextField(maskData)
        ;

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Cidades");

        PainelNavegacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));
        PainelNavegacao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PainelNavegacao.setLayout(new java.awt.GridLayout(1, 0));

        BtmPrimeiro.setText("Primeiro");
        BtmPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmPrimeiroActionPerformed(evt);
            }
        });
        PainelNavegacao.add(BtmPrimeiro);

        BtmAnterior.setText("Anterior");
        BtmAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmAnteriorActionPerformed(evt);
            }
        });
        PainelNavegacao.add(BtmAnterior);

        BtmProximo.setText("Proximo");
        BtmProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmProximoActionPerformed(evt);
            }
        });
        PainelNavegacao.add(BtmProximo);

        BtmUltimo.setText("Ultimo");
        BtmUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmUltimoActionPerformed(evt);
            }
        });
        PainelNavegacao.add(BtmUltimo);

        BtmFechar.setText("Fechar");
        BtmFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmFecharActionPerformed(evt);
            }
        });
        PainelNavegacao.add(BtmFechar);

        getContentPane().add(PainelNavegacao, java.awt.BorderLayout.NORTH);

        AbaListagem.setLayout(new java.awt.BorderLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, ListObjetos, TblObjetos);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cidade}"));
        columnBinding.setColumnName("Cidade");
        columnBinding.setColumnClass(Modelo.Cidade.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${salario}"));
        columnBinding.setColumnName("Salario");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nascimentoFormatado}"));
        columnBinding.setColumnName("Nascimento ");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(TblObjetos);

        AbaListagem.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        Abas.addTab("Listagem", AbaListagem);

        PainelAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        PainelAcoes.setLayout(new java.awt.GridLayout(1, 0));

        BtmNovo.setText("Novo");
        BtmNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmNovoActionPerformed(evt);
            }
        });
        PainelAcoes.add(BtmNovo);

        BtmEditar.setText("Editar");
        BtmEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmEditarActionPerformed(evt);
            }
        });
        PainelAcoes.add(BtmEditar);

        BtmCancelar.setText("Cancelar");
        BtmCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmCancelarActionPerformed(evt);
            }
        });
        PainelAcoes.add(BtmCancelar);

        BtmSalvar.setText("Salvar");
        BtmSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmSalvarActionPerformed(evt);
            }
        });
        PainelAcoes.add(BtmSalvar);

        BtmExcluir.setText("Excluir");
        BtmExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtmExcluirActionPerformed(evt);
            }
        });
        PainelAcoes.add(BtmExcluir);

        jLabelCodigo.setText("Código: ");

        jLabel2.setText("Nome:");

        jLabelCidade.setText("Cidades:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, TblObjetos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.codigo}"), jTextFieldCodigo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, TblObjetos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), jTextFieldNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, listCidade, jComboBoxCidade);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, TblObjetos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cidade}"), jComboBoxCidade, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jComboBoxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCidadeActionPerformed(evt);
            }
        });

        jLabelNascimento.setText("Nascimento:");

        jLabel3.setText("Salario:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, TblObjetos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.salario}"), txtsalario, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtsalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsalarioActionPerformed(evt);
            }
        });

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, TblObjetos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nascimento}"), txtnascimento, org.jdesktop.beansbinding.BeanProperty.create("value"));
        binding.setConverter(converterData);
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout AbaDadosLayout = new javax.swing.GroupLayout(AbaDados);
        AbaDados.setLayout(AbaDadosLayout);
        AbaDadosLayout.setHorizontalGroup(
            AbaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaDadosLayout.createSequentialGroup()
                .addGroup(AbaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AbaDadosLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(AbaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNascimento)
                            .addComponent(jLabel3)
                            .addComponent(jLabelCidade)
                            .addComponent(jLabel2)
                            .addComponent(jLabelCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(AbaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNome)
                            .addComponent(jComboBoxCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(AbaDadosLayout.createSequentialGroup()
                                .addGroup(AbaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(AbaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtsalario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addComponent(txtnascimento, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(65, 65, 65))
                    .addGroup(AbaDadosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PainelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
        );
        AbaDadosLayout.setVerticalGroup(
            AbaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbaDadosLayout.createSequentialGroup()
                .addComponent(PainelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AbaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AbaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(AbaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AbaDadosLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabelNascimento))
                    .addGroup(AbaDadosLayout.createSequentialGroup()
                        .addGroup(AbaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AbaDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 223, Short.MAX_VALUE))
        );

        Abas.addTab("Dados", AbaDados);

        getContentPane().add(Abas, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtmUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmUltimoActionPerformed
        int linha = TblObjetos.getRowCount() - 1;
        TblObjetos.setRowSelectionInterval(linha, linha);
        TblObjetos.scrollRectToVisible(TblObjetos.getCellRect(linha, 0, true));
    }//GEN-LAST:event_BtmUltimoActionPerformed

    private void BtmFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmFecharActionPerformed
        dispose();
    }//GEN-LAST:event_BtmFecharActionPerformed

    private void BtmNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmNovoActionPerformed
        ListObjetos.add((Pessoa) new Pessoa());
        int linha = ListObjetos.size() - 1;
        TblObjetos.setRowSelectionInterval(linha, linha);
        TrataEdicao(true);
        jTextFieldNome.requestFocus();
    }//GEN-LAST:event_BtmNovoActionPerformed

    private void jComboBoxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCidadeActionPerformed

    }//GEN-LAST:event_jComboBoxCidadeActionPerformed

    private void BtmSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmSalvarActionPerformed
        if (ValidaCampos()) {
            int linhaSelecionada = TblObjetos.getSelectedRow();
            Pessoa obj = ListObjetos.get(linhaSelecionada);
            dao.salvar(obj);
            TrataEdicao(false);
            AtualizaTabela();
        }
    }//GEN-LAST:event_BtmSalvarActionPerformed

    private void BtmEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmEditarActionPerformed
        TrataEdicao(true);
        jTextFieldNome.requestFocus();
    }//GEN-LAST:event_BtmEditarActionPerformed

    private void BtmCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmCancelarActionPerformed
        TrataEdicao(false);
        AtualizaTabela();
    }//GEN-LAST:event_BtmCancelarActionPerformed

    private void BtmExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmExcluirActionPerformed
        int opcao
                = JOptionPane.showOptionDialog(null,
                        "Confirma a exclusão!",
                        "Pergunta",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null,
                        new String[]{"Sim, Não"}, "Sim");
        if (opcao == 0) {
            int linhaSelecionada = TblObjetos.getSelectedRow();
            Pessoa obj = ListObjetos.get(linhaSelecionada);
            dao.remover(obj);
            AtualizaTabela();
        }
    }//GEN-LAST:event_BtmExcluirActionPerformed

    private void BtmPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmPrimeiroActionPerformed
        TblObjetos.setRowSelectionInterval(0, 0);
        TblObjetos.scrollRectToVisible(TblObjetos.getCellRect(0, 0, true));
    }//GEN-LAST:event_BtmPrimeiroActionPerformed

    private void BtmProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmProximoActionPerformed
        int linha = TblObjetos.getSelectedRow();
        if ((linha = 1) <= (TblObjetos.getSelectedRow())) {
            linha++;
        }
        TblObjetos.setRowSelectionInterval(linha, linha);
        TblObjetos.scrollRectToVisible(TblObjetos.getCellRect(linha, 0, true));
    }//GEN-LAST:event_BtmProximoActionPerformed

    private void BtmAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtmAnteriorActionPerformed
        int linha = TblObjetos.getSelectedRow();
        if ((linha = 1) >= 0) {
            linha--;
        }
        TblObjetos.setRowSelectionInterval(linha, linha);
        TblObjetos.scrollRectToVisible(TblObjetos.getCellRect(linha, 0, true));
    }//GEN-LAST:event_BtmAnteriorActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void txtsalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalarioActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPessoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPessoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AbaDados;
    private javax.swing.JPanel AbaListagem;
    private javax.swing.JTabbedPane Abas;
    private javax.swing.JButton BtmAnterior;
    private javax.swing.JButton BtmCancelar;
    private javax.swing.JButton BtmEditar;
    private javax.swing.JButton BtmExcluir;
    private javax.swing.JButton BtmFechar;
    private javax.swing.JButton BtmNovo;
    private javax.swing.JButton BtmPrimeiro;
    private javax.swing.JButton BtmProximo;
    private javax.swing.JButton BtmSalvar;
    private javax.swing.JButton BtmUltimo;
    private java.util.List<Pessoa> ListObjetos;
    private javax.swing.JPanel PainelAcoes;
    private javax.swing.JPanel PainelNavegacao;
    private javax.swing.JTable TblObjetos;
    private Modelo.ConverterData converterData;
    private javax.swing.JComboBox<String> jComboBoxCidade;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNascimento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private java.util.List<Cidade> listCidade;
    private javax.swing.JFormattedTextField txtnascimento;
    private javax.swing.JTextField txtsalario;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
