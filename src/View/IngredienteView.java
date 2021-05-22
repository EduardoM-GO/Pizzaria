/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Control.Control;
import Model.FornecedorBEAN;
import Model.IngredienteBEAN;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class IngredienteView extends javax.swing.JFrame {
    
    public IngredienteView() {
        initComponents();
      //  listar();
       // fillFornecedorCB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        erroDialog = new javax.swing.JDialog();
        erroDialog.setTitle("Erro");
        jLabel1 = new javax.swing.JLabel();
        disposeButton = new javax.swing.JButton();
        salvarButton = new javax.swing.JButton();
        desativarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        ingredienteTable = new javax.swing.JTable();
        pesquisarButton = new javax.swing.JButton();
        pesquisarTF = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        ativosCK = new javax.swing.JCheckBox();
        nomeTF = new javax.swing.JTextField();
        novoButton = new javax.swing.JButton();
        unidadeLabel = new javax.swing.JLabel();
        editarButton = new javax.swing.JButton();
        unidadeCB = new javax.swing.JComboBox<String>();
        fornecedorLabel = new javax.swing.JLabel();
        fornecedorCB = new javax.swing.JComboBox<String>();

        erroDialog.setMinimumSize(new java.awt.Dimension(273, 135));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jLabel1.setText("Dados de entrada Invalidos ");

        disposeButton.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        disposeButton.setText("Dispensar");
        disposeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disposeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout erroDialogLayout = new javax.swing.GroupLayout(erroDialog.getContentPane());
        erroDialog.getContentPane().setLayout(erroDialogLayout);
        erroDialogLayout.setHorizontalGroup(
            erroDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(erroDialogLayout.createSequentialGroup()
                .addGroup(erroDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(erroDialogLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(disposeButton))
                    .addGroup(erroDialogLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel1)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        erroDialogLayout.setVerticalGroup(
            erroDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(erroDialogLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(disposeButton)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        salvarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        salvarButton.setText("Salvar");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        desativarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        desativarButton.setText("Destivar/Ativar");
        desativarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desativarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        cancelarButton.setText("Cancelar");

        ingredienteTable.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ingredienteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tipo Unidade", "Fornecedor", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(ingredienteTable);
        if (ingredienteTable.getColumnModel().getColumnCount() > 0) {
            ingredienteTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            ingredienteTable.getColumnModel().getColumn(2).setPreferredWidth(60);
            ingredienteTable.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        pesquisarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        pesquisarButton.setText("Pesquisar");
        pesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarButtonActionPerformed(evt);
            }
        });

        pesquisarTF.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        nomeLabel.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        nomeLabel.setText("Nome");

        ativosCK.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ativosCK.setText("Ativos");

        nomeTF.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        novoButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        novoButton.setText("Novo");
        novoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoButtonActionPerformed(evt);
            }
        });

        unidadeLabel.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        unidadeLabel.setText("Tipo de Unidade");

        editarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        unidadeCB.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        unidadeCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<selecione>", "litros", "kilos", "unidade", "gramas" }));

        fornecedorLabel.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        fornecedorLabel.setText("Fornecedor");

        fornecedorCB.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        fornecedorCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<selecione>" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fornecedorCB, 0, 472, Short.MAX_VALUE)
                    .addComponent(fornecedorLabel)
                    .addComponent(unidadeLabel)
                    .addComponent(jScrollPane)
                    .addComponent(nomeLabel)
                    .addComponent(nomeTF)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pesquisarTF)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(novoButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salvarButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(desativarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelarButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ativosCK)
                                .addGap(84, 84, 84)
                                .addComponent(pesquisarButton))))
                    .addComponent(unidadeCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(nomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(unidadeLabel)
                .addGap(15, 15, 15)
                .addComponent(unidadeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fornecedorLabel)
                .addGap(18, 18, 18)
                .addComponent(fornecedorCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(novoButton)
                        .addComponent(editarButton)
                        .addComponent(salvarButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelarButton)
                        .addComponent(desativarButton)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisarButton)
                    .addComponent(pesquisarTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ativosCK))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        alterar(selectedIngrediente.getId(), nomeTF.getText(), (String) unidadeCB.getSelectedItem(), fornecedorCB.getSelectedIndex());
        listar();
        nomeTF.setText("");
        unidadeCB.setSelectedIndex(0);
        fornecedorCB.setSelectedIndex(0);
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void desativarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desativarButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) ingredienteTable.getModel();

        desativarAtivar((Integer) model.getValueAt(ingredienteTable.getSelectedRow(), 0), (Boolean) model.getValueAt(ingredienteTable.getSelectedRow(), 4));
        listar();
    }//GEN-LAST:event_desativarButtonActionPerformed

    private void pesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarButtonActionPerformed
        pesquisar(pesquisarTF.getText(), ativosCK.isSelected());
    }//GEN-LAST:event_pesquisarButtonActionPerformed

    private void novoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoButtonActionPerformed
        JOptionPane.showMessageDialog(rootPane, (String) unidadeCB.getSelectedItem());
        
       /* inserir(nomeTF.getText(),  unidadeCB.getSelectedItem().toString(), fornecedorCB.getSelectedIndex());
        listar();
        nomeTF.setText("");
        unidadeCB.setSelectedIndex(0);
        fornecedorCB.setSelectedIndex(0);*/
    }//GEN-LAST:event_novoButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) ingredienteTable.getModel();

        nomeTF.setText((String) model.getValueAt(ingredienteTable.getSelectedRow(), 1));
        unidadeCB.setSelectedItem((String) model.getValueAt(ingredienteTable.getSelectedRow(), 2));
        fornecedorCB.setSelectedItem((String) model.getValueAt(ingredienteTable.getSelectedRow(), 3));

        selectedIngrediente.setId((Integer) model.getValueAt(ingredienteTable.getSelectedRow(), 0));
    }//GEN-LAST:event_editarButtonActionPerformed

    private void disposeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disposeButtonActionPerformed
        erroDialog.dispose();
    }//GEN-LAST:event_disposeButtonActionPerformed

    IngredienteBEAN selectedIngrediente = new IngredienteBEAN();

    static Control controle = new Control();
    ArrayList<FornecedorBEAN> listaFornecedor = new ArrayList<FornecedorBEAN>();

    public static Date convert_StringToDate(String dataStr) {
        java.sql.Date data = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            data = new java.sql.Date(format.parse(dataStr).getTime());
        } catch (ParseException e) {

            e.printStackTrace();
        }
        return data;
    }

    private void fillFornecedorCB() {

        listaFornecedor = controle.listaFornecedor();

        for (FornecedorBEAN fornecedor : listaFornecedor) {
            fornecedorCB.addItem(fornecedor.getRazaoSocial());
        }

    }

    private void pesquisar(String str, boolean cbAtivo) {

        DefaultTableModel model = (DefaultTableModel) ingredienteTable.getModel();
        model.setRowCount(0);

        if (str.equals("")) {
            listar();
        }

        List<IngredienteBEAN> listaIngrediente = controle.listaIngrediente();

        for (IngredienteBEAN ingrediente : listaIngrediente) {

            boolean ativo;

            if (ingrediente.getStatus() == "ativo") {
                ativo = true;
            } else {
                ativo = false;
            }

            if (ingrediente.getNome().equals(str)) {
                if (cbAtivo == true) {
                    if (ingrediente.getStatus() == "ativo") {
                        model.addRow(new Object[]{
                            ingrediente.getId(),
                            ingrediente.getNome(),
                            ingrediente.getUnidade(),
                            ingrediente.getId_fornecedor(),
                            ativo
                        });
                    }
                } else {
                    model.addRow(new Object[]{
                        ingrediente.getId(),
                        ingrediente.getNome(),
                        ingrediente.getUnidade(),
                        ingrediente.getId_fornecedor(),
                        ativo
                    });
                }
            }
        }
    }

    private void listar() {

        DefaultTableModel model = (DefaultTableModel) ingredienteTable.getModel();

        model.setRowCount(0);

        List<IngredienteBEAN> listIngrediente = controle.listaIngrediente();
        List<FornecedorBEAN> listFornecedor = controle.listaFornecedor();

        for (IngredienteBEAN ingrediente : listIngrediente) {

            boolean ativo = false;

            if (ingrediente.getStatus() == "ativo") {
                ativo = true;
            }

            model.addRow(new Object[]{
                ingrediente.getId(),
                ingrediente.getNome(),
                ingrediente.getUnidade(),
                controle.findFornecedor(ingrediente.getId_fornecedor()).getRazaoSocial(),
                ativo
            });

        }
    }

    private void inserir(String nome, String unidade, int indexFornecedor) {

        if (indexFornecedor != 0 && !unidade.equals("<selecione>")) {
            FornecedorBEAN fornecedor = listaFornecedor.get(indexFornecedor);

            IngredienteBEAN ingrediente = new IngredienteBEAN(nome, unidade, "ativo", fornecedor.getId());

            List<IngredienteBEAN> listIngrediente = controle.listaIngrediente();

            boolean exist = false;

            for (IngredienteBEAN _ingrediente : listIngrediente) {
                if (ingrediente.getNome() == _ingrediente.getNome()
                        && ingrediente.getId_fornecedor() == _ingrediente.getId_fornecedor()) {
                    exist = true;
                }
            }

            if (!exist) {
                controle.addIngrediente(ingrediente);
            }

        } else {
            erroDialog.setVisible(true);
        }

    }

    private static void desativarAtivar(int id, boolean status) {

        IngredienteBEAN ingrediente = controle.findIngrediente(id);

        if (status == false) {
            ingrediente.setStatus("ativo");
        } else {
            ingrediente.setStatus("inativo");

        }

        controle.updateIngrediente(ingrediente);

    }

    private void alterar(int id, String nome, String unidade, int indexFornecedor) {

        if (indexFornecedor != 0 && !unidade.equals("<selecione>")) {
            FornecedorBEAN fornecedor = listaFornecedor.get(indexFornecedor);

            IngredienteBEAN ingrediente = new IngredienteBEAN(id, nome, unidade, "ativo", fornecedor.getId());

            controle.updateIngrediente(ingrediente);
        } else {
            erroDialog.setVisible(true);
        }

    }

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
            java.util.logging.Logger.getLogger(IngredienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngredienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngredienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngredienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngredienteView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ativosCK;
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton desativarButton;
    private javax.swing.JButton disposeButton;
    private javax.swing.JButton editarButton;
    private javax.swing.JDialog erroDialog;
    private javax.swing.JComboBox<String> fornecedorCB;
    private javax.swing.JLabel fornecedorLabel;
    private javax.swing.JTable ingredienteTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JButton novoButton;
    private javax.swing.JButton pesquisarButton;
    private javax.swing.JTextField pesquisarTF;
    private javax.swing.JButton salvarButton;
    private javax.swing.JComboBox<String> unidadeCB;
    private javax.swing.JLabel unidadeLabel;
    // End of variables declaration//GEN-END:variables
}