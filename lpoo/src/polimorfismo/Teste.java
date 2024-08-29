package polimorfismo;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		String telefone = sc.next();
		Double salario = sc.nextDouble();
		
		Funcionario func1 = new Funcionario(nome, telefone, salario);
		//System.out.println(func1.toString());
		
		String nome1 = sc.next();
		String telefone1 = sc.next();
		Double salario1 = sc.nextDouble();
		Double bonusAnual = sc.nextDouble();
		
		Gerente ger1 = new Gerente(nome1, telefone1, salario1, bonusAnual);
		//System.out.println(ger1.toString());
		
		String nome2 = sc.next();
		String telefone2 = sc.next();
		
		Cliente cli1 = new Cliente(nome2, telefone2);
		//System.out.println(cli1.toString());
		
		String nome3 = sc.next();
		String telefone3 = sc.next();
		int pontos = sc.nextInt();
		
		Cliente cli2 = new Cliente(nome3, telefone3, pontos);
		//System.out.println(cli2.toString());
		
		
		System.out.println(func1.toString());
		System.out.println(ger1.toString());
		System.out.println(cli1.toString());
		System.out.println(cli2.toString());
		
		salario = sc.nextDouble();
		ger1.setSalario(salario);
		System.out.println(ger1.toString());
			
	}
}
