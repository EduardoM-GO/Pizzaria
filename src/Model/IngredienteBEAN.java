/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author user
 */
public class IngredienteBEAN {
    
    private int id;
    private String nome;
    private String unidade;
    private String status;
    private int id_fornecedor;
    

    public IngredienteBEAN(int id, String nome, String unidade, int id_fornecedor) {
        this.id = id;
        this.nome = nome;
        this.unidade = unidade;
        this.status = "ativo";
        this.id_fornecedor = id_fornecedor;
    }

    public IngredienteBEAN(int id, String nome, String unidade, String status, int id_fornecedor) {
        this.id = id;
        this.nome = nome;
        this.unidade = unidade;
        this.status = status;
        this.id_fornecedor = id_fornecedor;
    }
    
    public IngredienteBEAN() {}

    public IngredienteBEAN(String nome, String unidade, String ativo, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}