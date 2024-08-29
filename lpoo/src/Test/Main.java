package Test;

import java.util.Scanner;

class Main {
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

abstract class Pessoa {
	private String nome;
	private String telefone;
	
	
	//constructor
	
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	@Override
	public String toString() {
		return nome + ", celular=" + telefone;
	}
}

class Funcionario extends Pessoa{
	private Double salario;
	
	public Funcionario(String nome, String telefone, Double salario) {
		super(nome, telefone);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionário:"+ getNome() + ", celular=" + getTelefone()
				+ ",salario=" + getSalario();
	}


}

class Gerente extends Funcionario{
	private Double bonusAnual;
	
	public Gerente(String nome, String telefone, Double salario, Double bonusAnual) {
		super(nome, telefone, salario);
		this.bonusAnual = bonusAnual;
	}


	public Double getBonusAnual() {
		return bonusAnual;
	}

	public void setBonusAnual(Double bonusAnual) {
		this.bonusAnual = bonusAnual;
	}
	

	public String toString() {
		//return "Gerente[Funcionário:"super.getNome()+", celular="+super.getTelefone()+",salario="+super.getSalario()+",bonus="+bonusAnual+"]"
		return "Gerente["+super.toString()+",bonus="+bonusAnual+"]";
	}
	
}

class Cliente extends Pessoa{
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
