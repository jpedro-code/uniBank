//gerente é uma extensao de funcionario e assina com a interface Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();//gerente com uma autenticacao util
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
		return super.getSalario() + 20; //este atributo esta na classe mãe 
	
}

}
