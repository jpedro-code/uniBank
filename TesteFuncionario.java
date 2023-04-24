
public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente pedro = new Gerente();
		 pedro.setNome("João Pedro");
		 pedro.setSalario(15000);
		 pedro.setCpf("70257409424");;
		 
		 System.out.println(pedro.getNome());
		 System.out.println(pedro.getSalario());
		 System.out.println(pedro.getCpf());
		 System.out.println(pedro.getBonificacao());
	}
}
