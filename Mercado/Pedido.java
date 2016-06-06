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
public class Pedido {
    public int codigo;
    public Item[] itens;
    public Cliente cliente;
    
    public float precoTotal() {
        float soma = 0;
        for(Item item : itens) {
            soma += item.subTotal();
        }
        return soma;
    }
}
