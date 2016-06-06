/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mercado.Funcionario;

import Mercado.Produto;

/**
 *
 * @author Bernardo
 */
public class Funcionario {
    private String nome;
    private int id;
    
    public Funcionario(String nome, int id) {
        this.id = id;
        this.nome = nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setID(int id){
        this.id = id;
    }
    public String getNome(){
        return this.nome;
    }
    public int getID(){
        return this.id;
    }
    public void setValorProduto(Produto p, float custo) {
        p.custo = custo;
     
    }
}
