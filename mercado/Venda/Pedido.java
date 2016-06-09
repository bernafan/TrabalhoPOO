package mercado.Venda;

import mercado.entidade.Cliente;

public class Pedido {
	 public int codigo;
	 public Item_Pedido[] itens;
	 public Cliente cliente;
	    
	 public double precoTotal() {
		 float soma = 0;
		 for(Item_Pedido item : itens) {
			 soma += item.subTotal();
	     }
	     return soma;
	 }
	 
}
