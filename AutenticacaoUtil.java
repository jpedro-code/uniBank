
public class AutenticacaoUtil {
	
	private int senha; 
	
	public void setSenha(int senha) {
		this.senha = senha;	
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}else {
			System.out.println("Você não sabe a senha");
			return false; 
		}
	}
}
