package animais;

public class Dragao extends Ave{
	//atributos
	private String raca;
	//construtor
	public Dragao (String novoNome) {
		super(novoNome);
		this.raca = "undefined";
	}
	
	//metodos
	public void cuspirFogo() {
		System.out.printf("%s cuspiu fogo!!!\n", getNome());
	}
	
	//getters
	public String getRaca() {
		return this.raca;
	}
	
	//setters
	public void setRaca(String novaRaca) {
		this.raca = novaRaca;
	}

}
