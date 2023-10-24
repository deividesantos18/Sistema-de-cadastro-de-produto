/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ProdutoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author deivi
 */
public class ProdutoDAO {
    
    Connection conn;
     PreparedStatement pstm;
     ResultSet rs;
     ArrayList<ProdutoDTO>  lista=new ArrayList<>();
     
     
    public void cadastrarproduto(ProdutoDTO objUsuarioDTO){
        
        conn=new DAO().conectaBD();
        
        try {
            String sql="insert into produto ( descricao,  qtd,  preco)values(?,?,?) ";
            
           pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getDescricao());
            pstm.setInt(2, objUsuarioDTO.getQtd());
            pstm.setDouble(3, objUsuarioDTO.getPreco());
           
           pstm.execute();
           pstm.close();
           
           JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!!!");
           
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "erro no usuariodao"+erro);
            
            
    
        }
    }
    
    
    public ArrayList<ProdutoDTO> PesquisarFuncionario(){
        
        String sql="select*from produto";
        conn=new DAO().conectaBD();
        
        try {
            pstm=conn.prepareStatement(sql);
            rs=pstm.executeQuery();
            
            while(rs.next()){ 
            ProdutoDTO objusuarioDTO=new ProdutoDTO();
            objusuarioDTO.setId(rs.getInt("id_produto"));
           objusuarioDTO.setDescricao(rs.getString("descricao"));
           objusuarioDTO.setQtd(rs.getInt("qtd"));
           objusuarioDTO.setPreco(rs.getDouble("preco"));
           
           lista.add(objusuarioDTO);
            
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro no pesquisar produto" +e);
        }
       return lista; 
    }
    
    
    public void alterarproduto(ProdutoDTO objUsuarioDTO){
    
     conn=new DAO().conectaBD();
    String sql="update produto set descricao=?,qtd=?,preco=? where id_produto=?";
     
      try {
           
            
           pstm = conn.prepareStatement(sql);
           pstm.setString(1,objUsuarioDTO.getDescricao() );
           pstm.setInt(2, objUsuarioDTO.getQtd());
           pstm.setDouble(3, objUsuarioDTO.getPreco());
           pstm.setInt(4, objUsuarioDTO.getId());
           
           pstm.execute();
           pstm.close();
           
          
           
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "erro ao alterar o produto"+erro);
        
    }
    
    
    
}
    
    public void excluirprodutos(ProdutoDTO objUsuarioDTO){
    
        conn= new DAO().conectaBD();
        String sql ="delete from produto where id_produto=?  ";
    
          try {
           
            
           pstm = conn.prepareStatement(sql);
          
           pstm.setInt(1, objUsuarioDTO.getId());
           
           pstm.execute();
           pstm.close();
           
          
           
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "erro ao excluir o produto"+erro);
        
    }
    }
}
