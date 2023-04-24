//gerente é uma extensao de funcionario 
public class Designer extends Funcionario {

	private int senha = 123456; 
	
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

	public double getBonificacao() {
		System.out.println("Chamando a bonificacao do Designer");
		return super.getSalario() + 50; //este atributo esta na classe mãe 
	}

}
