/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mercado;

/**
 *
 * @author Bernardo
 */
public class Produto {
    private String nome;
    private float valor;
    protected float custo;
    
    public Produto(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    protected void setNome(String nome){
        this.nome = nome;
    }
    protected void setValor(float valor){
        this.valor = valor;
    }
    protected void setCusto(){
        this.custo = custo;
    }
    public String getNome(){
        return this.nome;
    }
    public double getValor(){
        return this.valor;
    }
    public float getCusto(){
        return this.custo;
    }
    public String toString() {
        String mensagem;
        mensagem = ("Nome: " + nome);
        mensagem += "\nValor: " + valor;
        mensagem += "\nCusto: " + custo;
        return mensagem;
    }
}
