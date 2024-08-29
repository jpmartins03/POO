package atividades_ava;
import java.util.Scanner;

public class Fatura {
	
	private String descricao;
	private int qtde;
	private double preco;
	
	//construtor vazio
	public Fatura() {
		
	}
	
	//construtor que recebe parametros
	public Fatura(String descricao, int qtde, double preco) {
		this.descricao = descricao;
		this.qtde = qtde;
		this.preco = preco;
	}
	//Getters
	public String GetDescricao() {
		return descricao;
	}
	public int GetQtde() {
		return qtde;
	}
	public double GetPreco() {
		return preco;
	}
	public double GetPrecoTotal() {
		return preco * qtde;
	}
	//Setters
	public void SetDescricao(String Descricao)
	{
		this.descricao = Descricao;
	}
	public void SetQtde(int Qtde) {
		this.qtde = Qtde;
	}
	public void SetPreco(double Preco) {
		this.preco = Preco;
	}
	
	//formatacao
	public String ToString() {
		return String.format("%d %s a R$ %.1f = R$ %.1f\n", qtde, descricao, preco, GetPrecoTotal());
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String descricao = sc.nextLine();
		int qtde = sc.nextInt();
		double preco = sc.nextDouble();
		
		Fatura novaFatura = new Fatura(descricao, qtde, preco);
		
		System.out.printf("%s\n", novaFatura.ToString());
	
	}

}
	
	
