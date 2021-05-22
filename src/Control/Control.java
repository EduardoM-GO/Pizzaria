/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;
import java.util.Date;

import Model.FornecedorBEAN;
import Model.FornecedorDAO;
import Model.IngredienteBEAN;
import Model.IngredienteDAO;
/**
 *
 * @author user
 */
public class Control {
    
    public Control() {
    }

    public void addFornecedor(FornecedorBEAN fornecedor) {
        FornecedorDAO.getInstance().create(fornecedor);
    } 

    public void updateFornecedor(FornecedorBEAN fornecedor) {
        System.out.println("aqui é o update");
        System.out.println("status "+fornecedor.getStatus());
        System.out.println("endereco"+fornecedor.getEndereco());
        System.out.println("id"+fornecedor.getId());
        System.out.println("razao "+fornecedor.getRazaoSocial());
        FornecedorDAO.getInstance().update(fornecedor);
    }

    public void deleteFornecedor(FornecedorBEAN fornecedor) {
        FornecedorDAO.getInstance().delete(fornecedor);
    }

    public FornecedorBEAN findFornecedor(int id) {
        return FornecedorDAO.getInstance().findFornecedor(id);
    }

    public int findIdFornecedor(FornecedorBEAN fornecedor) {
        return FornecedorDAO.getInstance().findId(fornecedor);
    }

    public Boolean isExist(int id) {
        return FornecedorDAO.getInstance().isExist(id);
    }

    public ArrayList<FornecedorBEAN> listaFornecedor() {
        return FornecedorDAO.getInstance().findAllPessoa();
    }

    public void addIngrediente(IngredienteBEAN ingrediente) {
        IngredienteDAO.getInstance().create(ingrediente);
    }

    public void updateIngrediente(IngredienteBEAN ingrediente) {
        IngredienteDAO.getInstance().update(ingrediente);
    }

    public void deleteIngrediente(IngredienteBEAN ingrediente) {
        IngredienteDAO.getInstance().delete(ingrediente);
    }

    public IngredienteBEAN findIngrediente(int id) {
        return IngredienteDAO.getInstance().findIngrediente(id);
    }

    public int findIdIngrediente(IngredienteBEAN ingrediente) {
        return IngredienteDAO.getInstance().findId(ingrediente);
    }

    public Boolean isExistIngrediente(int id) {
        return IngredienteDAO.getInstance().isExist(id);
    }

    public ArrayList<IngredienteBEAN> listaIngrediente() {
        return IngredienteDAO.getInstance().findAllIngrediente();
    }
}