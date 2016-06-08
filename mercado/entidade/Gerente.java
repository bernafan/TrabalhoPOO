package mercado.entidade;



public class Gerente extends Funcionario {
	private static int geradorId = 0;
	
    
	public Gerente(String nome){
        this.nome = nome;
        Gerente.geradorId++;
        this.id = "G" + geradorId;
    }
	
	public String getId() {
		return this.id;
	}
	
	void addProduto(String nome, double custo, double valorDeVenda) {
		Produto p = new Produto();
		//p.
	}
    protected void setValorProduto(Produto p, float custo) {
      //  p.setCusto(custo);
        
    }
    
}
