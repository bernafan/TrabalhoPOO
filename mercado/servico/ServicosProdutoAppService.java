package mercado.servico;

import mercado.entidade.Produto;


public class ServicosProdutoAppService {
	
	public boolean validarUsuario(String idUsuario) {
		if( (!idUsuario.substring(0).toUpperCase().equals('G')) ) {
			return false;
		}
		return true;
	}
	
	public void IncluirProduto(String idUsuario, Produto produto) {
		if (validarUsuario(idUsuario)) {
			// funcao incluir produto no estoque 
			
		}else
			System.out.println("Usuário não pode incluir produto!");
	}
	
	// Deveria ficar em estoque?!
	public int verficarQuantidadeNoEstoque(Produto produto) {
		return 0;
		
	}
}
