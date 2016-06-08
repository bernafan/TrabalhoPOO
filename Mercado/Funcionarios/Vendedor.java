package Mercado.Funcionarios;


public class Vendedor extends Funcionario {
	private static int geradorId = 0;
	
	public Vendedor(String nome){
        this.nome = nome;
        Vendedor.geradorId++;
        this.id = "F" + geradorId;
    }
}
