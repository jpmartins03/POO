package biblioteca;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Autor implements Valida{
	//Declaracao dos atributos
	private String nome; 
	private String email; 
	private String instituicao;
	
	//Construtor
	public Autor(String nome, String email, String instituicao) {
		this.nome = nome;
		this.instituicao = instituicao;
		
		//Valida email antes de atribuir
		if(validarEmail(email)) {
			this.email = email;;
		}
		else {
			System.out.println("Email inválido");
		}
	}
	
	//Pegar o email fora da classe
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Autor nome = " + nome + ", email = " + email + ", instituicao = " + instituicao;
	}
	
	private static final String EMAIL_PATTERN = 
	        "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
	        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean validarEmail(String email){
		Matcher matcher = pattern.matcher(email);
	    return matcher.matches();
	 }
}
/*• Implementa a interface Valida
• Atributos privados:
String nome; String email; String instituicao;
• Construtor
a) public Pessoa(String nome, String email, String instituicao)
obs: no construtor deve-se validar o email antes de atribuir o valor do email
É preciso chamar o método para validarEmail(String email)
Se o email estiver correto, ele será atribuído,
Caso contrário deverá solicitar um novo email
• Métodos:
a) @Override
public boolean validarEmail(String email)
este método terá que validar o email
b) @Override
public String toString()
este método deverá imprimir nome, email e instituição do autor*/