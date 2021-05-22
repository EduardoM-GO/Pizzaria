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
public class IngredienteDAO {
    
    
    private static IngredienteDAO instance;

    private IngredienteDAO() {
        MySQLDAO.getConnection();
    }

    public static IngredienteDAO getInstance() {
        if (instance == null) {
            instance = new IngredienteDAO();
        }
        return instance;
    }

    public long create(IngredienteBEAN ingrediente) {
        String query = "INSERT INTO ingrediente (nome, unidade, status, idFornecedor) VALUES (?,?,?,?)";
        return MySQLDAO.executeQuery(query, ingrediente.getNome(), ingrediente.getUnidade(), ingrediente.getId_fornecedor());
    }

    public void update(IngredienteBEAN ingrediente) {
        String query = "UPDATE ingrediente SET nome=?, unidade=?,status=?, idFornecedor=? WHERE idFornecedor = ?";
        MySQLDAO.executeQuery(query, ingrediente.getNome(), ingrediente.getUnidade(), ingrediente.getId_fornecedor(), ingrediente.getStatus(), ingrediente.getId());
    }

    public void delete(IngredienteBEAN ingrediente) {
        MySQLDAO.executeQuery("DELETE FROM ingrediente WHERE idIngrediente = ?", ingrediente.getId());
    }

    public ArrayList<IngredienteBEAN> findAllIngrediente() {
        return listaIngrediente("SELECT * FROM ingrediente ORDER BY idIngrediente");
    }

    public ArrayList<IngredienteBEAN> listaIngrediente(String query) {
        ArrayList<IngredienteBEAN> lista = new ArrayList<IngredienteBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new IngredienteBEAN(
                        rs.getInt("idIngrediente"), rs.getString("nome"), rs.getString("unidade"), rs.getString("status"), rs.getInt("idFornecedor")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public IngredienteBEAN findIngrediente(int id) {
        IngredienteBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM ingrediente WHERE idIngrediente=?", id);
        try {
            if (rs.next()) {
                result = new IngredienteBEAN(rs.getInt("idIngrediente"), rs.getString("nome"), rs.getString("unidade"), rs.getString("status"), rs.getInt("idFornecedor"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int findId(IngredienteBEAN ingrediente) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(
                "SELECT * FROM fornecedor WHERE nome = ? and idFornecedor = ?", ingrediente.getNome(), ingrediente.getId_fornecedor());
        try {
            if (rs.next()) {
                result = rs.getInt("idIngrediente");
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
        rs = MySQLDAO.getResultSet("SELECT * FROM ingrediente WHERE idIngrediente= ?", id);
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