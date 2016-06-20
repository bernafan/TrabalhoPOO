package mercado.servico;

import mercado.entidade.Item_Pedido;
import mercado.entidade.Pedido;

public class ServicoPedidoAppServico {
	
	public double precoTotal(Pedido pedido) {
		 float somaTotal = 0;
		 for(Item_Pedido item : pedido.itens) {
			 somaTotal += subTotal(item);
	     }
	     return somaTotal;
	 }
	
	public double subTotal(Item_Pedido item) {
		return item.getQtdProduto() * item.getPeso() * (item.getProduto().getValor());
	}
}
