package animais;

public class Ave extends Animal{

	public Ave(String novoNome) {
		super(novoNome);

	}
	public void voar() {
		System.out.printf("%s voou\n", getNome());
	}

}
