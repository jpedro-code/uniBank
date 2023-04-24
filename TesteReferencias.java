
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();//uma variavel mais generica(funcionario)
		Gerente g2 = new Gerente();//uma variavel mais generica(funcionario)
		
		
		g1.setNome("Felipe");
		String nome = g1.getNome();
		
//		g2.autentica(2222);
		
		System.out.println(nome);
		
		g2.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g2);
		System.out.println(controle.getSoma());
		
		EditorVideo ev = new EditorVideo(); 
		ev.setSalario(1000.0);
		controle.registra(ev);
		System.out.println(controle.getSoma());
		
		Gerente gerente = new Gerente(); // usando uma referencia mais generica(polimorfismo)
		
		gerente.setSalario(2000.0);
		
		controle.registra(gerente);
		
		System.out.println(controle.getSoma());
		
	
	}
}
