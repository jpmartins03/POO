package classes;

public class Autor {
	String nome;
	String email;
	
	public Autor() {	
	}
	public Autor(String nome1, String email1) {
		this.nome = nome1;
		this.email = email1;
		
	}
	
	@Override
	public String toString() {
		return "Autor [" + nome + ", email=" + email + "]";
	}
}
