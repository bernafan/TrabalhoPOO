/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mercado;

/**
 *
 * @author bfmel
 */
public class Gerente {
    private String nome;
    private int id;
   
    public Gerente(String nome, int id){
        this.nome = nome;
        this.id = id;
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
    public int getValoID(){
        return this.id;
    }
    public void setValorProduto(Produto p, float custo) {
        p.custo = custo;
    }
    public String toString() {
        String mensagem;
        mensagem = ("Nome: " + nome);
        mensagem += "\nID: " + id;
        return mensagem;
    }
}
