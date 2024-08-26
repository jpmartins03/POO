package animais;

public class Animal {
	
	//atributos
	private String nome;
	
	//construtor
	public Animal(String novoNome) {
		this.nome = novoNome;
	}
	//metodos
	public void comer() {
		System.out.printf("%s comeu\n", nome);
	}
	
	public void beber() {
		System.out.printf("%s bebeu\n", nome);
	}
	
		//getters
	public String getNome() {
		return this.nome;
	}
	
		//setters
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	
}
