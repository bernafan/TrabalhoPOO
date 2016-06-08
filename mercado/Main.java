package mercado;

import mercado.entidade.Funcionario;
import mercado.entidade.Gerente;
import mercado.entidade.Vendedor;


public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Gerente("Bernardo");
		System.out.println(f1);
		Funcionario f2 = new Vendedor("Luiz");
		System.out.println(f2);
		//Produto p1 = new Produto("Laranja", 1.0);

	}

}
