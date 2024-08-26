package animais;

public class Gato extends Animal{
	//construtor
	public Gato(String novoNome) {
		super(novoNome);
	}
	//metodos
	public void miar() {
		System.out.printf("%s miou\n", getNome());
	}
}
