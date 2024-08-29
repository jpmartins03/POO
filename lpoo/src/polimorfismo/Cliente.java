package polimorfismo;

public class Cliente extends Pessoa{
	private int pontuacao;
	
	public Cliente(String nome, String telefone) {
		super(nome, telefone);
		this.pontuacao = 0;
	}
	
	public Cliente(String nome, String telefone, int pontuacao) {
		super(nome, telefone);
		this.pontuacao = pontuacao;
	}
	
	public int getPontuacao() {
		return this.pontuacao;
	}

	public String toString() {
		return "Cliente:"+super.toString()+",pontuacao="+getPontuacao();
	}
	
	
}
