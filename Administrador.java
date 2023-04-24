public class Administrador extends Funcionario implements Autenticavel {//associando esta class a interface Autenticavel (implements)
	private AutenticacaoUtil autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticacaoUtil();//adm com uma autenticacao util
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);	
	}
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha); 
		return autenticou; 
	}
	@Override
	public double getBonificacao() {
		System.out.println("Chamando a bonificacao do gerente");
		return super.getSalario(); //este atributo esta na classe mãe 
	
}
}
	


