package atv2;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			String nome = sc.next();
			int idade = sc.nextInt();
			String senha = sc.next();
			Usuario user1 = new Usuario (nome, idade);
			user1.setSenha(senha);
			String email = sc.next();
			user1.criarEmail(email);
			System.out.println(user1.toString());
			
		}catch(Exception erro) {
			System.out.println("Entrada Inválida");
		}
		
		sc.close();
	}
}
