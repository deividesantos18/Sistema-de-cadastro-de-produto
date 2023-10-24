/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.ProdutoDAO;
import DTO.ProdutoDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author deivi
 */
public class ViewJTable extends javax.swing.JFrame {

    /**
     * Creates new form ViewJTable
     */
    public ViewJTable() {
        initComponents();
        txtDesc.requestFocus();
        Listarprodutoso();
        DefaultTableModel modelo = (DefaultTableModel) tabelaprodutos.getModel();
        tabelaprodutos.setRowSorter(new TableRowSorter(modelo));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtQTD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        btnalterar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaprodutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        jLabel1.setText("DESCRIÇÃO");

        txtDesc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDescMouseClicked(evt);
            }
        });
        txtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescActionPerformed(evt);
            }
        });

        jLabel2.setText("QTD");

        txtQTD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTDActionPerformed(evt);
            }
        });

        jLabel3.setText("PREÇO");

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });

        btnalterar.setText("Atualizar");
        btnalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalterarActionPerformed(evt);
            }
        });

        jLabel4.setText("Codigo");

        txtcodigo.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton1))
                    .addComponent(jLabel4)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnexcluir)
                        .addGap(41, 41, 41)
                        .addComponent(btnalterar)
                        .addGap(60, 525, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(153, 153, 153))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnexcluir)
                    .addComponent(btnalterar))
                .addGap(32, 32, 32))
        );

        tabelaprodutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DESCRIÇÃO", "QTD", "PREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaprodutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaprodutosMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tabelaprodutosMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaprodutos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQTDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQTDActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        cadastrarproduto();
        Listarprodutoso();
        limparcampos();

//DefaultTableModel  dtmProdutos=(DefaultTableModel)jtProdutos.getModel();
//Object[] dados={txtDesc.getText(),txtQTD.getText(),txtPreco.getText()};
//
//dtmProdutos.addRow(dados);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed
excluirproduto();
Listarprodutoso();
limparcampos();

//        if (tabelaprodutos.getSelectedRow() != -1) {
//            DefaultTableModel dtmProdutos = (DefaultTableModel) tabelaprodutos.getModel();
//            dtmProdutos.removeRow(tabelaprodutos.getSelectedRow());
//            //System.out.println("Linha selecionada:"+jtProdutos.getSelectedRow());
//        } else {
//            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir");
//        }
    }//GEN-LAST:event_btnexcluirActionPerformed

    private void tabelaprodutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaprodutosMouseClicked

      carregarcampos();

    }//GEN-LAST:event_tabelaprodutosMouseClicked

    private void tabelaprodutosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaprodutosMouseReleased
        if (tabelaprodutos.getSelectedRow() != -1) {
            txtDesc.setText(tabelaprodutos.getValueAt(tabelaprodutos.getSelectedRow(), 0).toString());
            txtQTD.setText(tabelaprodutos.getValueAt(tabelaprodutos.getSelectedRow(), 1).toString());
            txtPreco.setText(tabelaprodutos.getValueAt(tabelaprodutos.getSelectedRow(), 2).toString());

        }

    }//GEN-LAST:event_tabelaprodutosMouseReleased

    private void btnalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalterarActionPerformed
if(txtDesc.getText()!=null){

        alterarprodut();

}else{JOptionPane.showMessageDialog(null, "Carregue o campo que deseje excluir");}
Listarprodutoso();
limparcampos();
//        if (tabelaprodutos.getSelectedRow() != -1) {
//
//            tabelaprodutos.setValueAt(txtDesc.getText(), tabelaprodutos.getSelectedRow(), 0);
//            tabelaprodutos.setValueAt(txtQTD.getText(), tabelaprodutos.getSelectedRow(), 1);
//            tabelaprodutos.setValueAt(txtPreco.getText(), tabelaprodutos.getSelectedRow(), 2);
//        }
    }//GEN-LAST:event_btnalterarActionPerformed

    private void txtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescActionPerformed

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseClicked

    private void txtDescMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescMouseClicked

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
            java.util.logging.Logger.getLogger(ViewJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewJTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnalterar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaprodutos;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQTD;
    private javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables

    private void Listarprodutoso() {

        try {
            ProdutoDAO objusuarioDAO = new ProdutoDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaprodutos.getModel();
            model.setNumRows(0);
            ArrayList<ProdutoDTO> lista = objusuarioDAO.PesquisarFuncionario();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId(),
                    lista.get(num).getDescricao(),
                    lista.get(num).getQtd(),
                    lista.get(num).getPreco()

                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "listar produto" + e);
        }
    }


    public void carregarcampos() {
        int setar = tabelaprodutos.getSelectedRow();
        txtcodigo.setText(tabelaprodutos.getModel().getValueAt(setar, 0).toString());
        txtDesc.setText(tabelaprodutos.getModel().getValueAt(setar, 1).toString());
        txtQTD.setText(tabelaprodutos.getModel().getValueAt(setar, 2).toString());
        txtPreco.setText(tabelaprodutos.getModel().getValueAt(setar, 3).toString());

    }
    
    public void cadastrarproduto(){
    String descricao;
    int qtd;
    double preco;
    
        descricao = txtDesc.getText();
        qtd =Integer.parseInt(txtQTD.getText()) ;
        preco = Double.parseDouble( txtPreco.getText());

        ProdutoDTO objusuariodto = new ProdutoDTO();

        objusuariodto.setDescricao(descricao);
        objusuariodto.setQtd(qtd);
        objusuariodto.setPreco(preco);

        ProdutoDAO objUsuarioDAO = new ProdutoDAO();
        objUsuarioDAO.cadastrarproduto(objusuariodto);
    }
public void limparcampos(){
    txtcodigo.setText("");
    txtDesc.setText("");
    txtQTD.setText("");
    txtPreco.setText("");
    txtDesc.requestFocus();
}

public void alterarprodut(){
int id,qtd;
String descricao;
double preco;

id=Integer.parseInt(txtcodigo.getText());
descricao=txtDesc.getText();
qtd=Integer.parseInt(txtQTD.getText());
preco= Double.parseDouble(txtPreco.getText());


ProdutoDTO objUsuarioDTO =new ProdutoDTO();
objUsuarioDTO.setId(id);
objUsuarioDTO.setDescricao(descricao);
objUsuarioDTO.setQtd(qtd);
objUsuarioDTO.setPreco(preco);


ProdutoDAO objUsuarioDAO=new ProdutoDAO();
objUsuarioDAO.alterarproduto(objUsuarioDTO);


}

public void excluirproduto(){
int id;
id=Integer.parseInt( txtcodigo.getText());

    ProdutoDTO objuUsuarioDTO=new ProdutoDTO();
    objuUsuarioDTO.setId(id);
    
    ProdutoDAO objUsuarioDAO=new ProdutoDAO();
    objUsuarioDAO.excluirprodutos(objuUsuarioDTO);

}
}