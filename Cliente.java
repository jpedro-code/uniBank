
public class Cliente implements Autenticavel {//associando esta class a interface Autenticavel (implements)
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);	
	}
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha); 
		return autenticou; 
	}
}
