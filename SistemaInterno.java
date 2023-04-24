
public class SistemaInterno {
	private int senha = 1234; 
	
	public void autentica(Autenticavel at) {//posso usar interfaces como tipo
		
		
		boolean autenticou = at.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema");
		}else {
			System.out.println("Nao pode entrar no sistema");
		}
	}
}
