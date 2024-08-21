package atv2;


public class Usuario extends Pessoa{
	private String senha;

	
	public Usuario(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void criarEmail(String email) {
		setEmail(email);	
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return ("Usuario: "+super.getNome()+", idade: "+super.getIdade()+" email: "+super.getEmail()+" senha: "+this.getSenha());
	}
	
	
}
