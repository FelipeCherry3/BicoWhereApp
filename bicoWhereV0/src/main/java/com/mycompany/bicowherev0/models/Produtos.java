
package com.mycompany.bicowherev0.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc Elaine
 */
public class Produtos {

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    // declaração das variáveis - sujeito a alterações
    private int id_produto;
    private String nome_produto;
    private int qtd_produto;
    private String categoria;
    private double preco;
    private String data_val;
    private String data_add;
    private double val_total;
    
    List <Produtos> listaProdutos;
    
    // Classe construtotra
    public Produtos(int id_produto, String nome_produto,int qtd_produto,double preco,String data_val,String data_add){
        this.id_produto = id_produto;
        this.nome_produto = nome_produto;
        this.qtd_produto = qtd_produto;
        this.preco = preco;

        this.data_val = data_val;
        this.data_add = data_add;
        this.listaProdutos = new ArrayList<>();
        this.val_total = preco * qtd_produto;
    }
    // metodos getters and setters
    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public int getQtd_produto() {
        return qtd_produto;
    }

    public void setQtd_produto(int qtd_produto) {
        this.qtd_produto = qtd_produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getData_val() {
        return data_val;
    }

    public void setData_val(String data_val) {
        this.data_val = data_val;
    }

    public String getData_add() {
        return data_add;
    }

    public void setData_add(String data_add) {
        this.data_add = data_add;
    }
    public Double getVal_total() {
        return val_total;
    }
    
}
