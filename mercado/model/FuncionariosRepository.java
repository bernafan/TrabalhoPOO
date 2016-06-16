package mercado.model;

import java.util.ArrayList;

import mercado.entidade.Funcionario;
import mercado.entidade.Gerente;
import mercado.entidade.Vendedor;

public class FuncionariosRepository {
	
	// melhor orientação a objetos
	private ArrayList<Funcionario> FuncionarioRepository;
	
	public void insere(Funcionario funcionario) {
		FuncionarioRepository.add(funcionario);
	}


	
	// pior orientação a objetos(repositorios separados)
	private ArrayList<Gerente> gerenteRepository;
	private ArrayList<Vendedor> vendedorRepository;
	
	public void insereNoVendedorRepository(Funcionario funcionario) {
		Vendedor vendedor = (Vendedor) funcionario;
		vendedorRepository.add(vendedor);
	}

	public void insereNoGerenteRepository(Funcionario funcionario) {
		Gerente gerente = (Gerente) funcionario;
		gerenteRepository.add(gerente);
	}
	
	
	public void imprimeFuncionarios() {
		System.out.println("Gerentes");
		System.out.println(FuncionarioRepository);
		System.out.println("Vendedores");
		System.out.println(FuncionarioRepository);
	}
	
	
}
