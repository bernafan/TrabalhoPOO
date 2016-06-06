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
public class Item {
    public Produto p;
    public int qtd;
    
    public float subTotal() {
        return (float) (p.getValor()*qtd);
    }
}
