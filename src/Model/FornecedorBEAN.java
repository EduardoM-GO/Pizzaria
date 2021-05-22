/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
/**
 *
 * @author user
 */
public class FornecedorBEAN {
    
    private int id;
    private String razaoSocial;
    private String endereco;
    private int status;

    public FornecedorBEAN(int id, String nome, String endereco) {
        this.id = id;
        this.razaoSocial = nome;
        this.endereco = endereco;
        this.status = 1;
    }

    public FornecedorBEAN(int id, String nome, String endereco, int status) {
        this.id = id;
        this.razaoSocial = nome;
        this.endereco = endereco; // aqui nao seria statys? assim? n sei se vc faz conversao ou trabalha realmente com 1 e 0, só 1 e 0 msm 1 ativo e 0 inativo blz entãi muda tudo o model e tudo
        this.status = status;
    }

    public FornecedorBEAN() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

} 