//gerente é uma extensao de funcionario 
public class EditorVideo extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando a bonificacao do Editor de video");
		return super.getSalario() + 100; //este atributo esta na classe mãe 
	}

}
