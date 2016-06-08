package Mercado.Funcionarios;
import Mercado.Venda.Produto;

public class DemoFuncionarios {
	public static void main(String[] args) {
		Funcionario f1 = new Gerente("Bernardo");
		System.out.println(f1);
		Funcionario f2 = new Vendedor("Luiz");
		System.out.println(f2);
		//Produto p1 = new Produto("Laranja", 1.0);
		
		
	}
}
