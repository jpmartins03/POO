package classes;
import java. util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Autor a1 = new Autor();
		a1.nome = "kentaro miura";
		a1.email = "kentaro@miura.com";
		System.out.println(a1);
		
		Autor a2 = new Autor();
		a2.nome = "kohei horikoshi";
		a2.email = "kohei@horikoshi.com";
		System.out.println(a2);
		
		Livro livro1 = new Livro();
		livro1.setTitulo("Berserk1");
		livro1.setAutor(a1);
		livro1.setPaginas(365);
		System.out.println(livro1);
		
		Livro livro2 = new Livro("Boku no hero", a2, 345);
		System.out.println(livro2);
	}

}
