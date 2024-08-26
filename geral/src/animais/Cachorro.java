package animais;

//extends representa que a classe Cachorro herda todas as informações da classe Animal.
//Cachorro -> subclasse
//Animal -. superclasse
public class Cachorro extends Animal {
	//atributos
	private int ossosComidos;
	//construtor
	public Cachorro(String novoNome) {
		super(novoNome); //a primeira linha PRECISA ter a chamada do construtor da classe super.
		this.ossosComidos = 0;
	}
	//metodos
	public void latir() {
		System.out.printf("%s latiu\n", getNome()); //nome é privado na classe super, mesmo a classe filha nao tem acesso a ela diretamente
	}
	public void lamber() {
		System.out.printf("%s lambeu\n", getNome());
	}
	
	//getters
	public int getOssosComidos() {
		return this.ossosComidos;
	}
	//setters
	public void setOssosComidos(int ossos) {
		this.ossosComidos = ossos;
	}
}
