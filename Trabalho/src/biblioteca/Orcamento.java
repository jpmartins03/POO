package biblioteca;

import java.util.ArrayList;

public class Orcamento implements Compra {
	//Atributos
	private ArrayList <Livro> pedido;

	//Construtor
	public Orcamento() {
		this.pedido = new ArrayList<Livro>();
	}
	
	void adicionarLivro(Livro livro) {
		pedido.add(livro);	
	}
	
    public double calcularPreco() {
        double total = 0;
        for (Livro livro : pedido) { //percorre a lista de pedidos e adiciona preco
            total += livro.getPreco();
        }
       
        return total;
    }

	void listarPedidos() {
		System.out.println("==========================================================================================================================");
		System.out.println("Livros pedidos: ");
		for (Livro livro : pedido) { //imprime a lista de pedidos
			System.out.println("---------------------------------------------------------------------------------------------------------------------------");
            System.out.println(livro);
        }
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		System.out.println("O total a pagar é de: " + calcularPreco());
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		System.out.println("==========================================================================================================================");
	}
}

/*
Classe Orcamento
• implementa a interface Compra
• atributos privados List<Livro> pedido, que é do tipo ArrayList
• 1 construtor sem parâmetros que instancia o ArrayList pedido
• Método:
a) adicionarLivro()
permite adicionar livros no ArrayList pedido
b) double calcularPreco()
Calcula o valor total dos livros do Pedido
c) void listarPedidos()
Lista todos os livros do Pedido e imprime o valor total do pedido com a chamada do
método calcularPreco().
*/