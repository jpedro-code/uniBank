//nao pode instanciar dessa classe ,pq e abstrata
public abstract class Funcionario {//class abstrata 
	private String nome; 
	private String cpf; 
	private double salario; //protected = publico para os meus filhos
	
	//metodo sem corpo
	public abstract double getBonificacao();//nao ha implementacao deste metodo,mas os filhos implementan
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
