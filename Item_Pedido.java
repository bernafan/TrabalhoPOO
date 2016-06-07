package Mercado.Venda;

public class Item_Pedido {
	public Produto p;
    public int qtd;
    
    public float subTotal() {
        return (float) (p.getValor()*qtd);
    }
}
