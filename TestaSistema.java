import java.util.Scanner;
public class TestaSistema {
	public static void main(String[] args) {
		double x,estimativa,g ;
		double menor = Integer. MIN_VALUE; 
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("Digite um numero para acharmos a raiz dele: ");
		x = ler.nextDouble(); 
		
		estimativa = x/2 ; 
		g = estimativa * estimativa;
		
		while(Math.abs(g * g) != Math.abs(x)) {
			System.out.println(estimativa);
			estimativa = (g + x/g)/2;
			System.out.println(estimativa);
			g = estimativa;
			System.out.println(g);
		}
		
		System.out.println(estimativa);
		
}
}
