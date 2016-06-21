package mercado.servico;

import mercado.entidade.Funcionario;
import mercado.model.FuncionariosRepository;

public class ServicoFuncionarioAppService {
	
	private FuncionariosRepository funcionariosRepository;
	
	// melhor OO
	
	public void insereFuncionario(Funcionario func) {
		funcionariosRepository.insere(func);
	}
	
	public void removeFuncionario(Funcionario func) {
		funcionariosRepository.remove(func);
	}
	
	public Funcionario retornaFuncionario(String idFuncionario) {
		funcionariosRepository.
	}
	
	// Pior OO
	
	/*public String VerificaTipoFuncionario(Funcionario Funcionario) {
	if (Funcionario.getId().toUpperCase().equals("G")){
		return "GERENTE";
	}
	if (Funcionario.getId().toUpperCase().equals("V")){
		return "VENDEDOR";
	}
	return null;
}
	public void incluirFuncionario(Funcionario funcionario) {
		
		if(VerificaTipoFuncionario(funcionario).equals("GERENTE")) {
			funcionariosRepository.insereNoGerenteRepository(funcionario);
		}
		if(VerificaTipoFuncionario(funcionario).equals("VENDEDOR")) {
			funcionariosRepository.insereNoVendedorRepository(funcionario);
		}
	}*/
	
	
}
