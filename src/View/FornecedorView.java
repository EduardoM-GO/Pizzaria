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
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author user
 */
public class FornecedorView extends javax.swing.JFrame {
 
    public FornecedorView() {
        initComponents();
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SalvarButton = new javax.swing.JButton();
        DesativarButton = new javax.swing.JButton();
        CancelarButton = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        fornecedorTable = new javax.swing.JTable();
        PesquisarButton = new javax.swing.JButton();
        pesquisarTF = new javax.swing.JTextField();
        razaoSocialLabel = new javax.swing.JLabel();
        ativosCK = new javax.swing.JCheckBox();
        razaoSocialTF = new javax.swing.JTextField();
        NovoButton = new javax.swing.JButton();
        enderecoLabel = new javax.swing.JLabel();
        enderecoTF = new javax.swing.JTextField();
        EditarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SalvarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        SalvarButton.setText("Salvar");
        SalvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarButtonActionPerformed(evt);
            }
        });

        DesativarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        DesativarButton.setText("Destivar/Ativar");
        DesativarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesativarButtonActionPerformed(evt);
            }
        });

        CancelarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        CancelarButton.setText("Cancelar");

        fornecedorTable.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        fornecedorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Razão Social", "Endereço", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(fornecedorTable);

        PesquisarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        PesquisarButton.setText("Pesquisar");
        PesquisarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarButtonActionPerformed(evt);
            }
        });

        pesquisarTF.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        razaoSocialLabel.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        razaoSocialLabel.setText("Razão Social");

        ativosCK.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        ativosCK.setText("Ativos");

        razaoSocialTF.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        NovoButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        NovoButton.setText("Novo");
        NovoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoButtonActionPerformed(evt);
            }
        });

        enderecoLabel.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        enderecoLabel.setText("Endereço");

        enderecoTF.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        EditarButton.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        EditarButton.setText("Editar");
        EditarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enderecoTF)
                    .addComponent(enderecoLabel)
                    .addComponent(jScrollPane)
                    .addComponent(razaoSocialLabel)
                    .addComponent(razaoSocialTF)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pesquisarTF)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NovoButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EditarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SalvarButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(DesativarButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CancelarButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ativosCK)
                                .addGap(84, 84, 84)
                                .addComponent(PesquisarButton)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(razaoSocialLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(razaoSocialTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enderecoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enderecoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NovoButton)
                        .addComponent(EditarButton)
                        .addComponent(SalvarButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CancelarButton)
                        .addComponent(DesativarButton)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PesquisarButton)
                    .addComponent(pesquisarTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ativosCK))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarButtonActionPerformed
        alterar(selectedFornecedor, razaoSocialTF.getText(), enderecoTF.getText());
        listar();
        razaoSocialTF.setText("");
        enderecoTF.setText("");
    }//GEN-LAST:event_SalvarButtonActionPerformed

    private void DesativarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesativarButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();

        desativarAtivar((Integer) model.getValueAt(fornecedorTable.getSelectedRow(), 0), (Boolean) model.getValueAt(fornecedorTable.getSelectedRow(), 3));
        listar();
    }//GEN-LAST:event_DesativarButtonActionPerformed

    private void PesquisarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarButtonActionPerformed
        pesquisar(pesquisarTF.getText(), ativosCK.isSelected());
    }//GEN-LAST:event_PesquisarButtonActionPerformed

    private void NovoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoButtonActionPerformed
        inserir(razaoSocialTF.getText(), enderecoTF.getText());
        listar(); 
    }//GEN-LAST:event_NovoButtonActionPerformed

    private void EditarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        razaoSocialTF.setText((String) model.getValueAt(fornecedorTable.getSelectedRow(), 1));
        enderecoTF.setText((String) model.getValueAt(fornecedorTable.getSelectedRow(), 2));

        selectedFornecedor.setRazaoSocial((String) model.getValueAt(fornecedorTable.getSelectedRow(), 1));
        selectedFornecedor.setEndereco((String) model.getValueAt(fornecedorTable.getSelectedRow(), 2));
    }//GEN-LAST:event_EditarButtonActionPerformed

    FornecedorBEAN selectedFornecedor = new FornecedorBEAN();

    static Control controle = new Control();
    static ArrayList<FornecedorBEAN> listaFornecedor = new ArrayList<FornecedorBEAN>();

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

    private void pesquisar(String str, boolean ativo) {

        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();
        model.setRowCount(0);

        if (str.equals("")) {
            listar();
        }

        List<FornecedorBEAN> listaContatos = controle.listaFornecedor();

        for (FornecedorBEAN fornecedor : listaContatos) {

            if (fornecedor.getRazaoSocial().equals(str)) {
                if (ativo == true) {
                    if (fornecedor.getStatus() == 1) {
                        model.addRow(new Object[]{
                            fornecedor.getId(),
                            fornecedor.getRazaoSocial(),
                            fornecedor.getEndereco(),
                            ativo
                        });
                    }
                } else {
                    model.addRow(new Object[]{
                        fornecedor.getId(),
                        fornecedor.getRazaoSocial(),
                        fornecedor.getEndereco(),
                        ativo
                    });
                }
            }
        }
    }

    private void listar() {

        DefaultTableModel model = (DefaultTableModel) fornecedorTable.getModel();

        model.setRowCount(0);

        List<FornecedorBEAN> listaContatos = controle.listaFornecedor();
        for (FornecedorBEAN fornecedor : listaContatos) {

            boolean ativo = false;
            if (fornecedor.getStatus() == 1) {
                ativo = true;
            }

            model.addRow(new Object[]{
                fornecedor.getId(),
                fornecedor.getRazaoSocial(),
                fornecedor.getEndereco(),
                ativo
            });

        }
    }

    private void inserir(String razaoSocial, String endereco) {

        razaoSocial = razaoSocialTF.getText();

        endereco = enderecoTF.getText();

        FornecedorBEAN fornecedor = new FornecedorBEAN(0, razaoSocial, endereco);

        controle.addFornecedor(fornecedor);

    }

    private static void desativarAtivar(int id, boolean status) {
        
        FornecedorBEAN fornecedor = controle.findFornecedor(id);

        if (status == true) {
            
            fornecedor.setStatus(0); // blz primeiramente tem que dar o alter table blz agora ja n sei Rafaella, eu devo ter colocado numero errado em algum lugar
        }
        System.out.println(" status do fornecedor"+fornecedor.getStatus());
       
        
        controle.updateFornecedor(fornecedor); 

    }

    private static void alterar(FornecedorBEAN selectedFornecedor, String razaoSocial, String endereco) {

        FornecedorBEAN fornecedor = new FornecedorBEAN(
                controle.findIdFornecedor(selectedFornecedor),
                razaoSocial, endereco);

        controle.updateFornecedor(fornecedor);
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
            java.util.logging.Logger.getLogger(FornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FornecedorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FornecedorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarButton;
    private javax.swing.JButton DesativarButton;
    private javax.swing.JButton EditarButton;
    private javax.swing.JButton NovoButton;
    private javax.swing.JButton PesquisarButton;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JCheckBox ativosCK;
    private javax.swing.JLabel enderecoLabel;
    private javax.swing.JTextField enderecoTF;
    private javax.swing.JTable fornecedorTable;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField pesquisarTF;
    private javax.swing.JLabel razaoSocialLabel;
    private javax.swing.JTextField razaoSocialTF;
    // End of variables declaration//GEN-END:variables
}