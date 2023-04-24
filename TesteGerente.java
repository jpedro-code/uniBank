
public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setCpf("2344563");
		g1.setSalario(1200.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println(g1.getCpf());
		boolean autenticou = g1.autentica(123);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}
}
