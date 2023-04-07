
package com.mycompany.bicowherev0.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc Elaine
 */
public class Usuario {
    
    // Declaraçõs de variaveis e array lists
    private int id;
    private String nome;
    private String sobrenome;
    private String usuario;
    private String password;
    private List<Produtos> listaProdutos;
    private List<Usuario> listUsuarios;
    
    // Classe Construtora
    public Usuario(int id, String nome, String sobrenome, String usuario, String password){
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.usuario = usuario;
        this.password = password; 
        this.listUsuarios = new ArrayList<>();
        this.listaProdutos = new ArrayList<>();
    }
    
    //metódo para adicionar um objeto do tipo 
    //Produto na Lista de produtos do usuário que estiver logado
    public void adicionarProduto(Produtos produto) {
        getListaProdutos().add(produto);
    }
    //metódo para remover um objeto do tipo 
    //Produto na Lista de produtos do usuário que estiver logado
    public void removerProduto(int id_produto) {
        for (int i = 0; i < getListaProdutos().size(); i++) {
            if (getListaProdutos().get(i).getId_produto() == id_produto) {
                getListaProdutos().remove(i);
                return;
            }
        }
    }
    

    //metódo para buscar um objeto do tipo 
    //Produto na Lista de produtos do usuário que estiver logado
    //Com a utilização de uma estrutura de repetição (for) 
    public Produtos buscarProduto(int id_produto) {
        for (int i = 0; i < getListaProdutos().size(); i++) {
            if (getListaProdutos().get(i).getId_produto() == id_produto) {
                return getListaProdutos().get(i);
            }
        }
        return null;
    }

    // método que imprimi no console as informações de todos os Objetos 
    // Encontrados na lista de Produtos do usuário
    public void listarProdutos() {
    System.out.println("Produtos cadastrados por " + this.nome + ":");
    for (Produtos p : getListaProdutos()) {
        System.out.println("ID: " + p.getId_produto());
        System.out.println("Nome: " + p.getNome_produto());
        System.out.println("Quantidade: " + p.getQtd_produto());
        System.out.println("Preco: R$ " + p.getPreco());
        System.out.println("Valor Total : R$ " + p.getVal_total());
        System.out.println("Data de validade: " + p.getData_val());
        System.out.println("Data de adicao: " + p.getData_add());
        System.out.println("--------------------");
    }
}
    //Métodos getters and setters
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public List<Produtos> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produtos> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}
