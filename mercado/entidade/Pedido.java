package mercado.entidade;


public class Pedido {
	public int codigo;
	public Item_Pedido[] itens;
	 
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public Item_Pedido[] getItens() {
		return itens;
	}
	public void setItens(Item_Pedido[] itens) {
		this.itens = itens;
	}
	    
	 
}
