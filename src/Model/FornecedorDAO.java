/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author user
 */
public class FornecedorDAO {
    
    private static FornecedorDAO instance;

    private FornecedorDAO() {
        MySQLDAO.getConnection();
    }

    public static FornecedorDAO getInstance() {
        if (instance == null) {
            instance = new FornecedorDAO();
        }
        return instance;
    }

    public long create(FornecedorBEAN fornecedor) {
        String query = "INSERT INTO fornecedor (razaoSocial, endereco, status) VALUES (?,?,1)";
        return MySQLDAO.executeQuery(query, fornecedor.getRazaoSocial(), fornecedor.getEndereco());
    }

    public void update(FornecedorBEAN fornecedor) {
        System.out.println("entrou aqui (ULTIMO)");
        String query = "UPDATE fornecedor SET razaoSocial=?, endereco=?, status=? WHERE idFornecedor = ?";
       
        MySQLDAO.executeQuery(query, fornecedor.getRazaoSocial(), fornecedor.getEndereco(), fornecedor.getStatus(), fornecedor.getId());
    }

    public void delete(FornecedorBEAN fornecedor) {
        MySQLDAO.executeQuery("DELETE FROM fornecedor WHERE idFornecedor = ?", fornecedor.getId());
    }

    public ArrayList<FornecedorBEAN> findAllPessoa() {
        return listaContatos("SELECT * FROM fornecedor ORDER BY idFornecedor");
    }

    public ArrayList<FornecedorBEAN> listaContatos(String query) {
        ArrayList<FornecedorBEAN> lista = new ArrayList<FornecedorBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new FornecedorBEAN(rs.getInt("idFornecedor"), rs.getString("razaoSocial"), rs.getString("endereco"), rs.getInt("status")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public FornecedorBEAN findFornecedor(int id) {
        FornecedorBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM fornecedor WHERE idFornecedor=?", id);
        try {
            if (rs.next()) {
                result = new FornecedorBEAN(rs.getInt("idFornecedor"), rs.getString("razaoSocial"), rs.getString("endereco"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findId(FornecedorBEAN fornecedor) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(
                "SELECT * FROM fornecedor WHERE razaoSocial = ? and endereco = ?", fornecedor.getRazaoSocial(), fornecedor.getEndereco());
        try {
            if (rs.next()) {
                result = rs.getInt("idFornecedor");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
        return result;
    }

    public Boolean isExist(int id) {
        Boolean result = false;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM fornecedor WHERE idFornecedor= ?", id);
        try {
            if (rs.next()) {
                result = true;
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}