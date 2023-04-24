
public class ControleBonificacao {
	private double soma;
	
	public double getSoma() {
		return soma;
	}
	public void registra(Funcionario f) {// metodo generico
		
		double boni = f.getBonificacao();// metodo que sera chamado sera da bonificacao espefica (gerente,funionario,ev)
		this.soma += boni; 
	}
}
