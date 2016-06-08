package mercado.entidade;

public class Produto  {
	private String nome;
	private double valor;
    private double custo;
    
    
    public String getNome(){
        return this.nome;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    protected double getCusto() {
    	return this.custo;
    }

    protected void setNome(String nome) {
		this.nome = nome;
	}

	protected void setValor(double valor) {
		this.valor = valor;
	}

	protected void setCusto(double custo) {
		this.custo = custo;
	}

	public String toString() {
        String mensagem;
        mensagem = ("Nome: " + nome);
        mensagem += "\nValor: " + valor;
        return mensagem;
    }
}
