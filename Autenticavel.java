//interface, é uma classe abstrata com todos os seus métodos abstratos

//contrato autenticavel
//quem assina o contrato precisa implmentar:
//metodo setSenha()
//metodo autentica()

public abstract interface Autenticavel{
	 //nao pode ter atributos
	
	
	public abstract void setSenha(int senha);//metodo abstrato(os filhos tem que definir)

	public abstract boolean autentica(int senha);
}