package mercado.servico;


public class ServicosProdutoAppService {
	
	public boolean validarUsuario(String idUsuario) {
		if(!idUsuario.substring(0).equals('G')) {
			return false;
		}
		return true;
	}
	
	public void IncluirProduto(String idUsuario) {
		if (validarUsuario(idUsuario)) {
			
		}
	}
}
