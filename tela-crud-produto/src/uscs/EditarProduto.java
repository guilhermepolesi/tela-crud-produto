/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uscs;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author guilherme
 */
public class EditarProduto extends javax.swing.JDialog {

    private static Produto produto;
    private ProdutoListener produtoListener;
    ProdutoController produtoController = ProdutoController.getInstance();
    
    
   public EditarProduto(java.awt.Frame parent, boolean modal, ProdutoListener produtoListener, Produto produto) {
        super(parent, modal);
        this.produtoListener = produtoListener;
        initComponents();
        this.produto = produto;
        configurarCampos(this.produto);
   }
   


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeLabel = new javax.swing.JLabel();
        referenciaLabel = new javax.swing.JLabel();
        marcaLabel = new javax.swing.JLabel();
        categoriaLabel = new javax.swing.JLabel();
        nomeProdutoText = new javax.swing.JTextField();
        referenciaProdutoText = new javax.swing.JTextField();
        marcaProdutoText = new javax.swing.JTextField();
        categoriaProdutoText = new javax.swing.JTextField();
        botãoSalvar = new javax.swing.JButton();
        precoLabel = new javax.swing.JLabel();
        precoProdutoText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        idProduto = new javax.swing.JLabel();
        cancelarCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Produto");
        setLocation(new java.awt.Point(200, 200));

        nomeLabel.setText("Nome");

        referenciaLabel.setText("Referência");

        marcaLabel.setText("Marca");

        categoriaLabel.setText("Categoria");

        botãoSalvar.setText("Salvar");
        botãoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoSalvarActionPerformed(evt);
            }
        });

        precoLabel.setText("Preço");

        precoProdutoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoProdutoTextActionPerformed(evt);
            }
        });

        jLabel1.setText("Id");

        cancelarCadastro.setText("Cancelar");
        cancelarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(idProduto))
                    .addComponent(precoLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cancelarCadastro)
                            .addGap(18, 18, 18)
                            .addComponent(botãoSalvar))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(referenciaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(marcaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(categoriaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(categoriaProdutoText)
                                .addComponent(precoProdutoText)
                                .addComponent(nomeProdutoText, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(referenciaProdutoText)
                                .addComponent(marcaProdutoText)))))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idProduto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeLabel)
                    .addComponent(nomeProdutoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(referenciaLabel)
                    .addComponent(referenciaProdutoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaLabel)
                    .addComponent(marcaProdutoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaLabel)
                    .addComponent(categoriaProdutoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(precoLabel)
                    .addComponent(precoProdutoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelarCadastro)
                    .addComponent(botãoSalvar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarCampos(Produto produto) {
        idProduto.setText(Integer.toString(produto.getId()));
        nomeProdutoText.setText(produto.getNome());
        referenciaProdutoText.setText(produto.getReferencia());
        marcaProdutoText.setText(produto.getMarca());
        categoriaProdutoText.setText(produto.getCategoria());
        precoProdutoText.setText(produtoController.formatarDoubleParaString(produto.getPreco()));
    }
    
    private void botãoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoSalvarActionPerformed
        
        if (nomeProdutoText.getText().isEmpty() || referenciaProdutoText.getText().isEmpty() || 
            marcaProdutoText.getText().isEmpty() || categoriaProdutoText.getText().isEmpty() ||
            precoProdutoText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            produto.setNome(nomeProdutoText.getText());
            produto.setReferencia(referenciaProdutoText.getText());
            produto.setMarca(marcaProdutoText.getText());
            produto.setCategoria(categoriaProdutoText.getText());
            produto.setPreco(Double.parseDouble(produtoController.formatarStringParaPattern(precoProdutoText.getText())));
            System.out.println(produto);
            produtoListener.produtoCadastrado(produto);
            
            dispose();
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira um valor numérico válido para o preço.", "Erro", JOptionPane.ERROR_MESSAGE);
        } 
        
        
    }//GEN-LAST:event_botãoSalvarActionPerformed

    private void precoProdutoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoProdutoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoProdutoTextActionPerformed

    private void cancelarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCadastroActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProdutoView viewProduto = new ProdutoView();
                EditarProduto dialog = new EditarProduto(new javax.swing.JFrame(), true, viewProduto, produto);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
   

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botãoSalvar;
    private javax.swing.JButton cancelarCadastro;
    private javax.swing.JLabel categoriaLabel;
    private javax.swing.JTextField categoriaProdutoText;
    private javax.swing.JLabel idProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel marcaLabel;
    private javax.swing.JTextField marcaProdutoText;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeProdutoText;
    private javax.swing.JLabel precoLabel;
    private javax.swing.JTextField precoProdutoText;
    private javax.swing.JLabel referenciaLabel;
    private javax.swing.JTextField referenciaProdutoText;
    // End of variables declaration//GEN-END:variables
}


