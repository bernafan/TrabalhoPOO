package mercado.servico;

import mercado.entidade.Funcionario;
import mercado.model.FuncionariosRepository;

public class ServicoFuncionarioAppService {
	
	private FuncionariosRepository funcionariosRepository;
	
	
	/*public String VerificaTipoFuncionario(Funcionario Funcionario) {
		
		if (Funcionario.getId().toUpperCase().equals("G")){
			return "GERENTE";
		}
		if (Funcionario.getId().toUpperCase().equals("V")){
			return "VENDEDOR";
		}
		return null;
	}*/
	
	public void incluirFuncionario(Funcionario funcionario) {
		/*
		if(VerificaTipoFuncionario(funcionario).equals("GERENTE")) {
			funcionariosRepository.insereNoGerenteRepository(funcionario);
		}
		if(VerificaTipoFuncionario(funcionario).equals("VENDEDOR")) {
			funcionariosRepository.insereNoVendedorRepository(funcionario);
		}*/
		
		funcionariosRepository.insere(funcionario);
	}
}
